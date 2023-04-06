package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import entities.Aresta;
import entities.GrafoNaoDirecionado;

public class testeGrafoNaoDirecionado {

    @Test
    public void testAddAresta() {
        GrafoNaoDirecionado g = new GrafoNaoDirecionado();
        assertTrue(g.addAresta(1, 2, 5));
        assertTrue(g.addAresta(2, 3, 7));
        assertTrue(g.addAresta(3, 1, 8));
    }

    @Test
    public void testRemoveAresta() {
        GrafoNaoDirecionado g = new GrafoNaoDirecionado();
        g.addAresta(1, 2, 5);
        g.addAresta(2, 3, 7);
        g.addAresta(3, 1, 8);

        Aresta a = g.removeAresta(2, 3);
        assertEquals(2, a.getOrigem());
        assertEquals(3, a.destino());
        assertEquals(7, a.peso(), 0.001);

        a = g.removeAresta(3, 1);
        assertEquals(1, a.getOrigem());
        assertEquals(3, a.destino());
        assertEquals(8, a.peso(), 0.001);

        a = g.removeAresta(1, 2);
        assertEquals(1, a.getOrigem());
        assertEquals(2, a.destino());
        assertEquals(5, a.peso(), 0.001);

        assertNull(g.removeAresta(1, 2));
    }
}
