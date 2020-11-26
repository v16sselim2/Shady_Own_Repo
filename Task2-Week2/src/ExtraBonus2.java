import java.util.Scanner;

class ExtraBonus2 {
	public static void main(String args[]) {
		int rows, number = 1, counter, j;
		// To get the user's input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows for floyd's triangle:");
		// Copying user input into an integer variable named rows
		rows = input.nextInt();
	
		
		for (counter = 1; counter <= rows; counter++) {
			for (j = 1; j <= counter; j++) {
				System.out.print( "*");
				// Incrementing the number value
				;
			}
			// For new line
			System.out.println();
		}
	}
}