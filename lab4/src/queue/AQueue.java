package queue;

public class AQueue<T> implements Queue<T> {

	private T[] queueArray;
	private static final int DEFAULT_SIZE = 10;
	private int maxSize;
	private int size;
	private int front;
	private int rear;
	
	@SuppressWarnings("unchecked")
	public AQueue(int maxSize) {
		queueArray = (T[]) new Object[maxSize];
		this.maxSize = maxSize;
		size = 0;
		front = -1;
		rear = 0;
	}
	
	public AQueue() {
		this(DEFAULT_SIZE);
	}
	
	private int rear() {
		return rear% maxSize;
	}
	
	private int front() {
		return front % maxSize;
	}
	
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
		size = 0;
		front = -1;
		rear = 0;
		
	}
	
	
	@Override
	public boolean enqueue(T it) {
		// TODO Auto-generated method stub
	
		if (isFull()) {
			return false;
		}
		if (front == -1) {
			front = 0;
		}
		queueArray[rear()] = it;
		rear++;
		size++;
		return true;
	
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		
		if (isEmpty()) {
			return null;
		}
		
		T it = queueArray[front()];
		front++;
		size--;
		return it;
		
		//return it;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		
		return queueArray[front()];
		
		
		
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		
		if (size == 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if (size == maxSize) {
			return true;
		}
		
		return false;
	}


	
	

}
