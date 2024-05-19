
public class Main {

	public static void main(String[] args) {
		
		int[] arr = {44, 55, 12, 42, 94, 18, 6, 67, 9};

		mergeSort(arr);
		int zahl1 = arr[0];
		int zahl2 = arr[1];
		int unterschied = arr[1] - arr[1];
		for (int i = 1; i < arr.length; i++){
			if ( Math.abs(unterschied) > Math.abs(arr[i] - arr[i-1]) ){
				unterschied = arr[i] - arr[i-1];
				zahl1 = arr[i];
				zahl2 = arr[i-1];
			}
		}
		System.out.println("the result is " + zahl1 + " " + zahl2);
		
	}

	public static void mergeSort(int[] array) {			// Das Merge-Teil
		if (array.length > 1) {
	
			int linkelaenge = array.length/2;
			int rechtelaenge = array.length - linkelaenge;
	
			
			int[] links = new int[linkelaenge];
			for (int i = 0; i < linkelaenge; i++) {
				links[i] = array[i];
			}
			
			int[] rechts = new int[rechtelaenge];
			for (int j = 0; j < rechtelaenge; j++) {
				rechts[j] = array[j + linkelaenge];
			}
			
			
			// recursively sort the two halves
			mergeSort(links);
			mergeSort(rechts);

			// merge the sorted halves into a sorted whole
			merge(array, links, rechts);
		}
	}

	public static void merge(int[] ergebniss, 
			int[] links, int[] rechts) {
		int i1 = 0;   // linker Index
		int i2 = 0;   // rechter Index

		for (int i = 0; i < ergebniss.length; i++) {
			if (i2 >= rechts.length || (i1 < links.length && links[i1] <= rechts[i2])) {
				ergebniss[i] = links[i1];    // links ist groesser.
				i1++;
			} else {
				ergebniss[i] = rechts[i2];   // rechts ist groesser.
				i2++;
			}
		}
	}
}
