package exercicios2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a hora inicial (formato 24h):");
        int horaInicial = scanner.nextInt();
        System.out.println("Digite a hora final (formato 24h):");
        int horaFinal = scanner.nextInt();
        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = (24 - horaInicial) + horaFinal;
        }
        System.out.println("O jogo durou " + duracao + " hora(s).");
        scanner.close();
    }
}
