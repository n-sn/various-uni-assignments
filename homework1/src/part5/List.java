package part5;

public interface List<T> {

	// remove all contents
    public void clear();
    
    // Insert "it" at the current location
    // list's capacity should not be exceeded
    public boolean insert(T it);
    
    //Append "it" at the end of the list
    // list's capacity should not be exceeded
    public boolean append(T it);
    
    // remove and return the current element
    public T remove();
    
    // set the current position to the start of the list
    public void moveToStart();
    
    // set the current position to the end of the list
    public void moveToEnd();
    
    // move the current position one step left,
    // no change if already at beginning
    public void prev();
    
    // move the current position one step right,
    // no change if already at end
    public void next();
    
    // return the number of elements in the list
    public int length();
    
    // return the position of the current element
    public int currPos();
    
    // set the current position to "pos"
    public boolean moveToPos(int pos);
    
    // return true if current position is at end of the list
    public boolean isAtEnd();
    
    // return the current element
    public T getValue();
    
    // show all elements in the list
    public void show();
    public void showAll();
    
    // find an element with k
    // return true if the element exists. Otherwise, false
    public boolean find(T k);
	
}
