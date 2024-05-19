package binaryTree;

public class LBTreeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create a binary tree
		LBTree<Integer> tree = new LBTree<Integer>();
		
		//add value into tree
		int[] nums = {5,3,7,10,8,6,9};
		for (Integer num: nums) {
			tree.add(num);
		}
		
		//inOrder traversal
		tree.inOrder();
		System.out.println();
		
		//preOrder traversal
		tree.preOrder();
		System.out.println();
		
		//postOrder traversal
		tree.postOrder();
		System.out.println();
		
		System.out.println("height = " + tree.height());
		
	}

}
