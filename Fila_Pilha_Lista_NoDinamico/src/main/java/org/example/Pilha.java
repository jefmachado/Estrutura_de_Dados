package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Pilha {
    private NoDinamico topo;

    public Pilha() {
        topo = null;
    }

    public void empilhar(int valor) {
        NoDinamico novoNo = new NoDinamico(valor);
        if (topo == null) {
            topo = novoNo;
        } else {
            novoNo.setProximo(topo);
            topo = novoNo;
        }
    }
    public void listar() {
        if (vazia()) {
            System.out.println("A pilha está vazia.");
        } else {
            NoDinamico atual = topo;
            while (atual != null) {
                System.out.print(atual.getValor() + " ");
                atual = atual.getProximo();
            }
            System.out.println();
        }
    }


    public int desempilhar() {
        if (vazia()) {
            throw new EmptyStackException();
        }
        int valor = topo.getValor();
        topo = topo.getProximo();
        return valor;
    }

    public int topo() {
        if (vazia()) {
            throw new EmptyStackException();
        }
        return topo.getValor();
    }

    public boolean vazia() {
        return topo == null;
    }
}
