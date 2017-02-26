package main;

/**
 * Created by yassine on 2/22/17.
 */

import main.exceptions.NoDayException;
import main.exceptions.NoMonthException;
import main.exceptions.NoYearException;

import javax.swing.*;
import java.awt.event.*;

public class WindowFrame extends JFrame{
    private static final long serialVersionUID = 1L;
    private JPanel panel = new JPanel();
    private JLabel label = new JLabel("Entrer la date: ");
    private JTextField day = new JTextField("", 2);
    private JTextField month = new JTextField("",2);
    private JTextField year = new JTextField("",4);
    private JButton submit = new JButton("Entrer");
    private JTextArea textArea = new JTextArea(3,27);
    private JScrollPane scrollBar = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_NEVER,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    public static void main(String[] arg){
        new WindowFrame();
    }


    private WindowFrame(){

        this.setSize(400,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setTitle("Date Checker");
        this.setLocationRelativeTo(null);

        ListenForButton lForButton = new ListenForButton();
        submit.addActionListener(lForButton);

        textArea.setEditable(false);

        submit.setBorderPainted(false);

        panel.add(label);
        panel.add(day);
        panel.add(month);
        panel.add(year);
        panel.add(submit);
        panel.add(scrollBar);
        panel.add(textArea);
        this.add(panel);
        this.setResizable(false);
        this.setVisible(true);
    }

        private class ListenForButton implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(actionEvent.getSource() == submit){
                    textArea.setText(null);
                    day.requestFocus();
                    int dayIn,monthIn,yearIn;
                    dayIn = Integer.parseInt(day.getText());
                    monthIn = Integer.parseInt(month.getText());
                    yearIn = Integer.parseInt(year.getText());
                    try{
                        MyDate date = new MyDate(dayIn,monthIn,yearIn);
                        textArea.append(date.toString() + "\n");
                        textArea.append(date.getDay() + " " + date.getMonth() + " " + date.getYear());
                    }catch (NoDayException d){
                        JOptionPane.showMessageDialog(new JFrame(), d.getMessage(), "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                        day.setText(null);
                        day.requestFocus();
                    }catch (NoMonthException m){
                        JOptionPane.showMessageDialog(new JFrame(), m.getMessage(), "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                        month.setText(null);
                        month.requestFocus();
                    }catch (NoYearException y){
                        JOptionPane.showMessageDialog(new JFrame(), y.getMessage(), "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                        year.setText(null);
                        year.requestFocus();
                    }
                }
            }
        }
}
