package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.Lista;

public class testeListas {
    
    @Test
    public void testAdd() {
        Lista<Integer> lista = new Lista<Integer>();
        assertTrue(lista.add(1));
        assertTrue(lista.add(2));
        assertTrue(lista.add(3));
        assertEquals(3, lista.size());
    }
    
    @Test
    public void testAllElements() {
        Lista<Integer> lista = new Lista<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        Integer[] array = new Integer[3];
        assertArrayEquals(new Integer[] {1, 2, 3}, lista.allElements(array));
    }
    
    @Test
    public void testRemove() {
        Lista<Integer> lista = new Lista<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        assertEquals(new Integer(2), lista.remove(1));
        assertEquals(2, lista.size());
        assertEquals(new Integer(3), lista.remove(1));
        assertEquals(1, lista.size());
        assertNull(lista.remove(1));
    }
    
    @Test
    public void testSize() {
        Lista<Integer> lista = new Lista<Integer>();
        assertEquals(0, lista.size());
        lista.add(1);
        assertEquals(1, lista.size());
        lista.add(2);
        assertEquals(2, lista.size());
        lista.remove(0);
        assertEquals(1, lista.size());
    }

}
