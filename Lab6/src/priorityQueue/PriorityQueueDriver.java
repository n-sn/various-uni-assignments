package priorityQueue;

public class PriorityQueueDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//-----------------
		// STEP1: enqueue/dequeue with empty priotity ququee
		//...........
		//create priority queue
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		//add data into queue
		int[] nums = {3,10,6,21,14};
		for (Integer num: nums) {
			queue.enqueue(num);
		}
		queue.show();
		
		//insert data
		queue.enqueue(1);
		queue.show();
		
		//get data from queue
		System.out.println("get data: " + queue.dequeue());
		queue.show();
		System.out.println("get data: " + queue.dequeue());
		queue.show();
		
		//-----------------
		//STEP2: priority queue with values
		//--------------------
		System.out.println();
		Integer[] nums1 = {46,73,18,50,35,99,42,29,90,31};
		PriorityQueue<Integer> queue1 = new PriorityQueue<Integer>(nums1);
		queue1.show();
		//get data from queue
		System.out.println("get data: " + queue1.dequeue());
		queue1.show();
		
		//insert data into queue
		queue1.enqueue(1);
		queue1.show();
		
	}

}
