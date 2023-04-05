package App;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	int [][]  adjacencyMatrix;
	
	public Graph(ArrayList<GraphNode> nodeList ) {
		this.nodeList = nodeList;
		adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
	}
	
	public void addUndirectedEdge(int i, int j) {
		adjacencyMatrix[i][j] = 1;
		adjacencyMatrix[j][i] = 1;		
	}
	
	public void completeGraph() {
		for (int i = 0; i < nodeList.size(); i++) {
			for (int j = i+1; j < nodeList.size(); j++) {
				addUndirectedEdge(i, j);
		        }
		    }		
	}
	
	public void addUndirectedWeightedEdge(int i, int j, int weight) {
		adjacencyMatrix[i][j] = weight;
	    adjacencyMatrix[j][i] = weight;
	}
	    
	public void addDirectedEdge(int i, int j) {
	    adjacencyMatrix[i][j] = 1;
	}
	
	public void addDirectedWeightedEdge(int i, int j,int weight) {
	    adjacencyMatrix[i][j] = weight;
	}
	
	/**
	 * 
	 * 
	 * PESQUISAR COMO CRIAR UM SUBGRAFO A PARTIR DE UM GRAFO
	 * 
	 * 
	 */
	public void createSubGraph() {}
	
	public void breadthFirstSearch(int startIndex) {
	    // Cria uma lista de vertices visitados e uma fila de vertices a serem visitados
	    ArrayList<GraphNode> visitedNodes = new ArrayList<>();
	    Queue<GraphNode> toVisit = new LinkedList<>();

	    // Adiciona o vertice de partida na fila de vertice a serem visitados
	    toVisit.add(nodeList.get(startIndex));

	    // Percorre os vertice a serem visitados
	    while (!toVisit.isEmpty()) {
	        // Remove o primeiro vertice da fila e marca como visitado
	        GraphNode currentNode = toVisit.remove();
	        visitedNodes.add(currentNode);

	        // Visita todos os vizinhos do vertice atual que ainda não foram visitados
	        for (int i = 0; i < nodeList.size(); i++) {
	            if (adjacencyMatrix[nodeList.indexOf(currentNode)][i] != 0 && !visitedNodes.contains(nodeList.get(i))) {
	                // Adiciona o vizinho na fila de vertices a serem visitados
	                toVisit.add(nodeList.get(i));
	            }
	        }
	    }

	    // Imprime a ordem em que os vertices foram visitados
	    StringBuilder s = new StringBuilder();
	    s.append("Busca em largura começando do vertice: " + nodeList.get(startIndex).name + ": ");
	    for (GraphNode node : visitedNodes) {
	        s.append(node.name + " ");
	    }
	    System.out.println(s);
	}
	
	public void depthFirstSearch(int startIndex) {
	    // Cria uma lista de vertices visitados
	    ArrayList<GraphNode> visitedNodes = new ArrayList<>();

	    // Chama o método auxiliar recursivo para visitar todos os vertices a partir do vertice de partida
	    depthFirstSearchAux(nodeList.get(startIndex), visitedNodes);

	    // Imprime a ordem em que os vertices foram visitados
	    StringBuilder s = new StringBuilder();
	    s.append("Busca em profundidade começando do vertice: " + nodeList.get(startIndex).name + ": ");
	    for (GraphNode node : visitedNodes) {
	        s.append(node.name + " ");
	    }
	    System.out.println(s);
	}

	public void depthFirstSearchAux(GraphNode node, ArrayList<GraphNode> visitedNodes) {
	    // Marca o vertice atual como visitado
	    visitedNodes.add(node);

	    // Visita todos os vizinhos do vertice atual que ainda não foram visitados
	    for (int i = 0; i < nodeList.size(); i++) {
	        if (adjacencyMatrix[nodeList.indexOf(node)][i] != 0 && !visitedNodes.contains(nodeList.get(i))) {
	            // Chama recursivamente o método auxiliar para visitar o vizinho
	            depthFirstSearchAux(nodeList.get(i), visitedNodes);
	        }
	    }
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(" ");
		for(int i = 0; i < nodeList.size(); i++) {
			s.append(nodeList.get(i).name + " ");
		}
		s.append("\n");
		for(int i = 0; i < nodeList.size(); i++) {
			s.append(nodeList.get(i).name + " ");
			for(int j : adjacencyMatrix[i]) {
				s.append((j) + " ");
			}
			s.append("\n");
		}
		return s.toString();
	}
}
