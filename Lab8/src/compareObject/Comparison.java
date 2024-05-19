package compareObject;

public class Comparison<T extends Comparable<T>> {

	public boolean largerThan(T person1, T person2) {
		if (person1.compareTo(person2) > 0)
			return true;
		else 
			return false;
	}
	
	public boolean lessThan(T person1, T person2)	{
		if (person1.compareTo(person2) < 0)
			return true;
		else
			return false;
	}
	
	public boolean equalTo(T person1, T person2)	{
		if (person1.compareTo(person2) == 0)
			return true;
		else
			return false;
	}
	
}
