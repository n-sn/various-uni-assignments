
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    /**
     * @param args
     */
    public static ArrayList<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException {
        String pathToListFile = args[0];
        int key = Integer.parseInt(args[1]);
       
       
        readInput(pathToListFile);

       
        System.out.println("linear search: " + linSearch(key));
        System.out.println("binary search: " + binSearch(key));
        System.out.println("interpolation search: " + interpolSearch(key));
       
       
    }
    /**
     * Parse a file containing integers and insert them into "numbers".
     * Each line contains a single integer.
     * Use the Class BufferedReader
     *
     * @param path
     * @throws IOException
     */
    public static void readInput(String path) throws IOException{

	//implement me!
	
    }
    /**
     * Implementation of linear search. Return the index of key in the array list "numbers".
     * Return -1 if key is not contained in "numbers"
     * @param key
     * @return
     */
    public static int linSearch(int key){
        //implement me!
	return 42;

    }
    /**
     * Implementation of binary search. Return the index of key in the array list "numbers".
     * Return -1 if key is not contained in "numbers"
     * @param key
     * @return
     */
    public static int binSearch(int key){
	//implement me!
	return 42;
    }
    /**
     * Implementation of interpolation search. Return the index of key in the array list "numbers".
     * Return -1 if key is not contained in "numbers"
     * @param key
     * @return
     */
    public static int interpolSearch(int key){
	//implement me!
	return 42;
    }
}