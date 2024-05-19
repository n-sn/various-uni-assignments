package compareObject;

public class ComparisonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create two Person objects <age, height>
		Person danny = new Person(20, 72);
		Person kim = new Person(35, 68);
		
		//compare two objects based on age.
		if (danny.compareTo(kim) > 0) {
			System.out.println("Danny is larger than Kim");
		}	else if (danny.compareTo(kim) < 0)	{
			System.out.println("Danny is less than Kim");
		}	else	{
			System.out.println("Danny is the same as Kim");
		}
		
		
		//create Comparison object
		Comparison obj = new Comparison();
		
		//create two person object
		Person sarah = new Person(70, 60);
		Person daisy = new Person(15, 40);
		
		//compare two objects based o age
		if (obj.largerThan(sarah, daisy)) {
			System.out.println("Sarah is larger than Daisy");
		}	else if (obj.lessThan(sarah, daisy))	{
			System.out.println("Sarah is less than Daisy");
		}	else if (obj.equalTo(sarah, daisy))	{
			System.out.println("Sarah is the same as Diasy");
		}
		
		
	}

}
