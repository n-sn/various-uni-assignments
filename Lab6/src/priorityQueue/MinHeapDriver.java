package priorityQueue;

public class MinHeapDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//----------------------
		// STEP1: insert() and get()
		//----------------------
		//create heap
		MinHeap<Integer> heap = new MinHeap<Integer>(100);
		int[] nums = {3, 10, 6, 21, 14};
		for (Integer num: nums) {
			heap.insert(num);
		}
		heap.show();
		
		//insert data into heap
		heap.insert(1);
		heap.show();
		
		// get data from heap
		System.out.println("get data: " + heap.get());
		heap.show();
		System.out.println("get data: " + heap.get());
		heap.show();
		
		//-----------------
		//STEOP 2: buildHeap()
		//-----------
		//create another heap
		
		System.out.println();
		Integer[] nums1 = {46, 73, 18, 50, 35, 99, 42, 29, 90, 31};
		MinHeap<Integer> heap1 = new MinHeap<Integer>(100, nums1);
		heap1.show();
		
		//get data from heap
		System.out.println("get data: " + heap1.get());
		heap1.show();
		
		// inser data
		heap1.insert(1);
		heap1.show();
		
		
	}

}
