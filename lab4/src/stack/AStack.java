package stack;

public class AStack<T> implements Stack<T> {

	private T[] stackArray;
	private static final int DEFAULT_SIZE = 10;
	private int maxSize;
	private int top;
	
	@SuppressWarnings ("unchecked")
	public AStack(int maxSize) {
		this.maxSize = maxSize;
		top = -1;
		stackArray = (T[])new Object[maxSize];
	}
	
	public AStack() {
		this(DEFAULT_SIZE);
	}
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		top = -1;
		
	}

	@Override
	public boolean push(T it) {
		// TODO Auto-generated method stub
		if (top >= maxSize-1) {
			return false;
		}
		stackArray[++top] = it;
		return true;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if (top == -1) {
			return null;
		}
		
		return stackArray[top--];
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if (top == -1) {
			return null;
		}
		return stackArray[top];
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		
		return top+1;
	}
	
	

}
