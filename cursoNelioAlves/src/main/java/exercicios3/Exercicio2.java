package exercicios3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite as coordenadas X e Y:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        while (x != 0.0 && y != 0.0) {
            if (x > 0.0 && y > 0.0) {
                System.out.println("Primeiro Quadrante");
            } else if (x < 0.0 && y > 0.0) {
                System.out.println("Segundo Quadrante");
            } else if (x < 0.0 && y < 0.0) {
                System.out.println("Terceiro Quadrante");
            } else {
                System.out.println("Quarto Quadrante");
            }
            System.out.println("Digite as coordenadas X e Y:");
            x = scanner.nextDouble();
            y = scanner.nextDouble();
        }
    }
}
