package stack;

public class StackAppDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5; 
		int[] nums = {3, 2, 5, 4};
		StackApp obj = new StackApp();
		System.out.println("fact(" + n + "): " + obj.fact(n));
		System.out.println("sum(" + n + "): " + obj.sum(n));
		obj.reverse(nums);
		
		//Exercise: 
		int nEx = 10; 
		int[] numsEx = {3,7,8,2,4,10,1,23,13,9,5};
		System.out.println("fact(" + nEx + "): " + obj.fact(nEx));
		System.out.println("sum(" + nEx + "): " + obj.sum(nEx));
		obj.reverse(numsEx);
	}

}
