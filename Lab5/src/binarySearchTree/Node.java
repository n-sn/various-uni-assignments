package binarySearchTree;

public class Node<T> {

	private T value;
	private Node<T> left;
	private Node<T> right;
	
	public Node(T value) {
		
		this.value = value;
		left = right = null;
		
	}
	
	public T value() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public Node<T> left() {
		return left;
	}
	
	public void setLeft(Node<T> node) {
		this.left = node;
	}
	
	public Node<T> right() {
		return right;
	}
	
	public void setRight(Node<T> node) {
		this.right = node;
	}
	
	public boolean isLeaf() {
		if (left == null && right == null) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
