package stack;

public class StackApp {

	public int fact(int n) {
		LStack<Integer> stackObj = new LStack<Integer>();
		for (int i = 1; i <= n; i++) {
			stackObj.push(i);
		}
		return popperMultiplier(stackObj);
		
	}
	
	public int sum(int n) {
		LStack<Integer> stackObj = new LStack<Integer>();
		for (int i = 1; i <= n; i++) {
			stackObj.push(i);
		}
		return popperAdder(stackObj);
			
	}
	
	public void reverse(int[] array) {
		LStack<Integer> stackObj = new LStack<Integer>();
		for (int i = 0; i < array.length; i++ ) {
			stackObj.push(array[i]);
		}
		while (!stackObj.isEmpty()) {
			System.out.print(stackObj.pop() + " ");
		}
		System.out.println();
	}
	
	
	private static int popperMultiplier(LStack<Integer> stackObj) {
		int result = 1;
		while (!stackObj.isEmpty()) {
			result = result * stackObj.pop();
		}
		return result;
	}
	
	private static int popperAdder(LStack<Integer> stackObj) {
		int result = 0;
		while (!stackObj.isEmpty()) {
			result = result + stackObj.pop();
		}
		return result;
	}
	
}
