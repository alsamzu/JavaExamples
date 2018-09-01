
public class ExampleString {

	public static void main(String[] args) {
		String name = "Zulfa Alsam";
		System.out.println(name);
		System.out.println(name.charAt(6));
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		
		String age ="25";
		String salary = "1593422.32";
		//wrapper classes
		int a = Integer.parseInt(age)/5;
		System.out.println(a);
		
		double b = Double.parseDouble(salary)*.10;
		System.out.println(b);

	}

}
