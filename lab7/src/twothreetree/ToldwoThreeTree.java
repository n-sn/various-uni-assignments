package twothreetree;

public class TwoThreeTree<K extends Comparable<K>, V> {

	
	private Node<K,V> root;
	
	
	public TwoThreeTree() {
		root = null;
	}
	
	private boolean lessThan(K key1, K key2) {
		if (key1.compareTo(key2) < 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean largerThan(K key1, K key2) {
		if (key1.compareTo(key2) > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean equalTo(K key1, K key2) {
		if (key1.compareTo(key2) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private void visitLKey(Node<K,V> node) {
		System.out.print(node.lkey() + " ");
	}
	
	private void visitRKey(Node<K,V> node) {
		System.out.print(node.rkey() + " | ");
	}
	
	public void inOrder() {
		inOrder(root);
		System.out.println();
	}
	
	private void inOrder(Node<K,V> node) {
		if (node == null) {
			return;
		}
		inOrder(node.left());
		visitLKey(node);
		inOrder(node.middle());
		visitRKey(node);
		inOrder(node.right());
	}
	
	public void insert(K key, V value) {
		root = insert(root, key, value);
	}
	
	private Node<K,V> insert(Node<K,V> node, K key, V value) {
		Node<K,V> retNode = null;
		
		//empty tree: no root
		if(node == null) {
			return new Node<K,V>(key, value);
		}
		
		//leaf node
		if (node.isLeaf()) {
			return add(node, new Node<K,V>(key, value));
		}
		
		//internal node
		if (lessThan(key, node.lkey())) {
			retNode = insert(node.left(), key, value);
			
			if (retNode == node.left()) {
				return node;
			} else {
				return add(node, retNode);
			}
			
		}	else if (node.rkey() == null || lessThan(key, node.rkey())) {
			retNode = insert(node.middle(), key, value);
			if (retNode == node.middle()) {
				return node;
			}	else {
				return add(node, retNode);
			}
		} else {
			retNode = insert(node.right(), key, value);
			if (retNode == node.right()) {
				return node;
			} else {
				return add(node, retNode);
			}
		}
		
		//return retNode;
	}
	
	public Node<K,V> add(Node<K,V> currNode, Node<K,V> newNode) {
		
		K key = newNode.lkey();
		V value = newNode.lvalue();
		
		//---------------------
		// only one key in existing node
		//------------
		if (currNode.rkey() == null) {
			
			//add to right
			if (largerThan(key, currNode.lkey()) || equalTo(key, currNode.lkey())) {
				
				//set key/value
				currNode.setRkey(key);
				currNode.setRvalue(value);
				
				
				//change links of subtrees
				currNode.setMiddle(newNode.left());
				currNode.setRight(newNode.middle());
				
				
			//add to left
			}	else {
				// set key/value
				currNode.setRkey(currNode.lkey());
				currNode.setRvalue(currNode.lvalue());
				currNode.setLkey(key);
				currNode.setLvalue(value);
				
				//change links of subtrees
				currNode.setRight(currNode.middle());
				currNode.setMiddle(newNode.middle());
				
			}
		}
		
		//----------
		// two key in existing node
		//-----------
		// add left
		else if (lessThan(key, currNode.lkey())) {
			
			//create a new parent Node (to move up= with middle wallue
			K middleKey = currNode.lkey();
			V middleValue = currNode.lvalue();
			Node<K,V> parentNode = new Node<K,V>(middleKey, middleValue);
			
			Node<K,V> leftNode = newNode;
			Node<K,V> middleNode = currNode;
			
			//split a node
			//leftNode: new node, middleNode: existing node
			parentNode.setLeft(leftNode);
			parentNode.setMiddle(middleNode);
			
			//update data in current node
			middleNode.setLkey(currNode.rkey());
			middleNode.setLvalue(currNode.rvalue());
			middleNode.setRkey(null);
			middleNode.setRvalue(null);
			
			//change links to subtrees
			middleNode.setLeft(middleNode.middle());
			middleNode.setMiddle(middleNode.right());
			middleNode.setRight(null);
			
			//move up
			return parentNode;
			
		}
		
		//add middle
		else if (lessThan(key, currNode.rkey())) {
			
			
			//parent node with middle value
			Node<K,V> parentNode = newNode; //newNode: node that moved up from children
			Node<K,V> middleNode = new Node<K,V>(currNode.rkey(), currNode.rvalue());
			Node<K,V> leftNode = currNode;
			
			//has teporarily to change links of subtrees later
			Node<K,V> parentNodeLeftSubtree = parentNode.left();
			Node<K,V> parentNodeMiddleSubtree = parentNode.middle();
			Node<K,V> currNodeRightSubtree = parentNode.right();
			
			//split a node
			
			//lefTNode: existing Node, middleNode: new node
			parentNode.setLeft(leftNode);
			parentNode.setMiddle(middleNode);
			
			//update data in current node
			leftNode.setRkey(null);
			leftNode.setRvalue(null);
			leftNode.setRight(null);
			
			//change links of sutrees
			leftNode.setMiddle(parentNodeLeftSubtree);
			middleNode.setLeft(parentNodeMiddleSubtree);
			middleNode.setMiddle(currNodeRightSubtree);
			
			
			//move up
			return parentNode;
			
			
			
			
		}
		
		//add right
		else {
			//create a new parent node (to move up) with middle value
			K middleKey = currNode.rkey();
			V middleValue = currNode.rvalue();
			Node<K,V> parentNode = new Node<K,V>(middleKey, middleValue);
			
			Node<K,V> leftNode = currNode;
			Node<K,V> middleNode = newNode;
			
			//has temporarily to change links of subtrees later
			Node<K,V> leftNodeRightSubtree = leftNode.right();
			
			//split a node
			//leftNode: existing Node, middleNode: new node
			parentNode.setLeft(leftNode);
			parentNode.setMiddle(middleNode);
			
			//update data in current node
			leftNode.setRkey(null);
			leftNode.setRvalue(null);
			leftNode.setRight(null);
			
			//change links of subtrees
			middleNode.setLeft(leftNodeRightSubtree);
			
			//move up
			return parentNode;
			
		}
	return currNode;
	
	
	}
	
	
	
	
	
	
}
