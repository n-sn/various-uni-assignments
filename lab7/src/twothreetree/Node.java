package twothreetree;

public class Node<K extends Comparable<K>, V> {

	//first <key, value> pair
	private K lkey;
	private V lvalue;
	
	//second <key, value> pair
	private K rkey;
	private V rvalue;
	
	//links (left, middle, right)
	private Node<K,V> left;
	private Node<K,V> middle;
	private Node<K,V> right;
	
	public Node(K lkey, V lvalue) {
		this.lkey = lkey;
		this.lvalue = lvalue;
		
		rkey = null;
		rvalue = null;
		left = middle = right = null;
	}
	
	public K lkey() {
		return lkey;
	}
	
	public void setLkey(K lkey) {
		this.lkey = lkey;
	}
	
	public K rkey() {
		return rkey;
	}
	
	public void setRkey(K rkey) {
		this.rkey = rkey;
	}
	
	public V lvalue() {
		return lvalue;
	}
	
	public void setLvalue(V lvalue) {
		this.lvalue = lvalue;
	}
	
	public V rvalue() {
		return rvalue;
	}
	
	public void setRvalue(V rvalue) {
		this.rvalue = rvalue;
	}
	
	public Node<K, V> left() {
		return left;
	}
	
	public void setLeft(Node<K,V> left) {
		this.left = left;
	}
	
	public Node<K,V> middle() {
		return middle;
	}
	
	public void setMiddle(Node<K,V> middle) {
		this.middle = middle;
	}
	
	public Node<K,V> right() {
		return right;
	}
	
	public void setRight(Node<K,V> right) {
		this.right = right;
	}
	
	public boolean isLeaf() {
		return (left == null);
	}
	
	
	
}
