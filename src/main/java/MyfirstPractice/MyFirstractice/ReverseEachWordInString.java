package MyfirstPractice.MyFirstractice;
import java.util.Scanner;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		/*System.out.println("Enter the problem: ");
		Scanner sc= new Scanner(System.in);
		String name= sc.nextLine();
		String[] text= name.split(" ");
		for(int i=text.length-1; i>=0; i--) {
			System.out.println(text[i]);
		}*/

		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Name :");
		
		String line= sc.nextLine();
		
		String []string= line.split(" ");
		
		
		for(int i=0; i<=string.length-1;i++) {
			
		String words=string[i];
		String reversedwords="";
		
		for(int j=words.length()-1;j>=0;j--) {
			reversedwords=reversedwords+words.charAt(j);
		}
		
		System.out.print(reversedwords+" ");}
		
		 
		
		/*String words[] = originalStr.split("\\s");
		 String reversedString = "";
		for (int i = 0; i < words.length; i++)
		{
			String word = words[i];
			
			String reverseWord = "";
			for (int j = word.length()- 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
		 	reversedString = reversedString + reverseWord + " ";
		}
		 // Displaying the string after reverse
		
		System.out.print("Reversed string : " + reversedString);*/
	}

}
