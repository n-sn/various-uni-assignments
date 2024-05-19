package sorting;

import priorityQueue.MinHeap;

public class Sorting<T extends Comparable<T>>  {

	
	//--------checking number of comparisons----------//
	private int numOfComparison;
	
	public Sorting() {
		numOfComparison = 0;
	}
	
	public int numOfComparison() {
		return numOfComparison;
	}
	
	public void setNumOfComparison(int numOfComparison) {
		this.numOfComparison = numOfComparison;
	}
	
	//-------------||----------//
	
	private boolean lessThan(T data1, T data2) {
		numOfComparison++;
		if (data1.compareTo(data2) < 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	private boolean largerThan(T data1, T data2) {
		numOfComparison++;
		if (data1.compareTo(data2) > 0) {
			return true;
		}	else 	{
			return false;
		}
	}
	
	
	private boolean equalTo(T data1, T data2) {
		numOfComparison++;
		if (data1.compareTo(data2) == 0) {
			return true;
		}	else	{
			return false;
		}
		
		
	}
	
	
	
	private void swap(T[] arr, int index1, int index2) {
		T temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	
	public void show(T[] arr, String whichSort) {
		System.out.print(whichSort + ": ");
		for (T data: arr) {
			System.out.print(data + " ");
		}
		System.out.println();
		
	}
	
	
	public void insertionSort(T[] arr) {
		
		for (int i=1; i < arr.length; i++) {
			for (int j=i; j > 0 ;j-- ) {
				if (lessThan(arr[j], arr[j-1])) {
					swap(arr, j, j-1);
				}	else	{
					break; 	//exit intner(j) for loop
							//that is,
							//stop moving to the left
				}
			}
		}
		
	}
	
	
	
	
	
	
	
	public void bubbleSort(T[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (largerThan(arr[j], arr[j+1])) {
					swap(arr,j,j+1);
				}
			}
		}
		
	}
	
	
	
	public void selectionSort(T[] arr) {
		
		int largestIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			largestIndex = 0;
			for (int j = 1; j < arr.length - i; j++) {
				if (largerThan(arr[j], arr[largestIndex]))	{
					largestIndex = j;
				}
			}
			swap(arr, largestIndex, arr.length-1-i);
		}
		
	}
	
	
	
	private int getMaxIncrement(T[] arr) {
		
		int base = 2, exponent = 0;
		while (Math.pow(base, exponent) < arr.length) {
			exponent++;
		}
		return (int)Math.pow(base, exponent-1);
		
	}
	
	public void shellSort(T[] arr) {
		
		System.out.println("max increment: " + getMaxIncrement(arr));
		for (int i = getMaxIncrement(arr); i >=1; i/=2) {
			System.out.println("increment    : " + i);
			insertionSort(arr,i);
		}
		
	}
	
	
	private void insertionSort(T[] arr, int incr) {
		
		for (int start = 0; start < incr; start++) {
			insertionSort(arr, start, incr);
		}
		show(arr, "shellSort    ");
		
	}
	
	
	
	private void insertionSort(T[] arr, int start, int incr) {
		
		for (int i = start+incr; i < arr.length; i += incr) {
			for (int j = i; j > start; j -= incr) {
				if (lessThan(arr[j], arr[j - incr])) {
					swap(arr, j, j-incr);
				}	else {
					break;
				}
			}
		}
		
	}
	

	public void heapSort(T[] arr) {
		//create a min heap after heapify
		MinHeap<T>	heap = new MinHeap<T>(100, arr);
		
		/*
		 * get smallest values repeatedly, and put the back to array
		 * 
		 */
		
		int index = 0;
		while (heap.size() > 0)	{
			arr[index++]	= heap.get();
		}
	}
	
	
	
	
	public void mergeSort(T[] arr) {
		T[] temp = (T[])new Comparable[arr.length];
		mergeSort(arr, temp, 0, arr.length-1);
	}
	
	
	private void mergeSort(T[] arr, T[] temp, int first, int last)	{
		
		/*------------
		 * Base case
		 */
		
		if (first == last)	{
			return;
		}
		
		/*
		 * General function
		 */
		
		//hoing down: dividing
		
		int mid = (first + last)/2;
		mergeSort(arr, temp, first, mid);
		mergeSort(arr, temp, mid+1, last);
		//going up: mergint
		for (int i = first; i<=last; i++)	{
			temp[i] = arr[i];
		}
		
		int left = first;
		int right = mid+1;
		for (int i = first; i <= last; i++)	{
			if (isLeftEmpty(left, mid)) {
			arr[i] = temp[right++];
		} else if (isRightEmpty(right, last))	{
			arr[i] = temp[left++];
		}	else {
			if (lessThan(temp[left], temp[right]) ||
				equalTo(temp[left], temp[right]))	{
				arr[i] = temp[left++];
			}	else {
				arr[i] = temp[right++];
			}
				
				
				
				
		}
		
	}
	}

	//is left subset emptY?
	private boolean isLeftEmpty(int index, int mid)	{
		if (index == mid+1)	{
			return true;
		}	else	{
			return false;
		}
	}
	
	
	//is right subset empty?
	private boolean isRightEmpty(int index, int end)	{
		if (index > end)	{
			return true;
		}	else	{
			return false;
		}
	}
	
	
	
	public void quickSort(T[] arr)	{
		quickSort(arr, 0, arr.length-1);
	}
	
	private void quickSort(T[] arr, int first, int last)	{
		//STEP1. switch pivot with the last element
		int pivotIndex = pivot(arr, first, last);
		swap(arr, pivotIndex, last);
		
		/*
		 * step2. partition
		 * 			move data(less than pivot) to the left
		 * 			move data(larger than pivot) to the right
		 */
		int partitionIndex = partition(arr, first, last-1, arr[last]);
		swap(arr, partitionIndex, last);
		
		/*
		 * STEP3. 	quick sort with left subset
		 * 							(with more than one data)
		 */
		
		if (isLeftMoreThanOne(first, partitionIndex, last))	{
			quickSort(arr, first, partitionIndex-1);
		}
		
		/*
		 * 
		 * STEP 4. quick sort iwth right subset 
		 * 						(with more than one data)
		 */
		if (isRightMoreThanOne(first, partitionIndex, last))	{
			quickSort(arr, partitionIndex+1, last);
		}
	}
	
	private int partition(T[] arr, int left, int right, T pivot)	{
		while (left <= right)	{
			//keep moving to the right and
			//find left subset with smaller data than pivot
			while (lessThan(arr[left], pivot))	{
				left++;
			}
			
			//keep moving to the left and
			//find right subset with larger
			//(or equal) data than pivot
			while ((right >= left) &&
					largerThan(arr[right], pivot))	{
				right--;
			}
			if (right > left)	{
				swap(arr, left, right);
			}
		}
		return left;
	}
	
	private boolean isLeftMoreThanOne(int first, int partitionIndex, int last)	{
		if ((partitionIndex - first) > 1)	{
			return true;
		}	else	{
			return false;
		}
	}
	
	private boolean isRightMoreThanOne(int first, int partitionIndex, int last)	{
		if ((last - partitionIndex) > 1)	{
			return true;
		}	else 	{
			return false;
		}
	}
	
	
	private int pivot(T[] arr, int first, int last)	{
		return (first + last)/2;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
