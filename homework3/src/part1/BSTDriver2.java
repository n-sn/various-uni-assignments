package part1;


import java.util.*;
import java.io.*;

public class BSTDriver2 {

	public static void main(String[] args) {
		
		//load book data from file
		ArrayList<Book> books = BSTDriver2.loadFromFile("books_hw3.csv");
		
		//create binary search tree withn odes (key: price, value: book)
		BST<Double, Book> bst = new BST<Double, Book>();
		
		//put book objects into BST
		
		for (Book book: books) {
			Double key = book.Price();
			bst.insert(key, book);
		}
		
		//search boks in price range
		double minPrice = 50;
		double maxPrice = 200;
		ArrayList<Book> searchBooks = bst.find(minPrice, maxPrice);
		
		//save the books (searched) to file (along with # of books)
		String result ="";
		result += "# of books: " + searchBooks.size();
		result += " (" + minPrice + "<= price <= " + maxPrice + ")\n";
		for (Book book: searchBooks)	{
			result += book.toString() + "\n";
		}
		BSTDriver2.saveToFile(result, "price.txt");
		
		
		//create binary search tree with nodes (key:year, value: book)
		BST<Integer, Book> bst1 = new BST<Integer,Book>();
		
		//put book objects into BST
		for (Book book: books)	{
			Integer key = book.Year();
			bst1.insert(key, book);
		}
		
		//search books in year range
		int minYear = 1980;
		int maxYear = 2000;
		searchBooks = bst1.find(minYear,  maxYear);
		
		
		//save the books (searched) to file (along with # of books)
		result = "";
		result += "# of books: " + searchBooks.size();
		result += " (" + minYear + " <= year <= " + maxYear + ")\n";
		for (Book book: searchBooks){
			result += book.toString() + "\n";
		}
		BSTDriver2.saveToFile(result, "year.txt");
		
		
		
		
		
		System.out.println("now ex");
		
		
		
		
		//search books in price range for exercise
		minPrice = 100;
		maxPrice = 180;
		searchBooks = null;
		searchBooks = bst.find(minPrice, maxPrice);
		
		//save the books (searched) to file (along with # of books) for exercise using 100 and 180 as arguments
		result ="";
		result += "# of books: " + searchBooks.size();
		result += " (" + minPrice + "<= price <= " + maxPrice + ")\n";
		for (Book book: searchBooks)	{
			result += book.toString() + "\n";
		}
		BSTDriver2.saveToFile(result, "price_exerc.txt");
		
		
		//search books in year range for exercise
		
		searchBooks = bst1.find(1990, 1998);
		
		//save the searched books to a file for exercise using 1990 1998 as arguments;
		result = "";
		result += "# of books: " + searchBooks.size();
		result += " (" + minYear + " <= year <= " + maxYear + ")\n";
		for (Book book: searchBooks){
			result += book.toString() + "\n";
		}
		BSTDriver2.saveToFile(result, "year_exerc.txt");
		
	
	
	}
	


	public static ArrayList<Book> loadFromFile(String fileName)	{
		ArrayList<Book> books = new ArrayList<Book>();
		try {
			//open file
			File file = new File(fileName);
			Scanner in = new Scanner(file);
			
			//read file
			while (in.hasNext()) {
				//get book data
				String line = in.nextLine();
				String[] tokens = line.split(",");
				String isbn = tokens[0];
				String title = tokens[1];
				String author = tokens[2];
				double price = Double.parseDouble(tokens[3]);
				int year = Integer.parseInt(tokens[4]);
				
				books.add(new Book(isbn, title, author, price, year));
			}
			
			//close file
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		return books;
	}
	
	


	public static void saveToFile(String data, String fileName) {
		try {
			//open file
			PrintWriter out = new PrintWriter(fileName);
			
			//write data to file
			out.println(data);
			out.close();
		} catch (FileNotFoundException e)	{
			System.out.println("Write error");
		}
	}
	
}
