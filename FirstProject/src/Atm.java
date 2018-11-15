import java.util.Arrays;

public class Atm {
	
	
		
			
			
			
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pin [] = {1234, 5678,9000,9876,5432,1090,1070,1200,1150,1230};
		String user []  = {"Zulfa","Alsam","Zu","java","coffee","Kenya","Espresso","Decaf","Rwanda","Ethiopia"};
		pinMethod chPin = new pinMethod ();
		AtMethods welcomeselect = new AtMethods ();
		
		
	for(int attempt=2;attempt>=0;attempt--) {
		
		int checkPIn = chPin.enterPin();
		
			
			if(checkPIn ==pin[0]|checkPIn ==pin[1]|checkPIn ==pin[2]|checkPIn ==pin[3]|checkPIn ==pin[4]|
					checkPIn ==pin[5]|checkPIn ==pin[6]|checkPIn ==pin[7]|checkPIn ==pin[8]|
					checkPIn ==pin[9]) {
				
				System.out.println("Welcome to our System");
				
				
					int welcomechoose = welcomeselect.welcome();
					
				
				
				
				break;
				}
			
			System.out.println("You have "+attempt+" attempts left");
			
		}
		
		
			
				
		
//			while(pin[j] !=checkPIn);
//			if(pin[j] == checkPIn) break;
//			System.out.println("Welcome "+user[j]+" to our System");
		
		
		
//		for(int i =0; i<pin.length;i++) {
//			if(pin[i]==checkPIn) {
//				
//				break;
//			} 
//			
//			else {
//				for(int j=2;j>=0;j--) {
//					System.out.println("Sorry");
//				}
//				
//			}
//
//		}	
//		
			
					
				
					
			
				
		
			
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for(int i = 0; i<=3; i--) {  
//			
//			if(checkPIn == pin[0])
//			{
//					System.out.println("Welcome "+ user[0]+ " to our system");
//				}
//			else if(checkPIn == pin[1])
//			{
//					System.out.println("Welcome "+ user[1]+ " to our system");
//				}
//			else {
//				System.out.println("Invalid pin you have "+i+" attempts left");
//				chPin.enterPin();
//			}
//			
//			break;
//			
//				 
//				
//				
//				}
//				
//						
//				}
//				
//		
		
//		System.out.println("Choose one:");
//		System.out.println("1. View Balance");
//		System.out.println("2. Deposit Cash");
//		System.out.println("3. Withdraw Cash");
//		
//		choice = (char) System.in.read();
//		
//		if(choice == '1' ) {
//			System.out.println("Your current balance is: "+ balance);
//		}
//		else if(choice == '2') {
//			System.out.println("Enter amount to deposit: ");
//			deposit = (int) System.in.read();
//			balance = balance + deposit;
//			System.out.println("Your new balance is: " + balance);
//		}
//		else if (choice == '3') {
//			System.out.println("Enter amount to withdraw: ");
//			withdraw = (int) System.in.read();
//			if(withdraw <= balance) {
//				System.out.println("Sorry you can not withdraw "+ withdraw);
//			}
//			else {
//				withdrawbalance = balance - withdraw;
//				System.out.println("You have withdrew "+ withdraw + " your current balance is " + withdrawbalance);
//			}
//		}
//		
//		

	}

}
