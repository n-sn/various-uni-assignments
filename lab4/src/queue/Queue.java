package queue;

public interface Queue<T> {

	void clear();
	
	//boolean enqueue(T it);
	
	T dequeue();
	
	T peek();
	
	int length();
	
	boolean isEmpty();
	
	boolean isFull();

	boolean enqueue(T it);
	
}
