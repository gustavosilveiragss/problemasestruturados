package org.dsa;

public class Main {
    public static void main(String[] args) {
        testaPilha();
        testaFila();
    }

    private static void testaPilha() {
        Pilha pilha = new Pilha(5);

        System.out.println("Pilha inicial:");
        pilha.imprime();

        pilha.insere(5);
        System.out.println("Pilha após inserir 5:");
        pilha.imprime();

        pilha.insere(10);
        pilha.insere(15);
        pilha.insere(20);
        pilha.insere(25);
        System.out.println("Pilha após inserir 10, 15, 20 e 25:");
        pilha.imprime();

        // Teste de exceção
        try {
            pilha.insere(30);
        } catch (RuntimeException e) {
            System.out.println("Erro ao inserir na pilha cheia: " + e.getMessage());
        }

        pilha.remove();
        System.out.println("Pilha após remover:");
        pilha.imprime();

        pilha.remove();
        pilha.remove();
        pilha.remove();
        pilha.remove();
        System.out.println("Pilha após remover 10, 15, 20 e 25:");
        pilha.imprime();

        // Teste de exceção
        try {
            pilha.remove();
        } catch (RuntimeException e) {
            System.out.println("Erro ao remover da pilha vazia: " + e.getMessage());
        }
    }

    private static void testaFila() {
        Fila fila = new Fila(5);

        System.out.println("Fila inicial:");
        fila.imprime();

        fila.insere(5);
        System.out.println("Fila após inserir 5:");
        fila.imprime();

        fila.insere(10);
        fila.insere(15);
        fila.insere(20);
        fila.insere(25);
        System.out.println("Fila após inserir 10, 15, 20 e 25:");
        fila.imprime();

        // Teste de exceção
        try {
            fila.insere(30);
        } catch (RuntimeException e) {
            System.out.println("Erro ao inserir na fila cheia: " + e.getMessage());
        }

        fila.remove();
        System.out.println("Fila após remover:");
        fila.imprime();

        fila.remove();
        fila.remove();
        fila.remove();
        fila.remove();
        System.out.println("Fila após remover 10, 15, 20 e 25:");
        fila.imprime();

        // Teste de exceção
        try {
            fila.remove();
        } catch (RuntimeException e) {
            System.out.println("Erro ao remover da fila vazia: " + e.getMessage());
        }
    }
}