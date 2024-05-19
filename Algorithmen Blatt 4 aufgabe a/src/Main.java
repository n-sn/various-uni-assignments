
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] eingabeA = {44, 55, 12, 42, 4, 18, 6, 94, 18, 6, 67, 9};

	
		int zahl1 = eingabeA[0];						//Initialisierung;
		int zahl2 = eingabeA[1];						//Anfangswerte;
		int unterschied = eingabeA[1] - eingabeA[1];	//Anfangsunterschied
		for (int i = 1; i < eingabeA.length; i++){		//Schleife..
			if ( Math.abs(unterschied) > Math.abs(eingabeA[i] - eingabeA[i-1]) ){
				unterschied = eingabeA[i] - eingabeA[i-1];
				zahl1 = eingabeA[i];
				zahl2 = eingabeA[i-1];
			}
		}
		System.out.println("Die kleinste Distanz zwischen zwei aufeinanderfolgenden Zahlen ist zwischen " + zahl1 + " und " + zahl2);
		
	
		

        int stelle = 0;
        int haufigkeit = 1;
        int recordhaufigkeit = 0;
        mergeSort(eingabeA);
 
        for (int i = 0; i < eingabeA.length - 1; i++) {
 
            if (eingabeA[i] == eingabeA[i + 1]) {
                ++haufigkeit;
            }
 
            if (recordhaufigkeit < haufigkeit) {
                recordhaufigkeit = haufigkeit;
                stelle = i;
            }
            
            if (eingabeA[i] != eingabeA[i + 1]) {
                haufigkeit = 1;
            }
        }
 
        System.out.println("Zahl: " + eingabeA[stelle] + ", Häufigkeit: " + recordhaufigkeit);
		
	}
	
	public static void mergeSort(int[] array) {			// Das Divide-Teil des MergeSorts
		if (array.length > 1) {
	
			int linkelaenge = array.length/2;			//Definitione der längen;
			int rechtelaenge = array.length - linkelaenge;
	
			
			int[] links = new int[linkelaenge];
			for (int i = 0; i < linkelaenge; i++) {
				links[i] = array[i];
			}
			
			int[] rechts = new int[rechtelaenge];
			for (int j = 0; j < rechtelaenge; j++) {
				rechts[j] = array[j + linkelaenge];
			}
			
			mergeSort(links);							//Teilen vom linken Teil;
			mergeSort(rechts);							//Teilen vom rechten Teil;
			merge(array, links, rechts);				//Zusammenfassung von Teilen;
		}
	}

	public static void merge(int[] ergebniss, 			// Das Merge-Teil des MergeSorts
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
