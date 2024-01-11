package Grafos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner kboard = new Scanner(System.in);
		int key, i;
		boolean fimLoop = false;
		Grafo g1 = new Grafo();
	

		while (!fimLoop) {

			System.out.print("=== Sistema de Livraria ===" + "\n[1] Cadastrar Cidade" + "\n[2] Cadastrar Conexao"
					+ "\n[3] Listar Cidades" + "\n[4] Listar Conexões" + "\n[5] Listar Cidades vizinhas"
					+ "\n[0] encerrar atividades" + "\nEscolha uma opção: ");
			key = kboard.nextInt();

			switch (key) {
			case 1:
				System.out.println("=== Cadastro de Cidades ===");
				System.out.println("Infome a cidade que deseja cadastras: ");
				String novacidade = kboard.next();
				g1.Cadastracidade(novacidade);

				break;
			case 2:
				i = 0;
				System.out.println("=== Cadastro de Conexões ===");
				for(Vertice cidade : g1.listacidade){
					System.out.println(i + " -" + cidade.nomecidade);
					i++;
				}
				System.out.println("escolha uma cidade");
				Vertice cidade1 = g1.listacidade.get(kboard.nextInt());
				
				System.out.println("escolha a cidade vizinha");
				Vertice cidade2 = g1.listacidade.get(kboard.nextInt());
				
				System.out.println("informe a distancia ");
				int distancia = kboard.nextInt();
				
				Aresta aresta = new Aresta(distancia, cidade1, cidade2);
				
				g1.listaaresta.add(aresta);
				
				cidade1.listavizinhanca.add(cidade2);
				
				cidade2.listavizinhanca.add(cidade1);
				
				cidade1.listaaresta.add(aresta);
				
				cidade2.listaaresta.add(aresta);
				
				
				break;
				
			case 3:
				g1.Info_cidades();
				
				break;
				
			case 4:
				g1.info_conexoes();
				
				break;
			case 5:
				i =0;
				for(Vertice cidade : g1.listacidade){
					System.out.println(i + " -" + cidade.nomecidade);
					i++;
				}
				System.out.println("escolha uma cidade");
				
				Vertice cidade = g1.listacidade.get(kboard.nextInt());
				
				for(int j = 0; j < cidade.listavizinhanca.size(); j++) {
					cidade.listaaresta.get(j).info();
				}
				
			}

		}

	}
}
