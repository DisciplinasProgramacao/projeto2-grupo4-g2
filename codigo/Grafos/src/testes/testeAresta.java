package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.Aresta;

public class testeAresta {

	  @Test
	    public void testarPeso() {
	        Aresta aresta = new Aresta(5, 2);
	        assertEquals(5, aresta.peso());
	    }

	    @Test
	    public void testarDestino() {
	        Aresta aresta = new Aresta(5, 2);
	        assertEquals(2, aresta.destino());
	    }

	    @Test
	    public void testarVisita() {
	        Aresta aresta = new Aresta(5, 2);
	        assertFalse(aresta.visitada());
	        aresta.visitar();
	        assertTrue(aresta.visitada());
	        aresta.limparVisita();
	        assertFalse(aresta.visitada());
	    }

}
