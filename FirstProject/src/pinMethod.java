import java.util.Scanner;

public class pinMethod {

	int enterPin () {
Scanner pinCheck = new Scanner( System.in );
		
		System.out.println("Enter your pin to proceed: ");
		String checkPin = pinCheck.next();
		int x = Integer.parseInt(checkPin);
		return x;
	}
}
