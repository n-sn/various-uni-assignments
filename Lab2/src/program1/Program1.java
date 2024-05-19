package program1;

public class Program1 {

	int k = 0;


public static int sumIterative(int[] nums) {
	int sumIterative = 0;
	for (int i = 0; i < nums.length; i++) {
		
		sumIterative = sumIterative + nums[i];
		
	}
	return sumIterative;
}

public static int sumRecursive(int[] nums, int n) {
	
	//base case
	if (nums.length == 1) {
		return n + nums[0];
	}
	else if (nums.length > 1) {
		int[] newNums = new int[nums.length-1];
		//here we copy all but the last items from the nums array into the newNums array;
		for (int i = 0; i < (nums.length-1); i++) {
			newNums[i] = nums[i];
		}
		return sumRecursive(newNums, n + nums[nums.length-1]);
		
	}
	return 0;
	
}

public static int binarySearch(int[] nums, int key, int left, int right) {
	
	//base case
	
	if (left == right) {
		if (key == nums[left]) {
			return left;
		}
		else 
			return nums.length;
	}
	
	//general recursive function
	
	int mid = (left + right) / 2;
	if (key > nums[mid]) {
		left = mid + 1;
	} 
	else if (key < nums[mid]) {
		right = mid - 1;
	}
	else 
		return mid;
	return binarySearch(nums, key, left, right);
		
	
	}

	public static int fib(int num) {
	
		if (num == 1 || num == 2) {
			return 1;
		}
	
		return fib(num-2) + fib(num-1);
	

	}}