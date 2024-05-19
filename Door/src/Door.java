
public class Door<Key> extends DoorAC implements DoorInterface<Key>  {

	private boolean locked;
	private DoorLock<Key> doorlock;
	
	public Door() {
		this.closed = true;
		this.locked = false;
	}
	public Door(DoorLock<Key> doorlock) {
		this.doorlock = doorlock;
		this.closed = true;
		this.locked = false;
	}
	@Override
	public boolean open() {
		if (locked)	{
			return false;
		} else {
			closed = false;
			return true;
		}
	}
	@Override
	public boolean unlock(Key keys) {
		if (this.doorlock.check(keys)) {
			locked = false;
			return true;
		}	else 
			return false;
	}
	@Override
	public void close() {
		closed = true;
		}
	@Override
	public boolean lock(Key keys) {
		if (this.doorlock.check(keys)) {
			this.close(); 
			locked = true;
			return true;
		}	else 
			return false;
	}
	@Override
	public boolean isOpen() {
		if (closed)
			return false;
		else
			return true;
	}		
}