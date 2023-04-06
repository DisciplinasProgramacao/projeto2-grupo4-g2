package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entities.ABB;

class testeABB {

    @Test
    /**O método testFind() verifica se o método find() 
     *está retornando o objeto correto para uma determinada chave
     */
    public void testFind() {
        ABB<String> abb = new ABB<String>();
        abb.add(1, "A");
        abb.add(2, "B");
        abb.add(3, "C");
        abb.add(4, "D");
        assertNull(abb.find(5));
        assertEquals("A", abb.find(1));
        assertEquals("B", abb.find(2));
        assertEquals("C", abb.find(3));
        assertEquals("D", abb.find(4));
    }

    @Test
    /*O método testAdd() verifica se o método add() 
     *está inserindo novos elementos corretamente, ignorando as inserções com chaves já existentes.
     */
    public void testAdd() {
        ABB<Integer> abb = new ABB<Integer>();
        assertTrue(abb.add(1, 10));
        assertTrue(abb.add(2, 20));
        assertFalse(abb.add(1, 30));
        assertFalse(abb.add(2, 40));
        assertEquals(2, abb.size());
    }

    @Test
    /*O método testRemove() verifica se o método remove() 
     *está removendo o elemento correto para uma determinada chave, 
     *e se retorna nulo quando a chave não existe na árvore.
     */
    public void testRemove() {
        ABB<Character> abb = new ABB<Character>();
        abb.add(1, 'A');
        abb.add(2, 'B');
        abb.add(3, 'C');
        abb.add(4, 'D');
        assertNull(abb.remove(5));
        assertEquals(Character.valueOf('A'), abb.remove(1));
        assertNull(abb.find(1));
        assertEquals(3, abb.size());
    }

    @Test
    /*O método testAllElements() verifica se o método allElements()
     * está retornando todos os elementos da árvore em um vetor/array.
     */
    public void testAllElements() {
        ABB<String> abb = new ABB<String>();
        abb.add(1, "A");
        abb.add(2, "B");
        abb.add(3, "C");
        abb.add(4, "D");
        String[] array = new String[abb.size()];
        String[] allData = abb.allElements(array);
        assertArrayEquals(new String[]{"A", "B", "C", "D"}, allData);
    }

}
