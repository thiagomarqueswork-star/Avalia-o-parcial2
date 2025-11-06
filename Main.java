package ap_2;


class No {
    int valor;
    No esquerda;
    No direita;

    public No(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}
class ArvoreBinariaDeBusca {

    public No raiz;

    public ArvoreBinariaDeBusca() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        this.raiz = inserirRecursivo(this.raiz, valor);
    }

    private No inserirRecursivo(No noAtual, int valor) {
        if (noAtual == null) {
            System.out.println("Inserindo " + valor);
            return new No(valor);
        }

        if (valor < noAtual.valor) {
            noAtual.esquerda = inserirRecursivo(noAtual.esquerda, valor);
        } else if (valor > noAtual.valor) {
            noAtual.direita = inserirRecursivo(noAtual.direita, valor);
        } else {
            System.out.println("Valor " + valor + " duplicado, ignorando.");
        }

        return noAtual;
    }

    public void percursoEmOrdem() {
        percursoEmOrdemRecursivo(this.raiz);
        System.out.println();
    }

    private void percursoEmOrdemRecursivo(No noAtual) {
        if (noAtual != null) {
            percursoEmOrdemRecursivo(noAtual.esquerda);
            System.out.print(noAtual.valor + " ");
            percursoEmOrdemRecursivo(noAtual.direita);
        }
    }

    public void percursoPosOrdem() {
        percursoPosOrdemRecursivo(this.raiz);
        System.out.println();
    }

    private void percursoPosOrdemRecursivo(No noAtual) {
        if (noAtual != null) {
            percursoPosOrdemRecursivo(noAtual.esquerda);
            percursoPosOrdemRecursivo(noAtual.direita);
            System.out.print(noAtual.valor + " ");
        }
    }

    public void percursoPreOrdem() {
        percursoPreOrdemRecursivo(this.raiz);
        System.out.println();
    }

    private void percursoPreOrdemRecursivo(No noAtual) {
        if (noAtual != null) {
            System.out.print(noAtual.valor + " ");
            percursoPreOrdemRecursivo(noAtual.esquerda);
            percursoPreOrdemRecursivo(noAtual.direita);
        }
    }
}

class Principal {

    public static void main(String[] args) {

        ArvoreBinariaDeBusca bst = new ArvoreBinariaDeBusca();

        int[] ra = {2, 4, 0, 0, 8, 4, 8};

        System.out.println("--- Construindo Árvore com RA: 2400848 ---");

        for (int digito : ra) {
            bst.inserir(digito);
        }

        System.out.println("\n--- Percurso Pré-Ordem ---");
        bst.percursoPreOrdem();

        System.out.println("\n--- Percurso Em Ordem (Ordenado) ---");
        bst.percursoEmOrdem();

        System.out.println("\n--- Percurso Pós-Ordem ---");
        bst.percursoPosOrdem();
    }
}
