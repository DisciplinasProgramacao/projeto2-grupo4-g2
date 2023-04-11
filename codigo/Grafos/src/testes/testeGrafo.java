package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import entities.Grafo;

public class testeGrafo {

Grafo grafo;
	
	@Before
	public void setUp() {
		grafo = new Grafo("Grafo de teste");
	}
	
	@Test
	public void testCarregar() {
		grafo.carregar();
		assertEquals(4, grafo.getNumVertice());
		assertEquals(5, grafo.getNumAresta());
	}
	
	@Test
	public void testSalvar() {
		grafo.carregar();
		grafo.salvar();
		Grafo grafoSalvo = new Grafo("GrafoSalvo");
		grafoSalvo.carregar();
		assertEquals(grafo.getNumVertice(), grafoSalvo.getNumVertice());
		assertEquals(grafo.getNumAresta(), grafoSalvo.getNumAresta());
	}
	
	@Test
	public void testNome() {
		assertEquals("Grafo de teste", grafo.nome());
	}

}
