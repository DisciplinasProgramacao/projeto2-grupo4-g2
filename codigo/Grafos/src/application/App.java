package application;

import java.io.IOException;

import entities.Aresta;
import entities.Grafo;
import entities.Vertice;

public class App {

	public static void main(String[] args) throws IOException {		
		
		
		Grafo g = new Grafo("Grafo");
		
		g.addVertice(1);
		g.addVertice(2);
		g.addVertice(3);
		g.addVertice(4);
		
		
		System.out.println("Aresta Ponderada adicionada: "+g.addArestaPonderada(1, 2, 1));
		
		System.out.println("Aresta NAO-Ponderada adicionada: "+g.addAresta(2, 3));
		
		System.out.println("Existe aresta: " + g.existeAresta(1, 2));
		
		System.out.println("Existe vertice: " + g.existeVertice(1));
		
		System.out.println("Aresta removida: " + g.removeAresta(1, 2));
		
		
		
		
		
		
		

	}
	
	
 	

}
