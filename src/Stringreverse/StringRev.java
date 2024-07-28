package Stringreverse;

public class StringRev {
	
	  
		public static String reverseString(String str){  
		    StringBuilder sb=new StringBuilder(str);  
		    sb.reverse();  
		    return sb.toString();  
		}  
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StringRev.reverseString("My name is Shahrukh"));
		System.out.println(StringRev.reverseString("My name is Prajwal"));
		
		 System.out.println(StringRev.reverseString("my name is khan"));  
		    System.out.println(StringRev.reverseString("I am sonoo jaiswal"));  
		    System.out.println(StringRev.reverseString("oppp"));

	}

}
