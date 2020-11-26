import java.util.Scanner;

class Task1 

{
	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your marks (less than 100): ");
		int marks = sc.nextInt();
		char grade = 0;

		if (marks >= 85) {
			grade = 'A';
			}
		else if (marks >= 75 && marks < 85) {
			grade = 'B';
		}
		else if (marks >= 50 && marks < 65) {
			grade = 'C';
		}
		else if (marks > 50 && marks <= 0)
			grade = 'D';
		
		
		System.out.println("Your Grade is: " + grade);
		
		}
		
	
	
	
}