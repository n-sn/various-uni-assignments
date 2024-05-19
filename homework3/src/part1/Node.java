package part1;

public class Node<K extends Comparable<K>, V> {

	// instance variables
	private K key;
	private V value;
	private Node<K,V> left;
	private Node<K,V> right;
	
	// constructor
	public Node(K key, V value)	{
		this.key = key;
		this.value = value;
		left = right = null;
	}
	
	// methods: getters and setters
	public K key()	{
		return key;
	}
	
	public void setKey(K key)	{
		this.key = key;
	}
	
	public V value()	{
		return value;
	}
	
	public void setValue(V value)	{
		this.value = value;
	}
	
	public Node<K,V> left() {
		return left;
	}
	
	public void setLeft(Node<K,V> left) {
		this.left = left;
	}
	
	public Node<K,V> right()	{
		return right;
	}
	
	public void setRight(Node<K,V> right) {
		this.right = right;
	}
	
	// methods
	public boolean isLeaf() {
		if (left == null && right == null)	{
			return true;	
		}	else {
			return false;
		}
	}
	
	
	
}
