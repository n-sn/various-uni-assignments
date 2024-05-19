package graph;
import java.util.*;

public class Node {

	private int id;
	private ArrayList<Integer> neighbors;

	
	public Node(int id)	{
		this.id = id;
		neighbors = new ArrayList<Integer>();
	}
	
	public int id() {
		return id;
	}
	
	public void setId(int id)	{
		this.id = id;
	}
	
	public void addNeighbor(int neighborId) {
		neighbors.add(neighborId);
	}
	
	public ArrayList<Integer> neighbors()	{
		return neighbors();
	}
	
	public int numOfNeighbors() {
		return neighbors.size();
	}
	
	//edge from current node to another nodE( with id) exists
	public boolean isEdgeExist(int id)	{
		for (Integer neighborId: neighbors)	{
			if (id == neighborId)	{
				return true;
			}
		}
	return false;
	}
	
	//remove an edge to a neighbor
	public boolean removeEdge(int id)	{
		for (Integer neighborId: neighbors)	{
			if (id == neighborId)	{
				neighbors.remove(new Integer(id));
				return true;
			}
		}
		return false; 
	}
	
	public String toString()	{
		String neighborIds = "";
		for (Integer neighbor: neighbors) {
			neighborIds += neighbor + " ";
		}
		return "node " + id + ": " + neighborIds;
	}
	
	
	public void show() {
		System.out.println(toString());
	}
	
	
}

