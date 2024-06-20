package JavaCondicionais;

import java.util.Scanner;

public class SomaSequencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int numero;

        System.out.println("Digite uma sequ�ncia de n�meros (digite um n�mero negativo para sair):");

        while (true) {
            System.out.print("N�mero: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                break; // Sai do loop se o n�mero digitado for negativo
            }

            soma += numero; // Soma o n�mero digitado ao total acumulado
        }

        System.out.println("A soma dos n�meros digitados �: " + soma);

        scanner.close();
    }
}
