/**
 * Created by yassine on 2/23/17.
 */
public abstract class Compte {

    //a. attributes

    public int numCompte;
    public float soldeCompte;
    public Client propCompte;

    //b. constructors

    public Compte(){}

    public Compte(int numCompte,float soldeCompte,Client propCompte){
        this.numCompte = numCompte;
        this.soldeCompte = soldeCompte;
        this.propCompte = propCompte;
    }

    //c. toString method

    public String toString(){
        return propCompte.toString() + "\nNumero du compte: " + numCompte +
                "\nSolde: " + soldeCompte;
    }

    //d. depot method

    public void depot(float a){
        soldeCompte += a;
    }

    //e. retrait method

    public void retrait(float a){
        soldeCompte -= a;
    }
}
