package JavaCondicionais;

import java.util.Scanner;

public class valorDecrecente {
	
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Insira o 1� n�mero: ");
        int n1 = valor.nextInt();

        System.out.print("Insira o 2� n�mero: ");
        int n2 = valor.nextInt();

        System.out.print("Insira o 3� n�mero: ");
        int n3 = valor.nextInt();

        System.out.printf("n1:" + n1);
        System.out.printf("n2:" + n2);
        System.out.printf("n3:" + n3);

        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                System.out.printf("A ordem decrescente �: " + n1 + n2 + n3);
            } else {
                System.out.printf("A ordem decrescente �: " + n1 + n3 + n2);
            }
        } else if (n2 > n3) {
            if (n1 > n3) {
                System.out.printf("A ordem decrescente �: " + n2 + n1 + n3);
            } else {
                System.out.printf("A ordem decrescente �: " + n2 + n3 + n1);
            }
        } else {
            if (n1 > n2) {
                System.out.printf("A ordem decrescente �: " + n3 + n1 + n2);
            } else {
                System.out.printf("A ordem decrescente �: " + n3 + n2 + n1);
            }
        }

        valor.close();
    }
}
