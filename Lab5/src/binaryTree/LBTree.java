package binaryTree;

public class LBTree<T> implements BTree<T> {

	private Node<T> root;
	
	public LBTree() {
		root = null;
	}
	
	@Override
	public void add(T value) {
		// TODO Auto-generated method stub
		if (root == null) {
			Node<T> node = new Node<T>(value);
			root = node;
			return;
		}
		add(root, value);
	}
	
	private void add(Node<T> node, T value) {
		if (node.left() == null) {
			Node<T> child = new Node<T>(value);
			node.setLeft(child);
		}
		else if (node.right() == null) {
			Node<T> child = new Node<T>(value);
			node.setRight(child);
		}
		else {
			node = node.left();
			add(node, value);
		}
	}

	private void visit(Node<T> node) {
		System.out.print(node.value() + " ");
	}

	@Override
	public void inOrder() {
		// TODO Auto-generated method stub
		inOrder(root);
		
	}
	
	private void inOrder(Node<T> node) {
		if (node == null) {
			return;
		}
		inOrder(node.left());
		visit(node);
		inOrder(node.right());
	}
	
	@Override
	public void preOrder() {
		// TODO Auto-generated method stub
		preOrder(root);
	}

	private void preOrder(Node<T> node) {
		if (node == null) {
			return;
		}
		visit(node);
		preOrder(node.left());
		preOrder(node.right());
	}
	
	@Override
	public void postOrder() {
		// TODO Auto-generated method stub
		postOrder(root);
	}
	
	private void postOrder(Node<T> node) {
		if (node == null) {
			return;
		}
		postOrder(node.left());
		postOrder(node.right());
		visit(node);
	}

	@Override
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
