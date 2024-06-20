package JavaCondicionais;

import java.util.Scanner;

public class SomaSequencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int numero;

        System.out.println("Digite uma sequência de números (digite um número negativo para sair):");

        while (true) {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                break; // Sai do loop se o número digitado for negativo
            }

            soma += numero; // Soma o número digitado ao total acumulado
        }

        System.out.println("A soma dos números digitados é: " + soma);

        scanner.close();
    }
}
