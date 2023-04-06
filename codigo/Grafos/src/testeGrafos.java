package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import entities.Grafo;

class testeGrafos {

	Grafo grafo;
	
	@Before
	/*O método setUp() é executado antes de cada teste e é responsável por instanciar um novo objeto Grafo
	 * com o nome "Grafo de teste".
	 */
	public void setUp() {
		grafo = new Grafo("Grafo de teste");
	}
	
	@Test
	/*O método testCarregar() verifica se o método carregar() está carregando corretamente
	 * o arquivo de entrada e se o número de vértices e arestas estão sendo atribuídos corretamente.
	 */
	public void testCarregar() {
		grafo.carregar();
		assertEquals(4, grafo.getNumVertice());
		assertEquals(5, grafo.getNumAresta());
	}
	
	@Test
	/*O método testSalvar() verifica se o método salvar() está salvando corretamente
	 *  a matriz de incidência em um arquivo de saída e se é possível carregar essa matriz 
	 *  novamente e verificar se o número de vértices e arestas está correto.
	 */
	public void testSalvar() {
		grafo.carregar();
		grafo.salvar();
		Grafo grafoSalvo = new Grafo("GrafoSalvo");
		grafoSalvo.carregar();
		assertEquals(grafo.getNumVertice(), grafoSalvo.getNumVertice());
		assertEquals(grafo.getNumAresta(), grafoSalvo.getNumAresta());
	}
	
	@Test
	/*O método testNome() verifica se o método nome() 
	 * está retornando corretamente o nome do grafo instanciado no setUp().
	 */
	public void testNome() {
		assertEquals("Grafo de teste", grafo.nome());
	}

}
