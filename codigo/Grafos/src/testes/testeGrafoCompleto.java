package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.GrafoCompleto;

public class testeGrafoCompleto {

	@Test
    public void testCriarGrafoCompleto() {
        GrafoCompleto gc = new GrafoCompleto(5);
        assertNotNull(gc);
    }
    
    @Test
    public void testOrdemGrafoCompleto() {
        GrafoCompleto gc = new GrafoCompleto(5);
        assertEquals(5, gc.ordem());
    }
}
