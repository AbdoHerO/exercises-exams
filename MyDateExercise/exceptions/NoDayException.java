package main.exceptions;

/**
 * Created by yassine on 2/22/17.
 */
public class NoDayException extends Exception{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage(){
        return "There is no such day in the month!";
    }
}