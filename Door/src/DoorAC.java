
public abstract class DoorAC {

	public String material;
	public String colour;
	public boolean closed;
	
	
	public DoorAC() {
		this.closed = true;
	}

	public boolean open() {
		this.closed = false;
		return true;
	}

	public void close() {
		closed = true;
		}

	public boolean isOpen() {
		return closed ? false : true;
	}
	
	public boolean push() {
		return isOpen() ? true : false;
	}
	public void setMaterial(String desc) {
		this.material = desc;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	

}
