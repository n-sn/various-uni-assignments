
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] index = new int[]{1, 2, 3, 4, 5, 1, 6, 4 , 3, 5 , 6 , 4 ,3 , 6 , 7 ,8 ,4};
		System.out.println(nthelement(index, 9));
		System.out.println(median(index));
	
	}
	
	public static int median(int[] array) {
		return nthelement(array, (int)Math.ceil(((double)array.length) / 2));	
	}
	
	public static int nthelement(int[] array, int n) {
		
		if (n == 1) {
				return groesster(array);
		}
		if (n > 1) {
		
		int[] newarray = new int[array.length - 1];
		int remove = groesster(array);
		int indexvariable = 0;
		
		for (int i = 0; i < newarray.length; i++) {
			if (array[i] == remove)
				indexvariable = 1;
				newarray[i] = array[i + indexvariable];
		}

			return nthelement(newarray, n-1);
		}
		return 0;
		
	}
	
	public static int groesster(int[] array) {
		if (array.length == 1)
			return array[0];
		if (array.length == 2) {
			if (array[0] >= array[1])
				return array[0];
			if (array[0] < array[1])
				return array[1];
		}
		if (array.length > 2) {
			int[] copyarray = new int[array.length - 2];
			int[] darray = new int[2];
			for (int i = 2; i < array.length; i++) {
				copyarray[i-2] = array[i];
			}
			for (int i = 0; i < 2; i++)
				darray[i] = array[i];
			if (groesster(darray) >= groesster(copyarray))
				return groesster(darray);
			if (groesster(darray) < groesster(copyarray))
				return groesster(copyarray);
		}
		return 0;
	}
	
}
