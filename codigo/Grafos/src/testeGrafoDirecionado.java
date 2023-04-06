package testes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import entities.Aresta;
import entities.GrafoDirecionado;

public class testeGrafoDirecionado {
    @Test
    /*
     * O método "testAddAresta" cria uma instância do objeto GrafoDirecionado, 
     * chama o método "addAresta" com parâmetros válidos e verifica se o método retorna "true" 
     * para indicar que a aresta foi adicionada com sucesso.
     */
    public void testAddAresta() {
        GrafoDirecionado grafo = new GrafoDirecionado();
        Assert.assertTrue(grafo.addAresta(1, 2, 5));
    }

    @Test
    /*
     * O método "testRemoveAresta" cria uma instância do objeto GrafoDirecionado, adiciona uma aresta
     *  com o método "addAresta", chama o método "removeAresta" passando os mesmos parâmetros da 
     *  aresta adicionada e verifica se o método retorna "null" para indicar que a aresta foi removida com sucesso.
     */
    public void testRemoveAresta() {
        GrafoDirecionado grafo = new GrafoDirecionado();
        grafo.addAresta(1, 2, 5);
        Aresta arestaRemovida = grafo.removeAresta(1, 2);
        Assert.assertNull(arestaRemovida);
    }
}
