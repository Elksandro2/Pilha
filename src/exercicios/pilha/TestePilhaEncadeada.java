package exercicios.pilha;

import estruturadados.PilhaComEncadeamento;

import java.util.Scanner;

public class TestePilhaEncadeada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PilhaComEncadeamento<String> pilha = new PilhaComEncadeamento<String>();

        System.out.println("Digite strings (digite '-' para desempilhar e 'exit' para terminar):");

        while (scanner.hasNext()) {
            String item = scanner.next();
            if (item.equals("exit")) {
                break;
            } else if (!item.equals("-")) {
                pilha.push(item);
            } else if (!pilha.isEmpty()) {
                System.out.print(pilha.pop() + " ");
            }
        }

        System.out.println("\n(" + pilha.size() + " left on pilha)");
        System.out.println(pilha);
        scanner.close();
    }
}
