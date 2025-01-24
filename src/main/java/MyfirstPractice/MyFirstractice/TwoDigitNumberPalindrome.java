package MyfirstPractice.MyFirstractice;
import java.util.Scanner;

public class TwoDigitNumberPalindrome {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
			System.out.print("Enter a 2-digit number: ");
			 
			 int number = scanner.nextInt();
		  
		try {
		 
			 if (number < 10 || number > 99) {
		 
				throw new Exception("Number must have exactly 2 digits.");
		 
			 }
		 int firstDigit = number / 10;
		 
		 int secondDigit = number % 10;
		 
		 if (firstDigit == secondDigit) {
		
			 System.out.println(number + " is a palindrome.");
		 } else {
		 
			 System.out.println(number + " is not a palindrome.");
		 }
		 } 
		
		 catch (Exception e) {
		 System.out.println("Error: "+e.getMessage());//"Error: " + e.getmessage()
		 }
		 scanner.close();
		 }
	}

	


