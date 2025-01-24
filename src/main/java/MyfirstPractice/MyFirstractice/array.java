package MyfirstPractice.MyFirstractice;

public class array {

	public static void main(String[] args) {
		String[] names= {"tanima","Tanjima","Farha"};
		
		for(int i=0; i<=names.length-1; i++) {
			System.out.println(names[i]);
		}
		
		int[] numbers= {3,6,2,1};
		int ans=0;
		for(int j=0;j<numbers.length;j++)
			ans=ans+numbers[j];
		
		System.out.println(ans);
		

	}

}
