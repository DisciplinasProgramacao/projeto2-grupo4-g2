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
		
		
		System.out.println("Aresta adicionada: "+g.addAresta(1, 2, 1));		
		
		System.out.println("Existe aresta: " + g.existeAresta(1, 2));
		
		System.out.println( g.existeVertice(1));
		
		System.out.println(g.removeAresta(1, 2));
		
		
		
		
		
		
		

	}
	
	
 	

}
