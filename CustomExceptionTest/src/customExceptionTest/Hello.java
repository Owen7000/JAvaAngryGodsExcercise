package customExceptionTest;

import java.util.Scanner;


// this class gets the user's name then greets them
public class Hello {
	
	// sayHello method: asks for the user's name as input then prints a greeting
	public void sayHello() throws AngryGodsException{
		
		Scanner inStr = new Scanner(System.in);	
		
		System.out.println("Stranger! Enter your name or face the wrath of the Elder Gods! ");
		String name = inStr.next();
		
		// make the following test case insensitive
		String lcName = name.toLowerCase();
		
		// check if the user entered No
		if (lcName.equals("no")) {
			System.out.println("Stranger, you disrespect the Elder Gods, you are Doomed!");
			inStr.close();
			throw(new AngryGodsException("I cast you into the firey dragon pits!"));
		}
		else {
			System.out.println("Welcome " + name + ". What is your quest?");
		}
		
		inStr.close();
	}
}
