package org.example;

import lombok.Data;
import lombok.RequiredArgsConstructor;


public class NoDinamico {
    private int valor;
    private NoDinamico proximo;
    private NoDinamico anterior;

    public NoDinamico(int valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }

    public int getValor() {
        return valor;
    }

    public NoDinamico getProximo() {
        return proximo;
    }

    public void setProximo(NoDinamico proximo) {
        this.proximo = proximo;
    }

    public NoDinamico getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDinamico anterior) {
        this.anterior = anterior;
    }



}
