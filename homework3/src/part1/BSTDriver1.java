package part1;

import java.util.*;

public class BSTDriver1 {

	public static void show(ArrayList<Book> books) {
		for (Book book: books) {
			book.show();
		}
	}
	
	
	public static void main(String[] args) {
		
		
		
		//create binary search tree
		//node: <key: ISBN (String), value: Book object>
		BST<Double, Book> bst = new BST<Double, Book>();
		
		//add nodes
		String isbn = "978-1292153599";
		bst.insert(150.0, new Book(isbn, "Big Data Analysis", "Danny", 150, 2019));
		isbn = "978-1292153589";
		bst.insert(70.0, new Book(isbn, "Data Structure", "Kim", 70, 2020));
		isbn = "978-1292153612";
		bst.insert(120.0, new Book(isbn, "Big Data Transfer", "Sarah", 120, 2021));
		isbn = "978-1292153566";
		bst.insert(50.0, new Book(isbn, "Algorithm", "Daehee", 50, 2019));
		isbn = "978-1292153592";
		bst.insert(100.0,  new Book(isbn, "Ecommerce Systems Design", "Danny", 100, 2020));
		isbn = "978-1292153600";
		bst.insert(80.0, new Book(isbn, "Java Programming", "Kim", 80, 2019));
		isbn = "978-1292153620";
		bst.insert(130.0,  new Book(isbn, "Android Mobile Development", "Daehee", 130, 2020));
		

		
		//find nodes(90 <= key <= 120)
		double minPrice = 90.0;
		double maxPrice = 120.0;
		ArrayList<Book> books = bst.find(minPrice, maxPrice);
		BSTDriver1.show(books);
		System.out.println();
		
		//create a BST with nodes(key: year, value: book)
		BST<Integer, Book> bst1 = new BST<Integer, Book>();
		
		isbn = "978-1292153599";
		bst1.insert(2019, new Book(isbn, "Big Data Analysis", "Danny", 150, 2019));
		isbn = "978-1292153589";
		bst1.insert(2020, new Book(isbn, "Data Structure", "Kim", 70, 2020));
		isbn = "978-1292153612";
		bst1.insert(2021, new Book(isbn, "Big Data Transfer", "Sarah", 120, 2021));
		isbn = "978-1292153566";
		bst1.insert(2019, new Book(isbn, "Algorithm", "Daehee", 50, 2019));
		isbn = "978-1292153592";
		bst1.insert(2020,  new Book(isbn, "Ecommerce Systems Design", "Danny", 100, 2020));
		isbn = "978-1292153600";
		bst1.insert(2019, new Book(isbn, "Java Programming", "Kim", 80, 2019));
		isbn = "978-1292153620";
		bst1.insert(2020,  new Book(isbn, "Android Mobile Development", "Daehee", 130, 2020));
		
		
		//find nodes (2019 <= year <= 2010)
		int minYear = 2019;
		int maxYear = 2020;
		books = bst1.find(minYear, maxYear);
		BSTDriver1.show(books);
		
		
	}
}
