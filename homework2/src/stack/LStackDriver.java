package stack;

public class LStackDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LStack<Integer> stack = new LStack<Integer>();
		stack.push(2);
		stack.push(4);
		stack.push(6);
		System.out.println("stack size: " + stack.length());
		System.out.println("empty?: " + stack.isEmpty());
		System.out.println("peek top: " + stack.peek());
		
		System.out.println("pop: " + stack.pop());
		System.out.println("pop: " + stack.pop());
		System.out.println("pop: " + stack.pop());
		
		System.out.println("stack size: " + stack.length());
		System.out.println("empty?: " + stack.isEmpty());
		
		//we can go take a look at the results of the factorial thing
		StackApp test = new StackApp();
		System.out.println("The factorial of 4 is: " + test.fact(4));
		System.out.println("The sum of 4 is: " + test.sum(4));
		int[] array = new int[]{2, 3, 5, 6, 7, 8};
		test.reverse(array);
	}

}
