import java.util.Scanner;

public class AtMethods {
		
	int welcome() {
		int balance = 5000;
	    Scanner welcomescreen = new Scanner( System.in );
		int y = 1;	
for(int b=1;;b++) {
	System.out.println("Please choose one: \n 1. Check Balance \n 2. Deposit Cash  \n 3. Withdraw Cash \n 4.Logout");
	  
	String screenwelcome = welcomescreen.next();
	 y = Integer.parseInt(screenwelcome);
	if(y == 1) {
		System.out.println("Your current balance is "+balance+" Ksh");
	}
	
	else if(y == 2) {
		System.out.println("Enter amount to deposit: ");
		Scanner deposit = new Scanner (System.in);
		int depo = deposit.nextInt();
		 balance = depo + balance;
		 System.out.println("Deposit successful. Your new balance is "+balance);
	}
	else if(y == 3) {
		System.out.println("Enter amount to withdraw: ");
		Scanner withdraw = new Scanner (System.in);
		int withDraw = withdraw.nextInt();
		if(withDraw >= balance) {
			System.out.println("Sorry you can not withdraw  "+withDraw+"ksh. Your account balance is "+balance+" Ksh.");
		}

		else {
			balance =  balance - withDraw ;
			System.out.println("Withdrawal successful. Your new balance is "+balance);
		}
	}  
	
	else if (y == 4) {
		System.out.println("Thank you for using our System");
		break;
	}

	else {
		System.out.println("Invalid choice. Please Select either 1 2 3 or 4");
	}
	
	
	
		}
	   
      return y; 	
	  
			}
}
