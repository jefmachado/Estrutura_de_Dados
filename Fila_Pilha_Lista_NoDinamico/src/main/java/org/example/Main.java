package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lista lista = new Lista();
        Fila fila = new Fila();
        Pilha pilha = new Pilha();
        int key, entrada;
        boolean fimLoop = false;

        while (!fimLoop) {

            System.out.print("\n[1]Inserir LIFO"
                    + "\n[2] Remoção LIFO"
                    + "\n[3] Listar Pilha"
                    + "\n[4] Inserção FIFO"
                    + "\n[5] Remoção FIFO"
                    + "\n[6] Listar Fila"
                    + "\n[7] Inserção inicio da lista"
                    + "\n[8] Inserção Final da lista"
                    + "\n[9] Remoção inicio da Lista"
                    + "\n[10] Remoção Final da fila da Lista"
                    + "\n[11] Listar Lista"
                    + "\n[0] Fechar programa"
                    + "\nEscolha uma opção: ");
            key = scanner.nextInt();


            switch (key) {
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                case 1: // Inserção LIFO
                    System.out.print("Digite um valor para empilhar: ");
                    int valorPilha = scanner.nextInt();
                    pilha.empilhar(valorPilha);
                    System.out.println("Valor empilhado: " + valorPilha);
                    break;
                case 2: // Remoção LIFO
                    try {
                        int valorDesempilhado = pilha.desempilhar();
                        System.out.println("Valor desempilhado: " + valorDesempilhado);
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 3:
                    pilha.listar();
                    break;

                case 4: //Inserção FIFO
                    System.out.print("Digite um valor para enfileirar: ");
                    int valorFila = scanner.nextInt();
                    fila.enfileirar(valorFila);
                    System.out.println("Valor enfileirado: " + valorFila);
                    break;
                case 5: // Remoção FIFO
                    try {
                        int valorDesenfileirado = fila.desenfileirar();
                        System.out.println("Valor desenfileirado: " + valorDesenfileirado);
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 6:
                    fila.listar();
                    break;

                case 7: // Insere valor no inicio da lista
                    System.out.print("Digite um valor para inserir no início da lista: ");
                    int valorInicioLista = scanner.nextInt();
                    lista.inserirInicio(valorInicioLista);
                    System.out.println("Valor inserido no início da lista: " + valorInicioLista);
                    break;
                case 8: // insere valor no fim da lista
                    System.out.print("Digite um valor para inserir no fim da lista: ");
                    int valorFimLista = scanner.nextInt();
                    lista.inserirFim(valorFimLista);
                    System.out.println("Valor inserido no fim da lista: " + valorFimLista);
                    break;

                case 9: // remoção no inico da lista
                    try {
                        int valorRemovidoInicio = lista.removerInicio();
                        System.out.println("Valor removido do início da lista: " + valorRemovidoInicio);
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 10: // remoção no fim da lista
                    try {
                        int valorRemovidoFim = lista.removerFim();
                        System.out.println("Valor removido do fim da lista: " + valorRemovidoFim);
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 11:
                    lista.exibirLista();
                    break;

                    }
            }
        }
    }