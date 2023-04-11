package App;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		
		
		
		
		
		ArrayList<GraphNode> nodeList1 = new ArrayList<GraphNode>();
		nodeList1.add(new GraphNode("A",0));
		nodeList1.add(new GraphNode("B",1));
		nodeList1.add(new GraphNode("C",2));
		nodeList1.add(new GraphNode("D",3));
		nodeList1.add(new GraphNode("E",4));
		
		Graph g1 = new Graph(nodeList1);		
		
		
		g1.addUndirectedWeightedEdge(0, 1, 7);
		g1.addUndirectedWeightedEdge(1, 3, 8);
		g1.addUndirectedWeightedEdge(0, 2, 3);
		g1.addUndirectedWeightedEdge(2, 4, 5);
		
		g1.breadthFirstSearch(0);
		g1.depthFirstSearch(0);
		
		System.out.println(g1.toString());
		
		/*
		
		ArrayList<GraphNode> nodeList1 = new ArrayList<GraphNode>();
		nodeList1.add(new GraphNode("A",0));
		nodeList1.add(new GraphNode("B",1));
		nodeList1.add(new GraphNode("C",2));
		
		Graph g1 = new Graph(nodeList1);		
		
		
		g1.addUndirectedEdge(0, 1 );
		g1.addUndirectedEdge(0, 2);
		g1.addUndirectedEdge(1, 2);
		
		System.out.println(g1.toString());
		
		/* EX1
		
		ArrayList<GraphNode> nodeList1 = new ArrayList<GraphNode>();
		nodeList1.add(new GraphNode("A",0));
		nodeList1.add(new GraphNode("B",1));
		nodeList1.add(new GraphNode("C",2));
		nodeList1.add(new GraphNode("D",3));
		
		Graph g1 = new Graph(nodeList1);		
		
		
		g1.addDirectedWeightedEdge(0, 1, 3);
		g1.addDirectedWeightedEdge(1, 2, 2);
		g1.addDirectedWeightedEdge(2, 1, 5);
		
		
		System.out.println(g1.toString());
		 */
		
		
		/*
		
		
		g.addUndirectedEdge(0, 1);
		g.addUndirectedEdge(0, 2);
		g.addUndirectedEdge(0, 3);
		g.addUndirectedEdge(1, 4);
		g.addUndirectedEdge(2, 3);
		g.addUndirectedEdge(3, 4);
		
		//g.completeGraph();
		
		g.addUndirectedEdge(0, 1);
		g.addDirectedEdge(2, 3);
		//g.addUndirectedWeightedEdge(3, 4, 5);
		g.addDirectedWeightedEdge(3, 4, 5);
		g.addDirectedWeightedEdge(4, 1, 9);
		
		g.breadthFirstSearch(1);
		
		g.depthFirstSearch(2);
		
		System.out.println(g.toString());
		 */
	}

}
