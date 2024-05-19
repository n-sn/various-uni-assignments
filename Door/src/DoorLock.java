
public class DoorLock<Key> {
	private Key identifier;
	public DoorLock(Key identifier) {
		this.identifier = identifier;
	}
	public boolean check(Key identifier) {
		if (this.identifier.equals(identifier)) 
			return true; 
		else
			return false; 
	}
}
