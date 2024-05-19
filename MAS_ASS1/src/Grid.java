
public class Grid {

	public int size_x;
	public int size_y;
	public int[][] matrix;
	
	public Grid() {
	}


	public int getSize_x() {
		return size_x;
	}


	public void setSize_x(int size_x) {
		this.size_x = size_x;
	}


	public int getSize_y() {
		return size_y;
	}


	public void setSize_y(int size_y) {
		this.size_y = size_y;
	}
	

	public void init(){
		
		matrix = new int[100][100];
		
		for (int i = 0; i < size_x; i++) {
			for (int j = 0; j < size_y; j++) {
				
				matrix[i][j] = 0;
				
			}
		}
	}
	
	
	
	
	
	
	
	
}	
	

