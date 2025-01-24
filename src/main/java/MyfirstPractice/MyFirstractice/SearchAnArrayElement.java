package MyfirstPractice.MyFirstractice;

public class SearchAnArrayElement {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		
		int searchElement=3;
		
		boolean ans=true;
		
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==searchElement) {
				ans=true;
				break;
			}else {
				ans=false;
			}
		}
       System.out.println(ans);
	}

}
