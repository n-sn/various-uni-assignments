package binarySearchTree;

import binaryTree.Node;

public class BST<T extends Comparable<T>> {
	
	private Node<T> root;
	
	public BST() {
		root = null;
	}

	public void clear() {
		root = null;
	}
	
	private boolean lessThan(T value1, T value2) {
		if (value1.compareTo(value2) < 0) {
			return true;
		}	else {
			return false;
		}
	}
	
	private boolean largerThan(T value1, T value2) {
		if (value1.compareTo(value2) > 0) {
			return true;
		}	else {
			return false;
		}
	}
	
	private boolean equalTo(T value1, T value2) {
		if (value1.compareTo(value2) == 0) {
			return true;
		}	else {
			return false;
		}
	}
	
	public T find(T value) {
		return find(root, value);
	}
	
	private T find(Node<T> node, T value) {
		if (node == null) {
			return null;
		}
		
		if (lessThan(value, node.value())) {
			return find(node.left(), value);
		}	else if (largerThan(value, node.value())) {
			return find(node.right(), value);
		}	else {
			return node.value();
		}
		
	}
	
	public void insert(T value) {
		root = insert(root, value);
	}
	
	private Node<T> insert(Node<T> node, T value) {
		if (node == null) {
			return new Node<T>(value);
		}
		
		if (lessThan(value, node.value()) || equalTo(value, node.value())) {
			node.setLeft(insert(node.left(), value));
		}	else {
			node.setRight(insert(node.right(), value));
		}
		return node;
	}
	
	private Node<T> findMin(Node<T> node) {
		if (node == null) {
			return null;
		}
		if (node.left() == null) {
			return node;
		}
		
	return findMin(node.left());
	}
	
	private Node<T> findMax(Node<T> node) {
		if (node == null) {
			return null;
		}
		if (node.right() == null) {
			return node;
		}
		return findMax(node.right());
	}
	
	public void remove(T value) {
		remove(root, value);
	}
	
	public Node<T> remove(Node<T> node, T value) {
		if (node == null) { //not found
			return null;
		}
		
		if (lessThan(value, node.value())) {
			node.setLeft(remove(node.left(), value));
		}	else if (largerThan(value, node.value())) {
			node.setRight(remove(node.right(), value));
		}	else {	// found
			if (node.left() == null) {
				return node.left();
			} else if (node.right() == null) {
				return node.left();
			}	else { //two children
				Node<T> temp = findMax(node.left());
				node.setValue(temp.value());
				node.setLeft(remove(node.left(), temp.value()));
			}
		}
		return node;
		
		
	}
	
	private void visit(Node<T> node) {
		System.out.print(node.value() + " ");
	}

	//@Override
	public void inOrder() {
		// TODO Auto-generated method stub
		inOrder(root);
		System.out.println();
		
	}
	
	private void inOrder(Node<T> node) {
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

	private void preOrder(Node<T> node) {
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
	
	private void postOrder(Node<T> node) {
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
	
	private int height(Node<T> node) {
		if (node.isLeaf()) {		//base case
			return 0;				//base case
		}							//base case
		
		else if (height(node.left()) >= height(node.right())) {	//general case
			return 1 + height(node.left());						//general case
		}
		else 
			return 1 + height(node.right());
	}
	
	
}
