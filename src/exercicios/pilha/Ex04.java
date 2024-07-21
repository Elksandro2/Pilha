package exercicios.pilha;

import java.util.Scanner;
import java.util.Stack;

public class Ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Livro> livros = new Stack<>();

        System.out.println("Pilha de livros: " + livros);

        Livro livro1 = new Livro("Teste 1", "988-9-88999-999-9", 2009, "José");
        Livro livro2 = new Livro("Teste 2", "988-9-77777-999-9", 2013, "Anna");
        Livro livro3 = new Livro("Teste 3", "988-9-88999-777-9", 2014, "Sandro");
        Livro livro4 = new Livro("Teste 4", "988-9-88999-999-9", 2017, "Gabriela");
        Livro livro5 = new Livro("Teste 5", "777-9-88999-999-9", 2020, "Elksandro");
        Livro livro6 = new Livro("Teste 6", "777-9-77777-777-9", 2024, "Moura");

        System.out.println("\nEmpilhando livro: " + livros.push(livro1));
        System.out.println("Empilhando livro: " + livros.push(livro2));
        System.out.println("Empilhando livro: " + livros.push(livro3));
        System.out.println("Desempilhando livro: " + livros.pop());
        System.out.println("Empilhando livro: " + livros.push(livro4));
        System.out.println("Empilhando livro: " + livros.push(livro5));
        System.out.println("Desempilhando livro: " + livros.pop());
        System.out.println("Empilhando livro: " + livros.push(livro6));

        System.out.println("\nPilha de livros: " + livros);

        System.out.println("\nDesempilhando livros restantes...");
        while (!livros.empty()){
            System.out.println("Desempilhando livro: " + livros.pop());
        }

        System.out.println("\nPilha de livros está vazia: " + livros);
    }

    public static class Livro{

        private String nome;
        private String isbn;
        private int anoLancamento;
        private String autor;

        public Livro(String nome, String isbn, int anoLancamento, String autor) {
            this.nome = nome;
            this.isbn = isbn;
            this.anoLancamento = anoLancamento;
            this.autor = autor;
        }

        public String getNome() {
            return nome;
        }

        public String getIsbn() {
            return isbn;
        }

        public int getAnoLancamento() {
            return anoLancamento;
        }

        public String getAutor() {
            return autor;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", isbn='" + isbn + '\'' +
                    ", anoLancamento=" + anoLancamento +
                    ", autor='" + autor + '\'' +
                    '}';
        }
    }

}

