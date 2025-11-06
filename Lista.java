package exercicios;

public class Lista {
    private int[] elementos;
    private int tamanho;

    public Lista() {
        elementos = new int[5];
        tamanho = 0;
    }

    public void inserir(int valor) {
        if (tamanho < 5) {
            elementos[tamanho] = valor;
            tamanho++;
        } else {
            System.out.println("Lista cheia!");
        }
    }

    public void mostrar() {
        System.out.print("Lista: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}
