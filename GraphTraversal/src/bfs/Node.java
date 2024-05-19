package bfs;
import java.util.*;

public class Node {

	private int id;
	private ArrayList<Integer> neighbors;
	
	private COLOR color;
	private int parent;
	private int distance; 

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

	public COLOR color() {
		return color;
	}

	public void setColor(COLOR color) {
		this.color = color;
	}

	public int distance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int parent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}
	
	
}

