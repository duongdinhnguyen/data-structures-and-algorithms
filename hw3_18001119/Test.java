package hw3_18001119;


public class Test {
	public static void main(String [] args) {
	 String string="abcdef";
     String reverse = new StringBuffer(string).
     reverse().toString();
     System.out.println("\nString before reverse:"+string);
     System.out.println("String after reverse: "+reverse);
	}
}