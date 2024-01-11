package Grafos;

import java.util.ArrayList;

public class Vertice {
	ArrayList<Vertice> listavizinhanca = new ArrayList<Vertice>();
	ArrayList<Aresta> listaaresta = new ArrayList<Aresta>();
	String nomecidade;
	
	public Vertice(String nomeCidade) {
		this.nomecidade = nomeCidade;
	}

	public void info() {
		System.out.println("\n");
		System.out.println("Cidade: " + nomecidade);

	}

	public void info_vizinho() {

		if (listavizinhanca.size() != 0) {
			for (Vertice cidade : listavizinhanca) {
				cidade.info();
			}
		}

	}

	public void Info_conexoes() {

		if (listaaresta.size() != 0) {
			for (Aresta conexoes : listaaresta) {
				conexoes.info();
			}
		}
	}
}
