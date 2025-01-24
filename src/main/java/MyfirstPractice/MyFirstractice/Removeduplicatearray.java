package MyfirstPractice.MyFirstractice;

import java.util.HashMap;

public class Removeduplicatearray {

	public static void main(String[] args) {
		int[] input = new int[]{1,2,3,4,4,7,8,8,10};
		 
		HashMap<Integer,Boolean> mymap= new HashMap<>();
		
		for(int i=0; i<input.length;i++) {
			if(mymap.get(input[i])==null) {
				System.out.println(input[i]+" ");
				mymap.put(input[i],true);
			}
		}
		 
		 
		
	}
}

