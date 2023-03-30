package entities;

public class GrafoMutavel extends Grafo {
    
    public GrafoMutavel(String nome) {
        super(nome);
        
    }

    public boolean addVertice(int id) {
        return true;
    }

    public Vertice removeVertice(int id){
        Vertice v = new Vertice(id);
        return v;
    }

    public boolean addAresta(int origem, int destino, int peso){
        return true;
    }

    public Aresta removeAresta(int origem, int destino){
        Aresta a = new Aresta(origem, destino);
        return a;
    }

    public void carregar(String nomeArquivo){

    }

    public void salvar(String nomeArquivo){

    }
}
