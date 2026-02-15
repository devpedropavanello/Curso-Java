package exercicios3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha de acesso:");
        int senha = scanner.nextInt();
        while (senha != 2002) {
            System.out.println("Senha Invalida. Tente novamente:");
            senha = scanner.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}
