
public class MAS_ASS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int size_x = 100;
	int size_y = 100;
		
	 Grid mainGrid = new Grid();
	 mainGrid.setSize_x(size_x);
	 mainGrid.setSize_y(size_y);
	 mainGrid.init();
	 
	 long starttime = System.nanoTime();
	 
	 //int[][] testInt = new int[1][2];
	 //System.out.println(testInt.length);
	 /*
	 Agent testAgent = new Agent();
	 testAgent.addToQueue(1, 2, 3, 4);
	 testAgent.addToQueue(11, 22, 33, 44);
	 testAgent.addToQueue(44, 55, 66, 77);
	 testAgent.current_pos_x = randomGridPoint();
	 testAgent.current_pos_y = randomGridPoint();
	 testAgent.working_grid = mainGrid;
	 testAgent.init();
	 while (!testAgent.make_one_move()) {
		 
	 }
	 */
	 
	 
	 
	 
	 //THIS VALUE SPECIFIES THE NUMBER OF ACTIVE AGENTS ON THE GRID
	 int numberOfAgents = 10;
	 Agent[] agents;
	 boolean[] agentbuffers;
	 agents = new Agent[numberOfAgents];
	 agentbuffers = new boolean[numberOfAgents];
	 
	 for (int i = 0; i < numberOfAgents; i++) {
		 
		 agents[i] = new Agent();
		 agents[i].working_grid = mainGrid;
		 agents[i].reach_x = 100;
		 agents[i].reach_y = 100; 
		 agents[i].addToQueue(randomGridPoint(), randomGridPoint(), randomGridPoint(), randomGridPoint());
		 agents[i].current_pos_x = randomGridPoint();
		 agents[i].current_pos_y = randomGridPoint();
		 agents[i].init();
		 agentbuffers[i] = false;
	 }
	 
	boolean globalbuffer = false;
	 
	 while (!globalbuffer) {
		 boolean tempbuffer = true;

	 for (int i = 0; i < numberOfAgents; i++) {
	 
		 if (Math.random() < 0.005) {
			 //agents[i].printQueue();
			 agents[i].addToQueue(randomGridPoint(), randomGridPoint(), randomGridPoint(), randomGridPoint());
			 //System.out.print("SUCCESS");
			 //agents[i].printQueue();
		 }
		 
		 if (!agentbuffers[i]) {
		 agentbuffers[i] = agents[i].make_one_move();
		 tempbuffer = agentbuffers[i] && tempbuffer;
		 }
		 
	 
	 }
	 globalbuffer = tempbuffer;

	 }
	 
		 
		
		
		System.out.println((System.nanoTime() - starttime));
	}
	
	public static int randomGridPoint() {
		int random = (int)(Math.random() * 90 + 6);
		return random;
	}
	

}
