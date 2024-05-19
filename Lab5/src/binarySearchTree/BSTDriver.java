package binarySearchTree;

public class BSTDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BST<Integer> bst = new BST<Integer>();
		
		int[] nums = {37,24,42,7,32,44,120,2,30,40};
		for(Integer num: nums) {
			bst.insert(num);
		}
		bst.inOrder();
		//find nodes
		int value = 24;
		System.out.println("find " + value + ": " + bst.find(value));
		value = 50;
		System.out.println("find " + value + ": " + bst.find(value));
		
		//remove nodes - leaf
		bst.remove(30);
		bst.inOrder();
		
		//remove nodes - with one child
		bst.remove(32);
		bst.remove(7);
		bst.remove(24);
		bst.inOrder();
	
		//remove nodes - with two children
		bst.clear();
		for (Integer num: nums) {
			bst.insert(num);
		}
		bst.remove(37);
		bst.inOrder();
	}


}
