package exercicios;

import estruturadados.Pilha;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pilha<Integer> pilhaPar = new Pilha<>();
        Pilha<Integer> pilhaImpar = new Pilha<>();

        for (int i=0; i<10; i++){
            System.out.print("Informe o número: ");
            int numero = sc.nextInt();
            if (numero != 0){
                if (numero % 2 == 0){
                    System.out.println("Empilhando número '" + numero + "' na pilha 'par'");
                    pilhaPar.empilhar(numero);
                }
                else{
                    System.out.println("Empilhando número '" + numero + "' na pilha 'ímpar'");
                    pilhaImpar.empilhar(numero);
                }
            } else {
                if (pilhaPar.estaVazio()) System.out.println("A pilha 'par' está vazia!");
                else System.out.println("Desempilhando número '" + pilhaPar.desempilhar() + "' da pilha 'par'");

                if (pilhaImpar.estaVazio()) System.out.println("A pilha 'ímpar' está vazia!");
                else System.out.println("Desempilhando número '" + pilhaImpar.desempilhar() + "' da pilha 'ímpar'");
            }
        }

        System.out.println("\nPilha par: " + pilhaPar);
        System.out.println("Pilha ímpar: " + pilhaImpar);

        System.out.println("\nDesempilhando pilha 'par'...");
        while (!pilhaPar.estaVazio()){
            System.out.println("Desempilhando: " + pilhaPar.desempilhar());
        }

        System.out.println("\nDesempilhando pilha 'ímpar'...");
        while (!pilhaImpar.estaVazio()){
            System.out.println("Desempilhando: " + pilhaImpar.desempilhar());
        }

    }
}
