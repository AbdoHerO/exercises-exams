package main.exceptions;

/**
 * Created by yassine on 2/22/17.
 */
public class NoYearException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage(){
        return "The year must be superior than 1970";
    }
}