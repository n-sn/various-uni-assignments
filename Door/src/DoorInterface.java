
public interface DoorInterface<Key> {
	boolean open();
	boolean unlock(Key keys);
	void close();
	boolean lock(Key keys);	
	boolean isOpen();
}
