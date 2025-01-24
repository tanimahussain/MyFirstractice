package MyfirstPractice.MyFirstractice;

public class forloopwithReversedString {

	public static void main(String[] args) {
		/*String name= "I want to be a QA lead";
		
		for(int i= name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}*/
		
		
		String words= "A megatech student";
		
		String[] text= words.split(" ");
		
		for(int i= text.length-1;i>=0;i--) {
			System.out.println(text[i]);
		}
	}

}
