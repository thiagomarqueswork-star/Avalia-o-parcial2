# 🧠 Prova: Estruturas de Dados (TADs)

Repositório criado para a **prova de Estruturas de Dados**, contendo as implementações práticas dos **Tipos Abstratos de Dados (TADs)** em **Java**, incluindo as estruturas lineares **Lista**, **Pilha**, **Fila** e a estrutura não linear **Árvore Binária de Busca (BST)**.

---

## 📘 Sobre o Projeto

O objetivo deste repositório é demonstrar o entendimento e a aplicação dos conceitos de **estruturas de dados** utilizando a linguagem **Java**.  
Aqui estão incluídas duas partes principais da prova:

---

### 🧩 Parte 1 – Estruturas Lineares (Lista, Pilha e Fila)

Nesta parte foram desenvolvidas três classes principais, cada uma representando um tipo abstrato de dado (TAD):

- **Lista.java** → armazena elementos de forma sequencial e permite inserções até o limite do vetor.  
- **Pilha.java** → segue o princípio **LIFO (Last In, First Out)**, onde o último elemento inserido é o primeiro a ser removido.  
- **Fila.java** → segue o princípio **FIFO (First In, First Out)**, onde o primeiro elemento inserido é o primeiro a sair.  

Essas classes utilizam **vetores estáticos de tamanho fixo (5 posições)** e possuem métodos para inserir, remover e exibir os elementos.  
O controle de interação é feito pela classe **Principal.java**, que contém um **menu interativo** via terminal para testar todas as operações.

---

### 🌳 Parte 2 – Árvore Binária de Busca (BST)

A segunda parte do repositório contém a implementação de uma **Árvore Binária de Busca**, conforme o enunciado da prova:

**Prova: Estruturas de Dados (TADs)**  
**Instruções:**  
O programa deve construir uma **Árvore Binária de Busca (BST)** 

**Regras da BST:**
- Se o novo número for **menor** que o nó atual → vá para a **esquerda**  
- Se o novo número for **maior** → vá para a **direita**

Após a inserção de todos os números, o programa exibe:
- **Raiz da árvore**  
- **Folhas (nós sem filhos)**  
- **Altura da árvore**  
- **Percurso em ordem (elementos ordenados)**

