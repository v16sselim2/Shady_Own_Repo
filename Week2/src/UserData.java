
//package userData;

import java.util.Scanner;

import javax.swing.JOptionPane;

class UserData {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		String[] array = new String[6];

		String first_name, mobile, email, age, faculty, department;

		array[0] = JOptionPane.showInputDialog("Enter Your Name");

		array[1] = JOptionPane.showInputDialog("Enter Your Mobile");

		array[2] = JOptionPane.showInputDialog("Enter Your E-Mail");

		array[3] = JOptionPane.showInputDialog("Enter Your Age");

		array[4] = JOptionPane.showInputDialog("Enter Your Faculty");

		array[5] = JOptionPane.showInputDialog("Enter Your Department");

		System.out.println("Your Name Is: " + array[0]);
		System.out.println("Your Mobile Is: " + array[1]);
		System.out.println("Your E-Mail Is: " + array[2]);
		System.out.println("Your Age Is: " + array[3]);
		System.out.println("Your Faculty Is: " + array[4]);
		System.out.println("Your Department Is: " + array[5]);
		
		
	}
}