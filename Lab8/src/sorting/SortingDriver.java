package sorting;


public class SortingDriver {
	public static void main(String[] args) {
		
		Sorting<Integer> obj = new Sorting<Integer>();
		Integer[] nums = {5, 1, 4 ,2};
		
		obj.show(nums, "initial     ");
		
		//insertion sort
		obj.setNumOfComparison(0);
		obj.insertionSort(nums);
		obj.show(nums,  "insertionSort");
		System.out.println("# of comparison: " + obj.numOfComparison());
		
		//nunnle sort
		nums = new Integer[] {5, 1, 4, 2};
		obj.setNumOfComparison(0);
		obj.bubbleSort(nums);
		obj.show(nums,  "bubbleSort    ");
		System.out.println("# of comparison: " + obj.numOfComparison());
		
		//selection sort
		nums = new Integer[] {5, 1, 4, 2};
		obj.setNumOfComparison(0);
		obj.selectionSort(nums);
		obj.show(nums, "selectionSort");
		System.out.println("# of comparison: " + obj.numOfComparison());
		System.out.println();
		
		
		//shell sort
		nums = new Integer[] {12, 5, 9, 4, 3, 1, 2, 7, 8, 10};
		obj.setNumOfComparison(0);
		obj.shellSort(nums);
		obj.show(nums, "shellSort    ");
		System.out.println("# of comparison: " + obj.numOfComparison());
		
		System.out.println();
		System.out.println("comparing all the comparison numbers with the same initial set");
		System.out.println();
		
	
		
		//insertion sort
		
		nums = new Integer[] {12, 5, 9, 4, 3, 1, 2, 7, 8, 10};
		
		obj.show(nums, "initial     ");
		obj.setNumOfComparison(0);
		obj.insertionSort(nums);
		obj.show(nums,  "insertionSort");
		System.out.println("# of comparison: " + obj.numOfComparison());
		
		//nunnle sort
		nums = new Integer[] {12, 5, 9, 4, 3, 1, 2, 7, 8, 10};
		obj.setNumOfComparison(0);
		obj.bubbleSort(nums);
		obj.show(nums,  "bubbleSort    ");
		System.out.println("# of comparison: " + obj.numOfComparison());
		
		//selection sort
		nums = new Integer[] {12, 5, 9, 4, 3, 1, 2, 7, 8, 10};
		obj.setNumOfComparison(0);
		obj.selectionSort(nums);
		obj.show(nums, "selectionSort");
		System.out.println("# of comparison: " + obj.numOfComparison());
		System.out.println();
		
		//shell sort
		nums = new Integer[] {12, 5, 9, 4, 3, 1, 2, 7, 8, 10};
		obj.setNumOfComparison(0);
		obj.shellSort(nums);
		obj.show(nums, "shellSort    ");
		System.out.println("# of comparison: " + obj.numOfComparison());
		
		
		System.out.println();
		
		//heap sort
		nums = new Integer[] {5 ,1, 4, 2};
		obj.heapSort(nums);
		obj.show(nums,  "heapSort       ");
		System.out.println();
		
		
		
		//merge sort
		nums = new Integer[] {5, 1, 4, 2};
		obj.mergeSort(nums);
		obj.show(nums,  "mergeSort    ");
		System.out.println();
		
		
		//quick sort
		nums = new Integer[] {5, 1, 4, 2};
		obj.quickSort(nums);
		obj.show(nums, "quickSort     ");
		System.out.println();
		
	}

}
