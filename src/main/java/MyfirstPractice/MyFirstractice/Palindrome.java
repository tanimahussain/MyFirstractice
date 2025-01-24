package MyfirstPractice.MyFirstractice;

import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		
     /* String s= "level";
      String rev= "";
      
      for(int i= s.length()-1; i>=0;i--)
      rev=rev+s.charAt(i);
      
      if(s.equals(rev)) {
    	  System.out.println("The string is a palindrome");
    	  
      }
      
      else {
    	  System.out.println("the string is not a palindrome");
      }*/
      
      
      String name= "Was It A Cat I Saw";
      
      String words= name.replaceAll(" ", "");
       String text=  words.toLowerCase();
      String rev="";
      for(int i=text.length()-1; i>=0;i--)
      rev=rev+text.charAt(i);
      
      if(text.equals(rev)) {
    	  System.out.println("the string is a palindrome");
    	  
      }
      else {
    	  System.out.println("the string is not a palindrme");
      }
	}

}
