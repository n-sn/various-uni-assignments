
public class Main {
	
	public static int[] doInsertionSort(int[] input){
        
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                	System.out.println(input[j] + "<" + input[j-1] + " temp = " + input[j] );
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {4, 3, 6, 5, 6, 7, 2, 23, 17, 8, 5, 13} ; 	//unser Array
		for (int i = 1; i < array.length; i++) {			//durchsuchen jedes element des Srrays
			for(int k = i-1; (k >= 0) && (array[k] > array[i]); k--) {//vergleichen mit den elementen vor dem element
				//System.out.println("do we need to switch " + array[k] + " with " + array[i]);
				if (array[k] >= array[i] && ( (k == 0) || (array[k-1] <= array[i]) ) ) { //falls eine passende stelle gefunden ist,
					int ti = array[i];						//kopieren den element in eine Temporärvariable;
					for (int c = i; c > k; c--) {			//für alle Elemente zwischen den Element und der stelle, wo es eingefügt werden soll
						array[c] = array[c-1];				//einfach verschieben
					}
					array[k] = ti;							//den Element aus der Temporärvariable einfügen
				}
			}
		}
		for (int x = 0; x < array.length; x++){
			System.out.print(array[x] + " ");				// den array zeigen;
		}
		System.out.println();
		
	//jetzt minimumssuche + austausch
		int[] qarray = {4, 3, 6, 7, 2, 23, 17, 8, 5 , 13};
		for (int i = 0; i < qarray.length; i++){
				int ti = qarray[i];
				boolean sw = false;
				int min = i;
			for (int k = i + 1; k < qarray.length; k++){
				if (qarray[k] < ti) {
					ti = qarray[k];
					sw = true;
					min = k;
				}
			}
			if (sw = true) {
				qarray[min] = qarray[i];
				qarray[i] = ti;
			}
				
		}
		for (int x = 0; x < qarray.length; x++){
			System.out.print(qarray[x] + " ");				// den array zeigen;
			}
		System.out.println();
		int[] tarray = {4, 3, 6, 7, 2, 23, 17, 8, 5 , 13};
		int[] rarray = doInsertionSort(tarray);
		for (int x = 0; x < rarray.length; x++){
			System.out.print(rarray[x] + " ");				// den array zeigen;
			}
	}

}
