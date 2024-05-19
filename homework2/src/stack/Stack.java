package stack;

public interface Stack<T> {

	void clear();
	
	boolean push(T it);
	
	T pop();
	
	T peek();
	
	int length();
	
	boolean isEmpty();
}
