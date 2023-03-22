package entities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/** 
 * MIT License
 *
 * Copyright(c) 2021-23 João Caram <caram@pucminas.br>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/** 
 * Classe básica para um Grafo simples não direcionado.
 */
public class Grafo {
    public final String nome;
    private ABB<Vertice> vertices;

    public static Grafo grafoCompleto(int ordem){
        return null;
    }

    /**
     * Construtor. Cria um grafo vazio com um nome escolhido pelo usuário. Em caso de nome não informado 
     * (string vazia), recebe o nome genérico "Grafo"
     */
    public Grafo(String nome){
        if(nome.length()==0) 
            this.nome = "Grafo";
        else
            this.nome = nome;
        this.vertices = new ABB<>();
    }

    /**
     * Retorna o nome do grafo (string), caso seja necessário em outras classes/sistemas
     * @return O nome do grafo (uma string)
     */
    public String nome(){
        return this.nome;
    }


    public void carregar(String arquivo){
    	//GrafoEntrada.txt
    	
    	int numVertice;
    	int numAresta;
    	int [][] matrizIncidencia;
    	
    	File GrafoIn = new File(arquivo);		
		try (BufferedReader br = new BufferedReader(new FileReader(GrafoIn))) {			
			String linha = br.readLine();
						
				
				String campos[] = linha.split(",");
				numVertice = campos.length;
				numAresta = 0;
				
				for(int i=0; i< numVertice; i++) {
					if(campos[i].equals(1)) {
						numAresta++;
					}
				}				
				matrizIncidencia = new int[numVertice][numAresta];		
				
				int j = 0;
				do {
					campos = linha.split(",");
					for(int i = 0; i< numVertice;i++) {
						matrizIncidencia[i][j] = Integer.parseInt(campos[i]);
					}
					j++;
				} while ((linha!= null));
				
				br.close();
				
				
				
				System.out.println("Carregou o arquivo");
			} 
		
		
			catch(IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}		

    }

    public void salvar(String nomeArquivo){
        //GrafoSaida.txt
    }
    
    /**
     * Adiciona um vértice com o id especificado. Ignora a ação e retorna false se já existir
     * um vértice com este id
     * @param id O identificador do vértice a ser criado/adicionado
     * @return TRUE se houve a inclusão do vértice, FALSE se já existia vértice com este id
     */
    public boolean addVertice(int id){
        Vertice novo = new Vertice(id);
        return this.vertices.add(id, novo);
    }

    public Vertice removeVertice(int id){
        return null;
    }

    public Vertice existeVertice(int idVertice){
        return null;
    }

    /**
     * Adiciona uma aresta entre dois vértices do grafo, caso os dois vértices existam no grafo. 
     * Caso a aresta já exista, ou algum dos vértices não existir, o comando é ignorado e retorna FALSE.
     * @param origem Vértice de origem
     * @param destino Vértice de destino
     * @param peso Peso da aresta
     * @return TRUE se foi inserida, FALSE caso contrário
     */
    public boolean addAresta(int origem, int destino, int peso){
        boolean adicionou = false;
        Vertice saida = this.existeVertice(origem);
        Vertice chegada = this.existeVertice(destino);
        if(saida!=null && chegada !=null){
            adicionou = (saida.addAresta(destino, peso)&&chegada.addAresta(origem, peso));
        }
        return adicionou;

    }


    public Aresta removeAresta(int origem, int destino){
        return null;
    }

    public Aresta existeAresta(int verticeA, int verticeB){
       return null;
    }
    
    
    public boolean completo(){
       return false;
    }

    public Grafo subGrafo(Lista<Integer> vertices){
        Grafo subgrafo = new Grafo("Subgrafo de "+this.nome);
        
        return subgrafo;
    }
    
    public int tamanho(){
        return Integer.MIN_VALUE;
    }

    public int ordem(){
        return Integer.MIN_VALUE;
    }

}