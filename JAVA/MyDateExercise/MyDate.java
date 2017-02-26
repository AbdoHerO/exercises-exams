package main;
/**
 * Created by yassine on 2/22/17.
 */

import main.exceptions.NoDayException;
import main.exceptions.NoMonthException;
import main.exceptions.NoYearException;

public class MyDate {

    private int day,month,year;

    //Getters and Setters
    public int getDay() {
        return day;
    }

    
    private String[] months = {"January","February","March","April","May","June",
            "July","August","September","October","November","December"};

    private String monthName;

    public void setMonthName(int month){
        switch (month){
            case 1:
                this.monthName = months[0];
                break;
            case 2:
                this.monthName = months[1];
                break;
            case 3:
                this.monthName = months[2];
                break;
            case 4:
                this.monthName = months[3];
                break;
            case 5:
                this.monthName = months[4];
                break;
            case 6:
                this.monthName = months[5];
                break;
            case 7:
                this.monthName = months[6];
                break;
            case 8:
                this.monthName = months[7];
                break;
            case 9:
                this.monthName = months[8];
                break;
            case 10:
                this.monthName = months[9];
                break;
            case 11:
                this.monthName = months[10];
                break;
            case 12:
                this.monthName = months[11];
                break;
        }

    }

    public String getMonthName() {
        return monthName;
    }

    public void setDay(int day) throws NoDayException {

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            if(day > 0 && day <= 31 )
                this.day = day;
            else
                throw new NoDayException();
        }

        else if(month == 4 || month == 6 || month == 9 || month == 11){
            if(day > 0 && day <= 30 )
                this.day = day;
            else
                throw new NoDayException();
        }

        else if(month == 2){

            if(leapYear(year)){
                if(day > 0 && day <= 29 )
                    this.day = day;
                else
                    throw new NoDayException();
            }

            else{

                if(day > 0 && day <= 28 )
                    this.day = day;
                else
                    throw new NoDayException();
            }
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) throws NoMonthException {
        if(month > 0 && month <= 12){
            this.month = month;
            this.setMonthName(month);
        }
        else
            throw new NoMonthException();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws NoYearException {
        if(year < 1970)
            throw new NoYearException();
        else
            this.year = year;
    }

    //constructor
    public MyDate(int day, int month, int year)throws NoYearException,NoMonthException,NoDayException{
        this.setDay(day);
        this.setYear(year);
        this.setMonth(month);
    }

    //leap year check
    public boolean leapYear(int year){
        if(year % 400 == 0)
            return true;
        else if(year % 100 == 0)
            return false;
        else if(year % 4 == 0)
            return true;
        else
            return false;
    }

    @Override
    public String toString(){
        if(leapYear(getYear()))
            return "C'est une année bissextile\n " + day + "/" + month + "/" + year;
        else
            return "C'est une année non bissextile\n " + day + "/" + month + "/" + year;
    }
}