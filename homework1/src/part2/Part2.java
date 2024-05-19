package part2;

public class Part2 {

	public static int linearSearch(int[] nums, int key) {
		for (int i = 0; i < nums.length; i++) {
			if (key == nums[i]) {
				return i;
			}
		}
		return nums.length;
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
	}


