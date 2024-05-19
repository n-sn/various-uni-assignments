package part3;

public class Conversion1Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Conversion1 obj1 = new Conversion1();
		
		String infix = "1 * ( 2 + 3 ) * 3";
		System.out.println("infix: " + infix);
		
		//conver infix to pontific
		String postfix = obj1.infixToPostfix(infix);
		System.out.println("postifix: " + postfix);
		//evaluate postfix
		System.out.println("evaluation: "+ obj1.evaluate(postfix));

		System.out.println();
		Conversion1 obj2 = new Conversion1();
		String infix1 = "( 1 + 2 ) * 3";
		System.out.println("infix: " + infix1);
		
		//conver infix to pontific
		String postfix1 = obj2.infixToPostfix(infix1);
		System.out.println("postifix: " + postfix1);
		//evaluate postfix
		System.out.println("evaluation: "+ obj2.evaluate(postfix1));

		System.out.println();
		Conversion1 obj3 = new Conversion1();

		infix1 = "1 * ( 2 + 3 ) + 3";
		System.out.println("infix: " + infix1);
		
		//conver infix to pontific
		postfix1 = obj3.infixToPostfix(infix1);
		System.out.println("postifix: " + postfix1);
		//evaluate postfix
		System.out.println("evaluation: "+ obj3.evaluate(postfix1));

		System.out.println();

		Conversion1 obj4 = new Conversion1();
		infix1 = "( 2 - 1 ) * 4 / 2";
		System.out.println("infix: " + infix1);
		
		//conver infix to pontific
		postfix1 = obj4.infixToPostfix(infix1);
		System.out.println("postifix: " + postfix1);
		//evaluate postfix
		System.out.println("evaluation: "+ obj4.evaluate(postfix1));
		
		System.out.println();
		Conversion1 obj5 = new Conversion1();
		infix1 = "( 2 - 1 ) * ( 4 / 2 ) + 5";
		System.out.println("infix: " + infix1);
		
		//conver infix to pontific
		postfix1 = obj5.infixToPostfix(infix1);
		System.out.println("postifix: " + postfix1);
		//evaluate postfix
		System.out.println("evaluation: "+ obj5.evaluate(postfix1));


	
	}

}
