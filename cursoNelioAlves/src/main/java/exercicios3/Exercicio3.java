package exercicios3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o combustível abastecido (1 - Álcool, 2 - Gasolina, 3 - Diesel, 4 - Fim):");
        int codigo = scanner.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        while (codigo != 4) {
            switch (codigo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    System.out.println("Código inválido. Tente novamente.");
            }
            System.out.println("Digite o combustível abastecido (1 - Álcool, 2 - Gasolina, 3 - Diesel, 4 - Fim):");
            codigo = scanner.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
