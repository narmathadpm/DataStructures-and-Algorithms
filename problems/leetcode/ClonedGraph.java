package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClonedGraph {
	Map<Node,Node> temp = new HashMap<>();
	public Node cloneGraph(Node node) {
		if(node == null)
		{
			return null;
		}
		if(temp.containsKey(node))
		{
			return temp.get(node);
		}
		Node clonedGraph = new Node(node.val, new ArrayList<>());

		temp.put(node,clonedGraph);
		for(Node nei : node.neighbors)
		{
			clonedGraph.neighbors.add(cloneGraph(nei));
		}
		return clonedGraph;

	}

	class Node {
		public int val;
		public List<Node> neighbors;
		public Node() {
			val = 0;
			neighbors = new ArrayList<Node>();
		}
		public Node(int _val) {
			val = _val;
			neighbors = new ArrayList<Node>();
		}
		public Node(int _val, ArrayList<Node> _neighbors) {
			val = _val;
			neighbors = _neighbors;
		}
	}
}
