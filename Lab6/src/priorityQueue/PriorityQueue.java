package priorityQueue;

public class PriorityQueue<T extends Comparable<T>> implements PriorityQueueInterface<T> {

	private MinHeap<T> heap;
	
	public PriorityQueue() {
		heap = new MinHeap<T>(100);
	}
	
	public PriorityQueue(T[] value) {
		heap = new MinHeap<T>(100, value);
	}
	
	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		return heap.get();
	}

	@Override
	public void enqueue(T value) {
		// TODO Auto-generated method stub
		heap.insert(value);
		
	}
	
	public void show() {
		heap.show();
	}
	
	

	
	
}
