package org.example;

import java.util.NoSuchElementException;

public class Lista {
    private NoDinamico inicio;
    private NoDinamico fim;

    public Lista() {
        inicio = null;
        fim = null;
    }

    public void inserirInicio(int valor) {
        NoDinamico novoNo = new NoDinamico(valor);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.setProximo(inicio);
            inicio.setAnterior(novoNo);
            inicio = novoNo;
        }
    }

    public void inserirFim(int valor) {
        NoDinamico novoNo = new NoDinamico(valor);
        if (fim == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.setAnterior(fim);
            fim.setProximo(novoNo);
            fim = novoNo;
        }
    }

    public int removerInicio() {
        if (inicio == null) {
            throw new NoSuchElementException("A lista está vazia.");
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

    public int removerFim() {
        if (fim == null) {
            throw new NoSuchElementException("A lista está vazia.");
        }
        int valor = fim.getValor();
        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            fim = fim.getAnterior();
            fim.setProximo(null);
        }
        return valor;
    }
    public void exibirLista() {
        if (vazia()) {
            System.out.println("A lista está vazia.");
        } else {
            NoDinamico atual = inicio;
            while (atual != null) {
                System.out.print(atual.getValor() + " ");
                atual = atual.getProximo();
            }
            System.out.println();
        }
    }

    public boolean vazia() {
        return inicio == null;
    }
}