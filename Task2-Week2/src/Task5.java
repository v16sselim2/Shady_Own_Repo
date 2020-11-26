import java.util.Scanner;

class Task5 {
	
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		double sum = 0;
		System.out.println("Enter the elements:");
		
		for (int i = 0; i < 10; i++) {
			array[i] = scanner.nextInt();
		}
		for (int num : array) {
			sum = sum + num;
		}
		System.out.println("Sum of array elements is:" + sum);
		
		   double average = sum / array.length;
	        
	        System.out.format("The average is: %.3f", average);
	}
}