package MyfirstPractice.MyFirstractice;

public class Reversedintwithwhileloop {

	public static void main(String[] args) {
		int age= 34;
		int temp= 0;
		
		while(age>0) {
			temp=age%10;
			System.out.print(temp);
			age=age/10;
		}
		
		

	}

}
