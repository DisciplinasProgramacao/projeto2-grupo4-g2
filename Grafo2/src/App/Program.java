package App;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

        Graph grafo = null;

        int opcao = 0;
        while (opcao != 7) {
            System.out.println("\nDigite a opção desejada:");
            System.out.println("1 - Criar grafo");
            System.out.println("2 - Adicionar aresta não direcionada");
            System.out.println("3 - Adicionar aresta direcionada");
            System.out.println("4 - Adicionar aresta ponderada");
            System.out.println("5 - Busca em largura");
            System.out.println("6 - Busca em profundidade");
            System.out.println("7 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o número de nós do grafo: ");
                    int numNodes = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numNodes; i++) {
                        System.out.println("Digite o nome do nó " + (i + 1) + ": ");
                        String nodeName = scanner.nextLine();
                        nodeList.add(new GraphNode(nodeName, i));
                    }
                    grafo = new Graph(nodeList);
                    break;

                case 2:
                    System.out.println("Digite os índices dos nós que deseja conectar (separados por espaço): ");
                    int nodeIndex1 = scanner.nextInt();
                    int nodeIndex2 = scanner.nextInt();
                    grafo.addUndirectedEdge(nodeIndex1, nodeIndex2);
                    break;

                case 3:
                    System.out.println("Digite os índices dos nós que deseja conectar (separados por espaço): ");
                    nodeIndex1 = scanner.nextInt();
                    nodeIndex2 = scanner.nextInt();
                    grafo.addDirectedEdge(nodeIndex1, nodeIndex2);
                    break;

                case 4:
                    System.out.println("Digite os índices dos nós que deseja conectar e o peso da aresta (separados por espaço): ");
                    nodeIndex1 = scanner.nextInt();
                    nodeIndex2 = scanner.nextInt();
                    int weight = scanner.nextInt();
                    grafo.addUndirectedWeightedEdge(nodeIndex1, nodeIndex2, weight);
                    break;

                case 5:
                    System.out.println("Digite o índice do nó de partida: ");
                    int startIndex = scanner.nextInt();
                    grafo.breadthFirstSearch(startIndex);
                    break;

                case 6:
                    System.out.println("Digite o índice do nó de partida: ");
                    startIndex = scanner.nextInt();
                    grafo.depthFirstSearch(startIndex);
                    break;

                case 7:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    

		
		
		
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
