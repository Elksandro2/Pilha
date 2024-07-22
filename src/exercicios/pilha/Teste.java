package exercicios.pilha;

import estruturadados.Pilha;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha<Integer> pilha = new Pilha<>();

        for (int i=0; i<7; i++){
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

        System.out.println("\nO que sobrou na pilha: " + pilha);
    }
}
