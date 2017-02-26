/**
 * Created by yassine on 2/23/17.
 */
public class Banque {

    //a. attributes

    public Compte T[];
    public int N=0,max;

    //b. constructor

    public Banque(int max){
        T = new Compte[max];
    }

    //c. ajoute method

    public void ajoute(Compte a){
        T[N] = a;
        N++;
    }

    //d. affiche method

    public void affiche(float solde){
        int flag=0;
        for(int i=0;i<N;i++){
            if(T[i].soldeCompte == solde){
                System.out.println(T[i]);
                flag = 1;
            }
        }
        if(flag == 0)
            System.out.println("Compte introuvable");
    }

    //e. supprimer method

    public void supprimer(Compte cli){
        int flag = 0;
        for(int i=0;i<N;i++){
            if(T[i].numCompte == cli.numCompte){
                for(int j=i;j<N;j++)
                    T[j]= T[j-1];
                flag = 1;
                break;
            }
        }if(flag == 0)
            System.out.println("Compte introuvable");
    }
}
