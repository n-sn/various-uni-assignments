package program2;

public class AListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create a list
		AList<Integer> list = new AList<Integer>(5);
		
		//append three elements
		list.append(2);
		list.append(4);
		list.append(6);
		list.show();
		
		
		//move current position to1, and insert an element
		list.moveToPos(1);
		list.insert(5);
		list.show();
		
		//remove element at current position
		int num = list.remove();
		System.out.println("removed number: " + num);
		list.show();
		
		//show the first element
		list.moveToStart();
		System.out.println("first: " + list.getValue());
		
		//move to end, and check if the current positon is at end
		list.moveToEnd();
		System.out.println("last: " + list.getValue());
		
		System.out.println("is the element at end?: " + list.isAtEnd());
		
		//show previous and next elements of an elenet
		list.prev();
		list.prev();
		System.out.println(list.getValue() + ", " + "position: " + list.currPos());
		list.next();
		System.out.println(list.getValue() + ", " + "position: " + list.currPos());
		
		//show all elements
		list.show();
		list.showAll();
		
		//check if an element with value exists
		int k = 4;
		System.out.println(k + " exist?: " + list.find(k));
		k = 10;
		System.out.println(k + " exist?:" + list.find(k));
	}

}
