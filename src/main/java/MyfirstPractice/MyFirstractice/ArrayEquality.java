package MyfirstPractice.MyFirstractice;

public class ArrayEquality {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,4};
		int[] b= {1,2,3,4,4};
		
		boolean ans= true;
		
		if(a.length!=b.length) {
			ans=false;
		}else {
			for (int i=0; i<=a.length-1; i++) {
				if(a[i]!=b[i]) {
					ans=false;
					break;
				}else {
					ans=true;
				}
			}
		}
		
		{System.out.println(ans);}
         }

}
