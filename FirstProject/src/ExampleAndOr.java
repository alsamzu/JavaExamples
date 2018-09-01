
public class ExampleAndOr {

	public static void main(String[] args) {
		int x = -10;
		int y = 10;
		 if(x>0 && y>0) {
			 System.out.println("Both numbers are +ve");
		 }else if(x>0 || y>0) {
			 System.out.println("Atleast one number is +ve");
		 }else {
			 System.out.println("No number is positive");
		 }

	}

}
