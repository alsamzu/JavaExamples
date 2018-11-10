
public class Guess {

	public static void main(String[] args) throws java.io.IOException{
		// TODO Auto-generated method stub
		
		char ch, answer='K';
		System.out.println("Am thinking of a character between A-Z");
		System.out.print("Can you guess it:");
		
		ch = (char) System.in.read();
		if(ch == answer) {
			System.out.println("You guessed right!");
		}
		else {
			System.out.println("Sorry try again next time");
		}
	

}
}
