
public class Agent {

	public int reach_x;
	public int reach_y;
	
	public int destination_x;
	public int destination_y;
	
	public int source_x;
	public int source_y;
	
	public int current_pos_x;
	public int current_pos_y;
	
	public int current_pos_x_saved;
	public int current_pos_y_saved;
	
	public boolean loaded;
	public boolean working;
	public boolean delivered = false;
	
	public Grid working_grid;
	
	public int[][] queue = new int[0][4];
	
	
	public Agent() {
	
	}
	
	
	public void addToQueue(int srcX, int srcY, int dstX, int dstY) {
		
		//add one line to the end of queue;
		int[][] newQueue = new int[queue.length + 1][4];
		
		for (int i = 0; i < queue.length; i++) {
			
			for (int j = 0; j < 4; j++) {
				
				newQueue[i][j] = queue[i][j];
				
			}
			
		}
		
		
		
		newQueue[queue.length][0] = srcX;
		newQueue[queue.length][1] = srcY;
		newQueue[queue.length][2] = dstX;
		newQueue[queue.length][3] = dstY;
		
		queue = newQueue;
		
		
	}
	
	public void removeFromQueue() {
		if (queue.length == 0) return; 
		int[][] newQueue = new int[queue.length - 1][4];
		for (int i = 0; i < queue.length - 1; i++) {			
			for (int j = 0; j < 4; j++) {				
				newQueue[i][j] = queue[i + 1][j];				
			}			
		}
		
		queue = newQueue;
	}
	
	
	public void printQueue() {
		for (int i = 0; i < queue.length; i++) {
			System.out.println();
			for (int j = 0; j < 4; j++) {
				
				System.out.print(queue[i][j]);
				
			}
			
		}
	}
	
	
	
	public void init() {
		current_pos_x_saved = current_pos_x;
		current_pos_y_saved = current_pos_y;
		working_grid.matrix[current_pos_x][current_pos_y] = 1;
		if (queue.length != 0) {
		source_x = queue[0][0];
		source_y = queue[0][1];
		destination_x = queue[0][2];
		destination_y = queue[0][3];}
		this.printQueue();
	}
	
	public void update_pos() {
		working_grid.matrix[current_pos_x_saved][current_pos_y_saved] = 0;
		working_grid.matrix[current_pos_x][current_pos_y] = 1;
		current_pos_x_saved = current_pos_x;
		current_pos_y_saved = current_pos_y;
		
	}
	
	
	public boolean tcas(int movX, int movY) {
		
		if (working_grid.matrix[current_pos_x + movX][current_pos_y + movY] == 1) {
			if (movX > 0) {
				System.out.println("TCAS: Collision detected on x, moving Y from: " + current_pos_y + " to " + (current_pos_y+1));
				current_pos_y = current_pos_y + 1;
				this.update_pos();
				return false;
			} else if (movY > 0) {
				System.out.println("TCAS: Collision detected on y, moving X from: " + current_pos_x + " to " + (current_pos_x+1));
				current_pos_x = current_pos_x + 1;
				this.update_pos();
				return false;
			} else 
				return true;

		} else
			return true;
		
	}
	
	
	
	
	public boolean make_one_move() {
		if (delivered && queue.length == 0) {
		return true;
		} else if (delivered && queue.length != 0) {
			delivered = false;
			this.init();
		}
			
			if (loaded) {
				
				if (current_pos_x < destination_x) {
					System.out.println("Move from x: " + current_pos_x + " to x: " + (current_pos_x + 1));
					if (this.tcas(1, 0))
					current_pos_x = current_pos_x + 1;
					this.update_pos();
					return false;
				} else if (current_pos_x > destination_x) {
					System.out.println("Move from x: " + current_pos_x + " to x: " + (current_pos_x - 1));
					if (this.tcas(-1, 0))
					current_pos_x = current_pos_x - 1;
					this.update_pos();
					return false;
				} else if (current_pos_x == destination_x) {
					if (current_pos_y < destination_y) {
						System.out.println("Move from y: " + current_pos_y + " to y: " + (current_pos_y + 1));
						if (this.tcas(0, 1))
						current_pos_y = current_pos_y + 1;
						this.update_pos();
						return false;
					} else if (current_pos_y > destination_y) {
						System.out.println("Move from y: " + current_pos_y + " to y: " + (current_pos_y - 1));
						if (this.tcas(0, -1))
						current_pos_y = current_pos_y - 1;
						this.update_pos();
						//System.out.println("coords x" + current_pos_x);
						return false;
					} else if (current_pos_y == destination_y) {
						System.out.println("Destination reached, unloading..");
						loaded = false;
						delivered = true;
						this.removeFromQueue();
						if (queue.length == 0) 
							return true;
					
						return false;
					} else {
						System.out.println("Somthing is wrong, this hsould not happen");
						return true;
					}			
			}

		} else if (!loaded) {
			
			
			if (current_pos_x < source_x) {
				System.out.println("Move from x: " + current_pos_x + " to x: " + (current_pos_x + 1));
				if (this.tcas(1, 0))
				current_pos_x = current_pos_x + 1;
				this.update_pos();
				return false;
			} else if (current_pos_x > source_x) {
				System.out.println("Move from x: " + current_pos_x + " to x: " + (current_pos_x - 1));
				if (this.tcas(-1, 0))
				current_pos_x = current_pos_x - 1;
				this.update_pos();
				return false;
			} else if (current_pos_x == source_x) {
				if (current_pos_y < source_y) {
					System.out.println("Move from y: " + current_pos_y + " to y: " + (current_pos_y + 1));
					if (this.tcas(0, 1))
					current_pos_y = current_pos_y + 1;
					this.update_pos();
					return false;
				} else if (current_pos_y > source_y) {
					System.out.println("Move from y: " + current_pos_y + " to y: " + (current_pos_y - 1));
					if (this.tcas(0, 1))
					current_pos_y = current_pos_y - 1;
					this.update_pos();
					return false;
				} else if (current_pos_y == source_y) {
					System.out.println("Source reached, loading..");
					loaded = true;
					return false;
				} else {
					System.out.println("Somthing is wrong, this hsould not happen");
					return true;
				}			
		}
			
			
		}
		System.out.println("Somthing is wrong, this hsould not happen");
		return true;
	}
	
	
	
	
}
