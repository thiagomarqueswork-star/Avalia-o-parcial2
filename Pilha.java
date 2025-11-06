package exercicios;

public class Pilha {
    private int[] elementos;
    private int topo;

    public Pilha() {
        elementos = new int[5];
        topo = -1;
    }

    public void empilhar(int valor) {
        if (topo < 4) {
            topo++;
            elementos[topo] = valor;
        } else {
            System.out.println("Pilha cheia!");
        }
    }

    public void desempilhar() {
        if (topo >= 0) {
            System.out.println("Desempilhado: " + elementos[topo]);
            topo--;
        } else {
            System.out.println("Pilha vazia!");
        }
    }

    public void mostrar() {
        System.out.print("Pilha: ");
        for (int i = topo; i >= 0; i--) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}

