package binarySearchTree;

public class Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer num1 = 1;
		Integer num2 = 3;
		if (num1.compareTo(num2) < 0) {
			System.out.println(num1 + " < " + num2);
			
		}	else if (num1.compareTo(num2) > 0) {
				
			System.out.println(num1 + " > " + num2);
			
		}	else {
			System.out.println(num1 + " == " + num2);
		}
		
		String str1 = "A";
		String str2 = "B";
		
		if (str1.compareTo(str2) < 0) {
			System.out.println("\"" + str1 + "\" < \"" + str2 + "\"");
		}	else if (str1.compareTo(str2) > 0) {
			System.out.println("\"" + str1 + "\" > \"" + str2 + "\"");
		}
			else {
			System.out.println("\"" + str1 + "\" == \"" + str2 + "\"");
		}
		
	}

}
