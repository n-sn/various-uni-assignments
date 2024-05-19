package twothreetree;

public class TwoThreeTreeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
		TwoThreeTree<Integer, Integer> tree = new TwoThreeTree<Integer, Integer>();
		
		//create root node
		tree.insert(5, 5);
		tree.insert(2, 2);
		tree.insert(6, 6);
		tree.insert(9, 9);
		tree.insert(4, 4);
		//tree.insert(10, 10);
		//tree.insert(1, 1);
		tree.inOrder();
		
		System.out.println();
		System.out.println();
**/
		
	
		TwoThreeTree<Integer, Integer> tree = new TwoThreeTree<Integer, Integer>();
		
		Integer[] nums = {5,2,6,9,4,10,1,8,15,20,14,30, 40, 12, 7};
		for (Integer num: nums) {
			tree.insert(num, num);
		}
		tree.inOrder();
	
		
		
		
	}

}
