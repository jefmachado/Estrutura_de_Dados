package org.example;

import java.util.NoSuchElementException;

public class Fila {
    private NoDinamico inicio;
    private NoDinamico fim;

    public Fila() {
        inicio = null;
        fim = null;
    }

    public void enfileirar(int valor) {
        NoDinamico novoNo = new NoDinamico(valor);
        if (vazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            novoNo.setAnterior(fim);
            fim = novoNo;
        }
    }

    public int desenfileirar() {
        if (vazia()) {
            throw new NoSuchElementException("A fila está vazia.");
        }
        int valor = inicio.getValor();
        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.getProximo();
            inicio.setAnterior(null);
        }
        return valor;
    }
    public void listar() {
        if (vazia()) {
            System.out.println("A fila está vazia.");
        } else {
            NoDinamico atual = inicio;
            while (atual != null) {
                System.out.print(atual.getValor() + " ");
                atual = atual.getProximo();
            }
            System.out.println();
        }
    }

    public int frente() {
        if (vazia()) {
            throw new NoSuchElementException("A fila está vazia.");
        }
        return inicio.getValor();
    }

    public boolean vazia() {
        return inicio == null;
    }
}