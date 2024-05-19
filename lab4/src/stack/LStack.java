package stack;

public class LStack<T> implements Stack<T> {

	private Node<T> top;
	private int size;
	
	public LStack() {
		top = null;
		size = 0;
	}
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		top = null;
		size = 0;
	}

	@Override
	public boolean push(T it) {										//Error here when using T instead of object;
		Node<T> newNode = new Node<T>(it);
		if (top != null) {
			newNode.setNext(top);
		}
		top = newNode;
		size++;
		return true;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if (top == null) {
			return null;
		}
		T it = top.value();
		top = top.next();
		size--;
		return it;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if (top == null) {
			return null;
		}
		return top.value();
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return size;
	}

}
