package stack;

public class AStackDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AStack<Integer> stack = new AStack<Integer>(5);
		stack.push(2);
		stack.push(4);
		stack.push(6);
		System.out.println("stack size: " + stack.length());
		System.out.println("peek top: " + stack.peek());
		System.out.println("pop: " + stack.pop());
		System.out.println("pop: " + stack.pop());		
		System.out.println("pop: " + stack.pop());
		
		System.out.println("stack size: " + stack.length());
		
	}

}
