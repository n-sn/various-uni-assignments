package bfs;
import java.util.*;


public class Graph implements GraphInterface {

	private ArrayList<Node> nodes;
	
	public Graph() {
		nodes = new ArrayList<Node>();
	}
	@Override
	public void init() {
		// TODO Auto-generated method stub
		nodes = null;
	}

	@Override
	public int numOfNodes() {
		// TODO Auto-generated method stub
		return nodes.size();
		
	}

	@Override
	public int numOfEgdes(int id) {
		// TODO Auto-generated method stub
		for (Node node: nodes) {
			if (id == node.id()) {
				return node.numOfNeighbors();
			}
		}
		return -1;
	}

	public String toString()	{
		String ret = "";
		for (Node node: nodes)	{
			ret += node.toString() + "\n";
		}
		return "# of nodes: " + numOfNodes() + "\n" + ret ;
	}
	
	@Override
	public boolean addNode(int id) {
		// TODO Auto-generated method stub
		if (isNodeExist(id)) {
			return false;
		}
		nodes.add(new Node(id));
		return true;
	}

	@Override
	public Node getNode(int id) {
		// TODO Auto-generated method stub
		for (Node node: nodes)	{
			if (id == node.id()) {
				return node;
			}
		}
		return null;
	}

	@Override
	public boolean hasEdge(int fromId, int toId) {
		// TODO Auto-generated method stub
		return isEdgeExist(fromId, toId);
	}

	@Override
	public boolean removeNode(int id) {
		// TODO Auto-generated method stub
		if (!isNodeExist(id))	{
			return false;
		}
		/*remove node*/
		nodes.remove(getIndexById(id));
		
		/*remove edges connected to the node*/
		int toId = id;
		for (Node node: nodes)	{
			removeEdge(node.id(), toId);
		}
		return true;
	}

	@Override
	public boolean removeEdge(int fromId, int toId) {
		// TODO Auto-generated method stub
		if (!isEdgeExist(fromId, toId))	{
			return false;
		}
		Node fromNode = getNode(fromId);
		return fromNode.removeEdge(toId);
	}

	@Override
	public boolean addEdge(int fromId, int toId) {
		// TODO Auto-generated method stub
		//check if node with fromId exists
		if (!isNodeExist(fromId))	{
			return false;
		}
		
		//check if node with toId exists.
		if (!isNodeExist(toId))	{
			return false;
		}
		
		//check if the edge exists
		if (isEdgeExist(fromId, toId))	{
			return false;
		}
		//add edge
		Node fromNode = getNode(fromId);
		fromNode.addNeighbor(toId);
		return true;
	}

	@Override
	public Integer[] neighbors(int id) {
		// TODO Auto-generated method stub
		Node node = getNode(id);
		return (Integer[])node.neighbors().toArray();
		}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}
	
	
	public ArrayList<Node>	nodes()	{
		return nodes;
	}
	
	
	//check if the node exists
	private boolean isNodeExist(int id) {
	
		for (Node node: nodes){
			if (id == node.id()) {
				return true;
			}
		}
		return false;
	}

	
	//return the index of node
	private int getIndexById(int id)	{
		int index = -1;
		for (Node node: nodes)	{
			index++;
			if (id == node.id())	{
				return index;
			}
		}
		return index;
	}
	
	private boolean isEdgeExist(int fromId, int toId)	{
		Node fromNode = getNode(fromId);
		if (fromNode != null)	{
			if (fromNode.isEdgeExist(toId))	{
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
}
