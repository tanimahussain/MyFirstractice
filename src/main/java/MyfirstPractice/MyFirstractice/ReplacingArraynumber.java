package MyfirstPractice.MyFirstractice;
import java.util.Scanner;
public class ReplacingArraynumber {

	public static void main(String[] args) {
		
		int [] numbers= {2,3,4,5,6};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int newnum= sc.nextInt();
	     numbers[4]= newnum;
	     
	     
	    for(int i=0;i<=numbers.length-1;i++) {
	    System.out.print(numbers[i]);	
	    }

	}

}
