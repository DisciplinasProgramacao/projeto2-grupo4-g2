package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entities.Aresta;

class testeArestas {

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
