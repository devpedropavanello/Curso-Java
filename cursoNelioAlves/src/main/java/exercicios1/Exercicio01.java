package exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int SOMA = v1 + v2;

        System.out.println("SOMA = " + SOMA);
    }
}
