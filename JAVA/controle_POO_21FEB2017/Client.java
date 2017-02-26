/**
 * Created by yassine on 2/23/17.
 */
public class Client {

    //1
    //a. attributes

    private int numCli;
    private String nomCli;

    //b. getters and setters

    public int getNumCli() {
        return numCli;
    }

    public void setNumCli(int numCli) {
        this.numCli = numCli;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    //c. constructors

    public Client(){}

    public Client(int numCli, String nomCli){
        this.numCli = numCli;
        this.nomCli = nomCli;
    }

    //d. toString method

    public String toString(){
        return "Numero du client: " + numCli + "\nNom du client: " + nomCli;
    }

}
