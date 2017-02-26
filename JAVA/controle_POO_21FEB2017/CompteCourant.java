/**
 * Created by yassine on 2/23/17.
 */

import exceptions.*;

public class CompteCourant extends Compte {

    //a. attributes

    public float decouvert;

    //b. constructors

    public CompteCourant(){}

    public CompteCourant(int a, float b, Client c, float d) throws NegativeDecException{
        super(a,b,c);
        if(d >= 0)
            throw new NegativeDecException();
        else
            decouvert = d;
    }

    //c. toString method

    public String toString(){
        return super.toString() + "\nDécouvert: " + decouvert;
    }

    //d. retrait method

    @Override
    public void retrait(float a){
        if(a > decouvert)
            System.out.println("Error");
        else
            soldeCompte -= a;
    }

}
