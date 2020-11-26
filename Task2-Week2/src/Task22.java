import java.util.Scanner;

class Task22

{



	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Grade (A, B, C, D): ");
		String grade = sc.next();

		if (grade == A) {
			System.out.println("Average Marks from 85 to 100");
		} else if (grade == B) {
			System.out.println("Average Marks from 75 to 85");
		} else if (grade == C) {
			System.out.println("Average Marks from 50 to 65");
		} else if (grade == D)
			System.out.println("Average Marks less than 50");

	}

}