package org.dsa;

public class Pilha {
    private int topo;
    private final int[] dados;
    private final int capacidade;

    public Pilha(int capacidade) {
        this.topo = 0;
        this.dados = new int[capacidade];
        this.capacidade = capacidade;
    }

    private boolean cheia() {
        return this.topo == this.capacidade;
    }

    private boolean vazia() {
        return this.topo == 0;
    }

    public void insere(int elemento) {
        if (this.cheia()) {
            throw new RuntimeException("A pilha está cheia");
        }
        this.dados[this.topo++] = elemento;
    }

    public int remove() {
        if (this.vazia()) {
            throw new RuntimeException("A pilha está vazia");
        }
        return this.dados[--this.topo];
    }

    public void imprime() {
        if (this.vazia()) {
            System.out.println("Pilha vazia");
            return;
        }

        for (int i = 0; i < this.topo; i++) {
            System.out.println(this.dados[i]);
        }
    }
}
