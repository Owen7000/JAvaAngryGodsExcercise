package customExceptionTest;

import java.lang.Exception;

// AngryGodsExcpetion: a custom exception that extends Exception
@SuppressWarnings("serial")
public class AngryGodsException extends Exception{
	private String punishment;
	
	public AngryGodsException(String punishment) {
		
		this.punishment = punishment;
	}
	
	// getter
	public String getPunishment() {
		return punishment.toUpperCase();
	}
	
	@Override
	public String toString() {
		return super.toString() + "Cower Mortal!";
	}
}
