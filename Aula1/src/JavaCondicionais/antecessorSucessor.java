package JavaCondicionais;

import java.util.Scanner;

public class antecessorSucessor {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Insira um n�mero: ");
        int n = valor.nextInt();

        int antecessor = n - 1;
        int sucessor = n + 1;

        System.out.printf("Antecessor � " + antecessor + "<" + n + "> o sucessor o � " + sucessor);

        valor.close();
    }
}

