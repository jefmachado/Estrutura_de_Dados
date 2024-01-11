package Grafos;

import java.util.ArrayList;

public class Grafo {
	ArrayList<Vertice> listacidade = new ArrayList<Vertice>();
	ArrayList<Aresta> listaaresta = new ArrayList<Aresta>();

	public Grafo() {
		
	}
	
	
	public void Cadastracidade(String nomeCidade) {
		listacidade.add(new Vertice(nomeCidade));
	}

	public void Cadastraconexao(Aresta novaconexao) {
		listaaresta.add(novaconexao);
	}
	
	public void Info_cidades() {

		if (listacidade.size() != 0) {
			for (Vertice infocidade : listacidade) {
				infocidade.info();
			}
		}
	}
	
	public void info_conexoes() {
		
		if (listaaresta.size() != 0) {
			for (Aresta infoconexoes : listaaresta) {
				infoconexoes.info();
			}
		}
	}
}
