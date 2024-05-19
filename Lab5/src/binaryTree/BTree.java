package binaryTree;

public interface BTree<T> {

	void add(T value);
	
	void inOrder();
	
	void preOrder();
	
	void postOrder();
	
	int height();
	
}
