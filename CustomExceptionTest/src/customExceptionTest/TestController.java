package customExceptionTest;

// This class will create an instance of the Hello class
// call the sayHello() method, then catch any exception that results
public class TestController {

	public static void main(String[] args) {

		// create an instance of the Hello class
		Hello myHello = new Hello();
		
		// call the only method on Hello
		try {
			myHello.sayHello();
		} catch (AngryGodsException e) {
			System.out.println("What punishment is decreed by the Elder Gods?");
			System.out.println(e.getPunishment() + '\n');
			
			System.out.println(e);
		}

	}

}
