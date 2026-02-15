package exercicios2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digiteo código do produto (1-5):");
        int codigo = scanner.nextInt();
        System.out.println("Digite a quantidade desejada:");
        int quantidade = scanner.nextInt();
        double preco;
        if (codigo == 1) {
            preco = 4.00;
        } else if (codigo == 2) {
            preco = 4.50;
        } else if (codigo == 3) {
            preco = 5.00;
        } else if (codigo == 4) {
            preco = 2.00;
        } else {
            preco = 1.50;
        }
        double total = preco * quantidade;
        System.out.printf("Total a pagar: R$ %.2f%n", total);
        scanner.close();
    }
}
