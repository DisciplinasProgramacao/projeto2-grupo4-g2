package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entities.Aresta;
import entities.GrafoMutavel;
import entities.Vertice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testeGrafoMutavel {

    private GrafoMutavel grafo;

    @Before
    public void setUp() throws Exception {
        grafo = new GrafoMutavel("grafo de teste");
    }

    @Test
    public void testAddVertice() {
        assertTrue(grafo.addVertice(1));
        assertTrue(grafo.addVertice(2));
        assertTrue(grafo.addVertice(3));
        assertFalse(grafo.addVertice(1)); // tentando adicionar um vértice com ID já existente
    }

    @Test
    public void testRemoveVertice() {
        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addVertice(3);
        Vertice v1 = grafo.removeVertice(1);
        assertNotNull(v1);
        assertEquals(1, v1.getId());
        Vertice v4 = grafo.removeVertice(4); // tentando remover um vértice que não existe
        assertNull(v4);
    }

    @Test
    public void testAddAresta() {
        grafo.addVertice(1);
        grafo.addVertice(2);
        assertTrue(grafo.addAresta(1, 2, 10));
        assertFalse(grafo.addAresta(1, 2, 5)); // tentando adicionar uma aresta que já existe
        assertFalse(grafo.addAresta(1, 3, 5)); // tentando adicionar uma aresta cujos vértices não existem
    }

    @Test
    public void testRemoveAresta() {
        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addAresta(1, 2, 10);
        Aresta a12 = grafo.removeAresta(1, 2);
        assertNotNull(a12);
        assertEquals(1, a12.getOrigem());
        assertEquals(2, a12.getDestino());
        assertNull(grafo.removeAresta(1, 2)); // tentando remover uma aresta que já foi removida
        assertNull(grafo.removeAresta(1, 3)); // tentando remover uma aresta que não existe
    }

    @Test
    public void testCarregar() {
        // implemente este teste de acordo com a lógica do método carregar
    }

    @Test
    public void testSalvar() {
        // implemente este teste de acordo com a lógica do método salvar
    }

}

