import java.util.Scanner;

public class UserInput {

	public static void main (String[] args){
		
		Scanner TakeInput = new Scanner(System.in);
		System.out.println("Please Enter Your Name");
		String user = TakeInput.next();
		
		System.out.print("Welcome " user);
		
		
	}
	
	
	
	
	
}
