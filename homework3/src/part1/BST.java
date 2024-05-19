package part1;

import java.util.*;

public class BST<K extends Comparable<K>, V> {
	
	private Node<K, V> root;
	private int numOfNodes;
	
	public BST() {
		root = null;
		numOfNodes = 0;
	}

	public void clear() {
		root = null;
		numOfNodes = 0;
	}
	
	public int numOfNodes()	{
		return numOfNodes;
	}
	
	private boolean lessThan(K value1, K value2) {
		if (value1.compareTo(value2) < 0) {
			return true;
		}	else {
			return false;
		}
	}
	
	private boolean largerThan(K value1, K value2) {
		if (value1.compareTo(value2) > 0) {
			return true;
		}	else {
			return false;
		}
	}
	
	private boolean equalTo(K value1, K value2) {
		if (value1.compareTo(value2) == 0) {
			return true;
		}	else {
			return false;
		}
	}
	
	public V find(K key) {
		return find(root, key);
	}
	
	private V find(Node<K,V> node, K key) {
		if (node == null) {
			return null;
		}
		
		if (lessThan(key, node.key())) {
			return find(node.left(), key);
		}	else if (largerThan(key, node.key())) {
			return find(node.right(), key);
		}	else {
			return node.value();
		}
		
	}
	
	public void insert(K key, V value) {
		root = insert(root, key, value);
		numOfNodes++;
	}
	/*
	private Node<K, V> insert(Node<K, V> node, K key, V value) {
		if (node == null) {
			return new Node<K,V>(key, value);
		}
		
		if (lessThan(key, node.key()) || equalTo(value, node.value())) {
			node.setLeft(insert(node.left(), value));
		}	else {
			node.setRight(insert(node.right(), value));
		}
		return node;
	}
	*/
	
	private Node<K, V> insert(Node<K,V> node, K key, V value)	{
		
		if (node == null)	{
			return new Node<K,V>(key, value);
		}
		
		if (lessThan(key, node.key())) {
			node.setLeft(insert(node.left(), key, value));;
		} else {
			node.setRight(insert(node.right(), key, value));;
		}
		return node;
	}
		
	
	private Node<K, V> findMin(Node<K,V> node) {
		if (node == null) {
			return null;
		}
		if (node.left() == null) {
			return node;
		}
		
	return findMin(node.left());
	}
	
	private Node<K, V> findMax(Node<K, V> node) {
		if (node == null) {
			return null;
		}
		if (node.right() == null) {
			return node;
		}
		return findMax(node.right());
	}
	
	public void remove(K value) {
		remove(root, value);
	}
	
	public Node<K, V> remove(Node<K, V> node, K key) {
		if (node == null) { //not found
			return null;
		}
		
		if (lessThan(key, node.key())) {
			node.setLeft(remove(node.left(), key));
		}	else if (largerThan(key, node.key())) {
			node.setRight(remove(node.right(), key));
		}	else {	// found
			if (node.left() == null) {
				return node.left();
			} else if (node.right() == null) {
				return node.left();
			}	else { //two children
				Node<K, V> temp = findMax(node.left());
				node.setValue(temp.value());
				node.setLeft(remove(node.left(), temp.key()));
			}
		}
		return node;
		
		
	}
	
	private void visit(Node<K, V> node) {
		System.out.println(node.value() + " ");
	}

	//@Override
	public void inOrder() {
		// TODO Auto-generated method stub
		inOrder(root);
		System.out.println();
		
	}
	
	private void inOrder(Node<K, V> node) {
		if (node == null) {
			return;
		}
		inOrder(node.left());
		visit(node);
		inOrder(node.right());
	}
	
	//@Override
	public void preOrder() {
		// TODO Auto-generated method stub
		preOrder(root);
		System.out.println();
	}

	private void preOrder(Node<K, V> node) {
		if (node == null) {
			return;
		}
		visit(node);
		preOrder(node.left());
		preOrder(node.right());
	}
	
	public void postOrder() {
		// TODO Auto-generated method stub
		postOrder(root);
		System.out.println();
	}
	
	private void postOrder(Node<K, V> node) {
		if (node == null) {
			return;
		}
		postOrder(node.left());
		postOrder(node.right());
		visit(node);
	}

	//@Override
	public int height() {
		// TODO Auto-generated method stub
		return height(root);
	}
	
	private int height(Node<K, V> node) {
		if (node.isLeaf()) {		//base case
			return 0;				//base case
		}							//base case
		
		else if (height(node.left()) >= height(node.right())) {	//general case
			return 1 + height(node.left());						//general case
		}
		else 
			return 1 + height(node.right());
	}
	
	//range search
	public ArrayList<V> find(K smallest, K largest)	{
		ArrayList<V> values = new ArrayList<V>();
		find(root, smallest, largest, values);
		return values;
	}
	
	public void find(Node<K,V> node, K smallest, K largest, ArrayList<V> values)	{
	
		inOrderRange(node, smallest, largest, values);
		
		
	}
	
	private ArrayList<V> inOrderRange(Node<K,V> node, K small, K large, ArrayList<V> values)	{
		if (node == null)
			return values;
		//recursive algorithm for putting books in range
		
		//start with the base case of any traversal algorithm – leaf processing
		if (node.isLeaf())	{
			//System.out.println(node.key());
			if (node == null)	
				return values;
				else
			if (node.key().compareTo(small) < 0)	{
				
				//if the leaf is smaller than the lower range range, then nothing is added
				return values;
			}	else 
			if (node.key().compareTo(large) > 0)	{
				
				//if the leaf is larger than the upper range range, then nothing is added
				return values;
			}	else 
				
				//if the leaf is not larger or smaller than the large or small range limits, we add
				values.add(node.value());
				return values;
		}
		//now that the base case has been processed, we are going to try something with the regular cases
		if (node.key().compareTo(small) < 0)	{
			
			//if the key is smaller than the small, then the left side is definititely out of range too, as well as the node itself. 
			//so we just continue to the RIGHT side to find something in range
			if (node.right() != null)	{
				inOrderRange(node.right(), small, large, values);
			}
			return values;
		}
		
		//now the same but for the case the key is higher than range
		if (node.key().compareTo(large) > 0)	{
			
			//if the key is larger than the large, then the right side is definitely out of range, as well as the node itself
			//so we just continue to the LEFT side to find something in range
			if (node.left() != null)	{ 
				inOrderRange(node.left(), small, large, values);
			}
			return values;
		}
		
		//now that we have processed all the cases with the values of the node out of range
		//we may continue assuming the node at this point is not a leaf or out of range
		values.add(node.value());
		if (node.left() != null) {
		inOrderRange(node.left(), small, large, values);
		}
		if (node.right() != null) {
		inOrderRange(node.right(), small, large, values);
		}
		
		return values; 
		
		
	}
	
	
	
	
	
	
}
