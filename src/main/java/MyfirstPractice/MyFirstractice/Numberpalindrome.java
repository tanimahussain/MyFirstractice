package MyfirstPractice.MyFirstractice;
import java.util.Scanner;
public class Numberpalindrome {

	public static void main(String[] args) {
	
		 Scanner s = new Scanner (System.in);
		 System.out.println("put a number: ");
		 int num = s.nextInt();
		 int orgNum = num ;
		 int rev = 0;
		 while(num>0) {
			 rev = rev*10 + num%10;
			 num = num/10;
		 }
		 if(orgNum == rev) {
		 System.out.println("It is a palindrome Number");
		 }
		 else {
		 System.out.println("It is a Not palindrome Number");
		 }
	    

		 //original num 121
		 //rev 121
		 //num 0
	}

}
