package Grafos;

public class Aresta {
	Vertice cidade1;
	Vertice cidade2;
	int distancia;

	public Aresta(int distancia, Vertice cidade1, Vertice cidade2) {
		this.distancia = distancia;
		this.cidade1 = cidade1;
		this.cidade2 = cidade2;
	}

	public void info() {
		System.out.println("A distancia entre: " + cidade1.nomecidade + "  " + " e " + " " + cidade2.nomecidade + " é " +" de " + distancia);
	}
}
