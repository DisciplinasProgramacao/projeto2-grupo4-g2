package entities;

public class GrafoCompleto extends Grafo {

    public GrafoCompleto(String nome, int n) {
        super(nome);
        completo(n);
    }

    
    public void completo(int n){
 	   for (int i = 0; i < n; i++) {
 	        for (int j = i + 1; j < n; j++) {
 	            this.addAresta(i, j);
 	            this.addAresta(j, i);
 	        }
 	    }
 }
    
}