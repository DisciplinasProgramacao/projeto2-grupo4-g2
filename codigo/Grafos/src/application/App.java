package application;

import entities.Grafo;

public class App {

	public static void main(String[] args) {		
		
		Grafo grafo = new Grafo("Grafo1");
		
		grafo.carregar();
		grafo.salvar();
		
		

	}

}
