package testes;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import entities.Aresta;
import entities.Vertice;

public class testeVertice {

    private Vertice v;

    @Before
    public void setup() {
        v = new Vertice(1);
    }

    @Test
    public void testGetId() {
        assertEquals(1, v.getId());
    }

    @Test
    public void testAddAresta() {
        assertTrue(v.addAresta(2, 10));
        assertFalse(v.addAresta(2, 5));
    }

    @Test
    public void testRemoveAresta() {
        v.addAresta(2, 10);
        Aresta a = v.removeAresta(2);
        assertEquals(10, a.peso());
        assertNull(v.existeAresta(2));
    }

    @Test
    public void testVisitar() {
        v.visitar();
        assertTrue(v.visitado());
        v.limparVisita();
        assertFalse(v.visitado());
    }

    @Test
    public void testVizinhos() {
        v.addAresta(2, 10);
        v.addAresta(3, 20);
        List<Integer> vizinhos = v.vizinhos();
        assertEquals(2, vizinhos.size());
        assertTrue(vizinhos.contains(2));
        assertTrue(vizinhos.contains(3));
    }

}
