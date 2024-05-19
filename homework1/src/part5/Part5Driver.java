package part5;

import java.io.*;
import java.util.*;

public class Part5Driver {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//create a list
		AList<Book> list = new AList<Book>(100);
		
		//load book information int o a list;
		try {
			File file = new File("books.csv");
			Scanner in = new Scanner(file);
			while (in.hasNext()) {
				String line = in.nextLine();
				String[] tokens = line.split(",");
				String title = tokens[0];
				String author = tokens[1];
				list.append(new Book(title, author));
				}
			
			} catch (Exception e) {
				e.printStackTrace();
				}
		//show number of books in the  list
		System.out.println("# of books: " + list.length());
		System.out.println();
		
		//show all books
		list.moveToStart();
		for (list.moveToStart(); list.currPos() < list.length(); ) {
			list.remove().show();
		}
		
	}
	
}
