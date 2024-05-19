package bfs;

public class GraphDriver {

	public static void main(String[] args) {
		
		/***test
		Node node = new Node(4);
		node.toString()
		*/
		
		/* crete a grpah */
		
		Graph graph = new Graph();
		//graph.show();
		
		
		/*add nodes*/
		int[] nodeIds = {1, 2, 3, 4, 5};
		for (int nodeId: nodeIds)	{
			graph.addNode(nodeId);
		}
		//graph.show();
		
		/*add edges*/
		graph.addEdge(1, 2);
		graph.addEdge(1, 5);
		
		graph.addEdge(2, 1);
		graph.addEdge(2, 5);
		graph.addEdge(2, 4);
		graph.addEdge(2, 3);
		
		graph.addEdge(3, 2);
		graph.addEdge(3, 4);
		
		graph.addEdge(4, 5);
		graph.addEdge(4, 2);
		graph.addEdge(4, 3);
		
		graph.addEdge(5, 1);
		graph.addEdge(5, 2);
		graph.addEdge(5, 4);
		
		graph.show();
		
		////
		/****
		/*remove edges*/
		//graph.removeEdge(2, 5);
		//graph.removeEdge(5, 2);
		
		//graph.removeEdge(2, 4);
		//graph.removeEdge(4, 2);
		
		//graph.show();
		
		/* remove noodes */
		//graph.removeNode(2);
		//graph.removeNode(5);
		
		//graph.show();
		
		
		
	}
	
}
