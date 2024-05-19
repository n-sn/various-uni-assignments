package part1;

public class BookDriver {

	public static void main(String[] args) {
		
		Book book1 = new Book(	"978-1292153599", 
								"Big Data Analysis",
								"Danny",
								150,
								2019);
		
		Book book2 = new Book(	"978-1292153589",
								"Data Structure",
								"Kim",
								70,
								2020);
								
		System.out.println(book1.toString());
		System.out.println(book1);
		System.out.println();
		
		System.out.println(book2.toString());
		System.out.println(book2);
		

	}
	
}
