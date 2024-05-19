package part1;

public class BSTDriver {

	public static void main(String [] args) {
		
		String isbn;
		Book book = null;
		
		//create binary search tree
		//node: <key: ISBN (String), value: Book object>
		BST<String, Book> bst = new BST<String, Book>();
		
		//add nodes
		isbn ="978-1292153599";
		bst.insert(isbn, new Book(isbn, "Big Data Analysis", "Danny", 150, 2019));
		isbn = "978-1292153589";
		bst.insert(isbn, new Book(isbn, "Data Structure", "Kim", 70, 2020));
		isbn = "978-1292153612";
		bst.insert(isbn, new Book(isbn, "Big Data Transfer", "Sarah", 120, 2021));
		isbn = "978-1292153566";
		bst.insert(isbn, new Book(isbn, "Algorithm", "Daehee", 50, 2019));
		isbn = "978-1292153592";
		bst.insert(isbn,  new Book(isbn, "Ecommerce Systems Design", "Danny", 100, 2020));
		isbn = "978-1292153600";
		bst.insert(isbn, new Book(isbn, "Java Programming", "Kim", 80, 2019));
		isbn = "978-1292153620";
		bst.insert(isbn,  new Book(isbn, "Android Mobile Development", "Daehee", 130, 2020));
		
		
		//print all nodes
		System.out.println("** All books (sortd in an ascending order of ISBN");
		bst.inOrder();
		
		//find a node
		isbn = "978-1292153599";
		System.out.println("** Find book: ISBN: " + isbn);
		System.out.println(bst.find(isbn).toString());
		System.out.println(bst.find(isbn));
		System.out.println();
		
		isbn = "978-1292153612";
		System.out.println("** Find book: ISBN: " + isbn);
		System.out.println(bst.find(isbn));
		System.out.println();
		
		//remove a node - leaf
		isbn = "987-1292153620"; //Android Mobile Development
		System.out.println("** Remove book: ISBN: " + isbn);
		bst.remove(isbn);
		bst.inOrder();
		
		//remove a node - with one child
		isbn = "978-1292153612"; //Big Data Transfer
		System.out.println("** Remove book: ISBN: " + isbn);
		bst.remove(isbn);
		bst.inOrder();
		
		//remove a node - with two children
		isbn = "978-1292153589"; //Data Structure
		System.out.println("** Remove book: ISBN: " + isbn);
		bst.remove(isbn);
		bst.inOrder();

		
		
		
		
	}
	
}
