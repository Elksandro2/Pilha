package exercicios.pilha;

import estruturadados.Pilha;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pilha<Character> pilhaDeCaracteres = new Pilha<>();

        System.out.print("Escreva uma palavra: ");
        String palavraFornecida = sc.nextLine().toUpperCase();

        for (int i=0; i<palavraFornecida.length(); i++){
            System.out.println("Empilhando o caracter: '" + palavraFornecida.charAt(i) + "'");
            pilhaDeCaracteres.empilhar(palavraFornecida.charAt(i));
        }

        String palavraInversa = "";
        System.out.println("\nDesempilhando...");
        while (!pilhaDeCaracteres.estaVazio()){
            System.out.println("Desempilhando: '" + (palavraInversa+=pilhaDeCaracteres.desempilhar()) + "'");
        }

        System.out.println("\nPalavra original: " + palavraFornecida);
        System.out.println("Palavra inversa: " + palavraInversa);

        System.out.println("\nResultado:");
        if (palavraInversa.equals(palavraFornecida)) System.out.println("É PALÍNDROMO");
        else System.out.println("NÃO É PALÍNDROMO");

    }
}
