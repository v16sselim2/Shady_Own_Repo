import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter number:");

		int n = s.nextInt();
		for (int i = 1; i <= 12; i++) {

			System.out.println(n + " * " + i + " = " + n * i);
		}
	}
}