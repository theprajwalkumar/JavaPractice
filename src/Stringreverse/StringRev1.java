package Stringreverse;

public class StringRev1 {
	
	public static String reverseString(String str) {
		 StringBuilder sb=new StringBuilder(str); 
		sb.reverse();
		return sb.toString(); 
		
	}

	public static void main(String[] args) {
		System.out.println(StringRev1.reverseString("APJ ABDUL KALAM"));

	}
	
	

}
