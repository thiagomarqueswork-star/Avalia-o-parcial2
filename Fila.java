package exercicios;

public class Fila {
    private int[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    public Fila() {
        elementos = new int[5];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public void enfileirar(int valor) {
        if (tamanho < 5) {
            elementos[fim] = valor;
            fim = (fim + 1) % 5;
            tamanho++;
        } else {
            System.out.println("Fila cheia!");
        }
    }

    public void desenfileirar() {
        if (tamanho > 0) {
            System.out.println("Desenfileirado: " + elementos[inicio]);
            inicio = (inicio + 1) % 5;
            tamanho--;
        } else {
            System.out.println("Fila vazia!");
        }
    }

    public void mostrar() {
        System.out.print("Fila: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[(inicio + i) % 5] + " ");
        }
        System.out.println();
    }
}

