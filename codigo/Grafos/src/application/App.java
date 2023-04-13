package application;

import java.io.IOException;
import java.util.Scanner;

import entities.Grafo;
import entities.Vertice;

public class App {

	public static void main(String[] args) throws IOException {	
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		/* 
		 *  1 - Criar grafo: informe o nome do grafo
			2 - Criar vertices: informe o nome o indice do vertice
			3 - Adicionar arestas: Se ponderada
		    	Se direcionada
		    	Senao aresta comum
			4 - Gerar subgrafo: Escolha a qtd de vertices
			5 - Busca em largura: informe o vertice inicial
			6 - Busca em profundidade: informe o vertice inicial	
			7 - Salvar operações em arquivo txt
			
			*/
		
		
		Grafo g = new Grafo("Grafo");
		
		g.addVertice(1);
		g.addVertice(2);
		g.addVertice(3);
		g.addVertice(4);
		
		
		/*
		System.out.println("Aresta Ponderada adicionada: "+g.addArestaPonderada(1, 2, 1));
		
		System.out.println("Aresta NAO-Ponderada adicionada: "+g.addAresta(2, 3));
		
		System.out.println("Existe aresta: " + g.existeAresta(1, 2));
		
		System.out.println("Existe vertice: " + g.existeVertice(1));
		
		System.out.println("Aresta removida: " + g.removeAresta(1, 2));
		
		*/
		
		Vertice[] a = new Vertice[50];
		
		System.out.println(g.vertices.allElements(a));
		
		
		for(int i =0; i<a.length;i++) {
			System.out.println(a);
		}
		

	}
	
	
 	

}
