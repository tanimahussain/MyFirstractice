package MyfirstPractice.MyFirstractice;

public class SearchElementarray {

	public static void main(String[] args) {
		int[] arr= {20,3,40,50};
		int searchelement= 40;
		
		boolean ans= true;
		
		for (int i=0; i<=arr.length-1;i++) {
			if(arr[i]==searchelement) {
				ans=true;
				break;
			}else {
				ans=false;
			}
		}
System.out.println(ans);
	}

}
