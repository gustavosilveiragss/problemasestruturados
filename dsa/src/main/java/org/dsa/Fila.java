package org.dsa;

public class Fila {
    private int primeiro;
    private int ultimo;
    private final int[] dados;
    private final int capacidade;

    public Fila(int capacidade) {
        this.primeiro = 0;
        this.ultimo = 0;
        this.dados = new int[capacidade];
        this.capacidade = capacidade;
    }

    private boolean cheia() {
        return this.ultimo == this.capacidade;
    }

    private boolean vazia() {
        return this.primeiro == this.ultimo;
    }

    public void insere(int elemento) {
        if (this.cheia()) {
            throw new RuntimeException("A fila está cheia");
        }
        dados[this.ultimo++] = elemento;
    }

    public int remove() {
        if (this.vazia()) {
            throw new RuntimeException("A fila está vazia");
        }
        return dados[this.primeiro++];
    }

    public void imprime() {
        if (this.vazia()) {
            System.out.println("Fila vazia");
            return;
        }

        for (int i = this.primeiro; i < this.ultimo; i++) {
            System.out.println(this.dados[i]);
        }
    }
}
