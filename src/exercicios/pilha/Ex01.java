package exercicios.pilha;

import estruturadados.Pilha;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pilha<Integer> pilha = new Pilha<>();

        for (int i=0; i<10; i++){
            int num = sc.nextInt();
            if (num % 2 == 0){
                pilha.empilhar(num);
                System.out.println("Empilhando: " + num);
            }
            else{
                if (pilha.estaVazio()) System.out.println("A pilha está vazia");
                else System.out.println("Desempilhando: " + pilha.desempilhar());
            }

        }
        System.out.println("\nComo ficou a pilha: " + pilha);

        System.out.println("\nDesempilhando o que sobrou...");
        while(!pilha.estaVazio()){
            System.out.println("Desempilhando: " + pilha.desempilhar());
        }
        System.out.println("\nA pilha está vazia: " + pilha);

    }
}
