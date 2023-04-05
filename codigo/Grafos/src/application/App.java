package application;

import java.io.IOException;

import entities.Aresta;
import entities.Grafo;
import entities.Vertice;

public class App {

	public static void main(String[] args) throws IOException {		
		
		Grafo grafo = new Grafo("Grafo1");
		
		grafo.carregar();
		grafo.salvar();
		
		
		Grafo g =  new Grafo("grafo");
		g.addVertice(1);
		g.addVertice(2);
		
		g.addAresta(1, 2, 1);
		
		
		
		

	}
	
	
 	public static void addVertice() {
 	}	
 	
 	public static void addAresta() {}

}
