import java.util.Scanner;

public class CheckFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int five = 5;
 System.out.println("Enter a number");
 Scanner user = new Scanner( System.in );
 String checkfive = user.next();
 int i = Integer.parseInt(checkfive);
 
  if(i == five) {
	  System.out.println(i+ " is equal to " +five);
  }
  else if (i < five) {
	  System.out.println(i + " is less than " +five);
  }
  else {
	  System.out.println(i + " is greater than " +five);
  }

	}

}
