package App;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
		
		Graph grafo = null;
		
		
		int opcao = 0;

        do {
            System.out.println("Menu");
            System.out.println("1 - Criar grafo");
            System.out.println("2 - Criar vertices: informe o nome o indice do vertice");
            System.out.println("3 - Adicionar arestas: Se ponderada\n\t\tSe direcionada\n\t\tSenao aresta comum");
            System.out.println("4 - Gerar subgrafo: Escolha a qtd de vertices");
            System.out.println("5 - Busca em largura: informe o vertice inicial");
            System.out.println("6 - Busca em profundidade: informe o vertice inicial");
            System.out.println("7 - Salvar operações em arquivo txt");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    
                    grafo = new Graph(nodeList);
                    
                    break;
                case 2:
                    System.out.println("Informe o nome do vertice: ");
                    String nomeVertice = scanner.next();
                    System.out.println("Informe o indice do vertice: ");
                    int indiceVertice = scanner.nextInt();
                    
                    nodeList.add(new GraphNode(nomeVertice, indiceVertice));
                    
                    break;
                case 3:
                    System.out.println("Escolha o tipo de aresta:");
                    System.out.println("1 - Ponderada");
                    System.out.println("2 - Direcionada");
                    System.out.println("3 - Comum");
                    int tipoAresta = scanner.nextInt();
                    
                    if(tipoAresta == 1) {
                    	
                    }
                    
                    //código para adicionar a aresta
                    break;
                case 4:
                    System.out.println("Informe a quantidade de vertices do subgrafo: ");
                    int qtdVerticesSubgrafo = scanner.nextInt();
                    //código para gerar o subgrafo
                    break;
                case 5:
                    System.out.println("Informe o vertice inicial da busca em largura: ");
                    int verticeInicialLargura = scanner.nextInt();
                    //código para realizar a busca em largura
                    break;
                case 6:
                    System.out.println("Informe o vertice inicial da busca em profundidade: ");
                    int verticeInicialProfundidade = scanner.nextInt();
                    //código para realizar a busca em profundidade
                    break;
                case 7:
                    //código para salvar as operações em arquivo txt
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

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
