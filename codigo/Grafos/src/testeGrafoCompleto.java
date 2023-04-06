package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import org.junit.Test;
import entities.GrafoCompleto;

public class testeGrafoCompleto {
    
    @Test
    /*
     * O método testCriarGrafoCompleto verifica se um objeto GrafoCompleto 
     * pode ser criado com sucesso com uma ordem definida de 5.
     */
    public void testCriarGrafoCompleto() {
        GrafoCompleto gc = new GrafoCompleto(5);
        assertNotNull(gc);
    }
    
    @Test
    /*
     * O método testOrdemGrafoCompleto verifica se a ordem do grafo criado anteriormente é igual a 5.
     */
    public void testOrdemGrafoCompleto() {
        GrafoCompleto gc = new GrafoCompleto(5);
        assertEquals(5, gc.getOrdem());
    }
}
