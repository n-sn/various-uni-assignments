
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoorLock<Integer> mainlock = new DoorLock<Integer>(256555611);
		System.out.println(mainlock.check(256555611));
		
		Door maindoor = new Door(mainlock);
		
		System.out.println(maindoor.isOpen());
		maindoor.open();
		System.out.println(maindoor.isOpen());
		maindoor.close();
		System.out.println(maindoor.isOpen());
		maindoor.lock(256555611);
		System.out.println(maindoor.open());
		maindoor.unlock(256555611);
		System.out.println(maindoor.open());
		
	}

}
