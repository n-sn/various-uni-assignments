package stack;

public class ConversionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conversion obj = new Conversion();
		
		String infix = "1 + 2 * 3";
		System.out.println("infix: " + infix);
		
		//conver infix to pontific
		String postfix = obj.infixToPostfix(infix);
		System.out.println("postifix: " + postfix);
		//evaluate postfix
		System.out.println("evaluation: "+ obj.evaluate(postfix));
		System.out.println();
	
		Conversion obj2 = new Conversion();
		infix = "1 * 2 + 3 * 3";
		System.out.println("infix: " + infix);
		
		//conver infix to 
		postfix = obj2.infixToPostfix(infix);
		System.out.println("postifix: " + postfix);
		//evaluate postfix
		System.out.println("evaluation: "+ obj2.evaluate(postfix));

		System.out.println();
		
		Conversion obj3 = new Conversion();
		infix = "1 * 2 + 3 * 3";
		System.out.println("infix: " + infix);
		
		//conver infix to 
		postfix = obj3.infixToPostfix(infix);
		System.out.println("postifix: " + postfix);
		//evaluate postfix
		System.out.println("evaluation: "+ obj3.evaluate(postfix));

		System.out.println();
		
		Conversion obj4 = new Conversion();
		infix = "1 * 2 + 3 * 3";
		System.out.println("infix: " + infix);
		
		//conver infix to 
		postfix = obj4.infixToPostfix(infix);
		System.out.println("postifix: " + postfix);
		//evaluate postfix
		System.out.println("evaluation: "+ obj4.evaluate(postfix));

		System.out.println();
	
		
		
	
	
	}

}
