package compareObject;

public class Person implements Comparable<Person>{

	
	private int age;
	private int height;
	
	public Person(int age, int height) {
		this.setAge(age);
		this.setHeight(height);
	}

	public int age() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int height() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int compareTo(Person person) {
		// TODO Auto-generated method stub
		if (age < person.age()) {
			return -1;
		}	else if (age > person.age()) {
			return 1;
		}	else {
			return 0;
		}
	}
	
	
}
