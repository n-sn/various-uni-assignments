package part2;

public class Part2Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1, 2, 3, 4, 5};
		
		int key = 2;
		System.out.println("Position of " + key + ":" + Part2.linearSearch(nums, key));
	
		int left = 0;
		int right = nums.length-1;
		System.out.println("Position of " + key + ":" + Part2.binarySearch(nums, key, left, right));	
	
		//Testing the programs with numbers sorted in ascending order
		System.out.println("Now we test the programs with custom nubmers in arrays");
		int[] nums1 = {1, 23, 34, 45, 56, 67, 78, 89, 90, 109};
		key = 34;
		System.out.println("Position (iterative) of " + key + ":" + Part2.linearSearch(nums1, key));
		right = nums1.length-1;
		System.out.println("Position (recursive) of " + key + ":" + Part2.binarySearch(nums1, key, left, right));	
		
		//Testing the programs with key not in the array;
		System.out.println("Now we test the program with keys not in the array");
		key = 42;
		System.out.println("Position (iterative) of " + key + ":" + Part2.linearSearch(nums1, key));
		right = nums1.length-1;
		System.out.println("Position (recursive) of " + key + ":" + Part2.binarySearch(nums1, key, left, right));	
		
		
	}
}
