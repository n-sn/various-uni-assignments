package stack;

public class Node<T> {

	private T value;
	private Node<T> next;
	
	public Node(T value) {
		this.value = value;
		this.next = null;
	}
	
	public Node() {
		this.value = null;
		this.next = null;
	}
	
	public T value() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public Node<T> next() {
		return next;
	}
	
	public void setNext(Node<T> node) {
		this.next = node;
	}
	
}
