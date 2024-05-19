package priorityQueue;

public class MinHeap<T extends Comparable<T>> {

	private T[] heapArray;
	private int maxSize;
	private int currentSize;
	
	public MinHeap(int maxSize) {
		heapArray = (T[]) new Comparable[maxSize];
		this.maxSize = maxSize;
		currentSize = 0;
	}
	
	public MinHeap(int maxSize, T[] values) {
		heapArray = (T[]) new Comparable[maxSize];
		this.maxSize = maxSize;
		currentSize = 0;
		
		createBTree(values);
		buildHeap();
	}

	public int size() {
		return currentSize;
	}
	
	private boolean isRoot(int index) {
		
		if (index == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	private boolean isLeaf(int index) {
		return (index >= currentSize/2) && (index < currentSize);
	}
	
	private int left(int index) {
		if (isLeaf(index)) {
			return -1;
		}
		return 2*index + 1;
	}
	
	private int right(int index) {
		if (isLeaf(index)) {
			return -1;
		}
		return 2*index + 2;
	}
	
	private int parent(int index) {
		if (index <= 0) {
			return -1;
		}
		return (index-1)/2;
	}
	
	private boolean lessThan(T value1, T value2) {
		
		if (value1.compareTo(value2) < 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	private boolean largerThan(T value1, T value2) {
		if (value1.compareTo(value2) > 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	private void swap(int index1, int index2) {
		T temp = heapArray[index1];
		heapArray[index1] = heapArray[index2];
		heapArray[index2] = temp;
	}
	
	private void moveUp(int index) {
		while (!isRoot(index) && lessThan(heapArray[index], heapArray[parent(index)])) {
			swap(index, parent(index));
			index = parent(index);
		}
	}
	
	private int getMinChild(int index) {
		int child; // child index
		int leftIndex = left(index);
		int rightIndex = right(index);
		
		if (leftIndex >= currentSize) {
			//no left child
			child = rightIndex;
		} else if (rightIndex >= currentSize) {
			// no right child
			child = leftIndex;
		} else {
			// both children, get smaller child
			if (lessThan(heapArray[leftIndex], heapArray[rightIndex])) {
				child = leftIndex;
			} else {
				child = rightIndex;
			}
		}
	
		//compare parent and smaller child
		if (largerThan(heapArray[index], heapArray[child])) {
			return child;
		}
		return -1;
	}
	
	private void moveDown(int index) {
		int childIndex;
		
		while (!isLeaf(index)) {
		childIndex = getMinChild(index);
		//swap with smaller child
		if (childIndex > 0) {
			swap(index, childIndex);
			//no smaller children
		} else {
			break;
		}
		
		//move down
		index = childIndex;
		}
	}
	
	
	public void insert(T value) {
		int currIndex;
		if (currentSize >= maxSize) {
			return;
		}
		
		//add value
		currIndex = currentSize++;
		heapArray[currIndex] = value;
		
		//move up
		moveUp(currIndex);
	}
	
	public T get() {
		if (currentSize == 0) {
			return null;
		}
		
		//get value of root node
		T result = heapArray[0];
		
		
		if (currentSize > 1)	{
			//swap root with the last node
			int lastIndex = currentSize - 1;
			swap(0,lastIndex);
			
			//reduce array sie by 1
			currentSize--;
			
			//move down
			moveDown(0);
		}	else	{
			currentSize--;
		}
		return result;
		
		
		
		
	}
	
	private void createBTree(T[] values) {
		for (int i = 0; i < values.length; i++) {
			heapArray[i] = values[i];
			currentSize++;
		}
	}
 	
	private int lastInternalIndex() {
		return (currentSize-2)/2;
	}
	
	private void buildHeap() {
		for (int i = lastInternalIndex(); i >= 0; i--) {
			moveDown(i);
		}
	}
	
	public void show() {
		for (int i = 0; i < currentSize; i++) {
			System.out.print(heapArray[i].toString() + " ");
		}
		System.out.println();
	}
	
	
	
	
	
	
}
