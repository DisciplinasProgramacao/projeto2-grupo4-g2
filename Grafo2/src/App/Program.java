package App;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		
		ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
		nodeList.add(new GraphNode("A",0));
		nodeList.add(new GraphNode("B",1));
		nodeList.add(new GraphNode("C",2));
		nodeList.add(new GraphNode("D",3));
		nodeList.add(new GraphNode("E",4));
		
		Graph g = new Graph(nodeList);		
		
		/*
		g.addUndirectedEdge(0, 1);
		g.addUndirectedEdge(0, 2);
		g.addUndirectedEdge(0, 3);
		g.addUndirectedEdge(1, 4);
		g.addUndirectedEdge(2, 3);
		g.addUndirectedEdge(3, 4);
		*/
		
		//g.completeGraph();
		
		g.addUndirectedEdge(0, 1);
		g.addDirectedEdge(2, 3);
		//g.addUndirectedWeightedEdge(3, 4, 5);
		g.addDirectedWeightedEdge(3, 4, 5);
		g.addDirectedWeightedEdge(4, 1, 9);
		
		g.breadthFirstSearch(1);
		
		g.depthFirstSearch(2);
		
		System.out.println(g.toString());
	}

}
