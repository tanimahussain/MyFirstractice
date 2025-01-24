package MyfirstPractice.MyFirstractice;
import java.util.Scanner;
public class input {

	public static void main(String[] args) {
		System.out.println("Enter your name: ");
		Scanner sc= new Scanner(System.in);
		String name= sc.nextLine();
		String text= name.replaceAll("n", "p");
		System.out.print(text);
		
		/*for(int i=name.length()-1; i>=0;i--) {
			System.out.print(name.charAt(i));
		}*/
		System.out.println(",    Enter your age: ");
		int age= sc.nextInt();
		int temp=0;
		while(age>0) {
			temp=age%10;
			System.out.print(temp);
			age=age/10;
		}
		
		

	}

}
