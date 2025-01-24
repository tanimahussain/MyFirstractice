package MyfirstPractice.MyFirstractice;

public class MethodOverloading {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c= 30;
		
		float x=3.4f;
		float y=2.2f;
		
		int[]p= {1,2,3,4,5};
		
		System.out.println(addnumbers(p));
		addnumbers(a,b);
		addnumbers(x,y);
		addnumbers(a,b,c);
	}

	public static int addnumbers(int [] b) {
		int ans=0;
		for(int i=0;i<b.length;i++) {
		ans=ans+b[i];	
		}
		return ans;
	}
	public static void addnumbers(int c, int d) {
		System.out.println(c+d);}
	
	public static void addnumbers(float g, float h) {
		System.out.println(g/h);
	}
	
	public static void addnumbers(int d,int e,int f) {
		System.out.println(d+e-f);
	}
	
}
