package exceptions;

/**
 * Created by yassine on 2/23/17.
 */
public class NegativeDecException extends Exception {
    @Override
    public String getMessage(){
        return "Le découvert doit être négatif";
    }
}
