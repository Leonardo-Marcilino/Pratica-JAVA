package JavaCondicionais;

import java.util.Scanner;

public class valorSalario {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Insira o sal�rio m�nimo: ");
        double salarioMinimo = valor.nextDouble();

        System.out.print("Insira seu sal�rio: ");
        double salario = valor.nextDouble();

        double soma = 0;
        int qtd = 0;

        while (soma < salario) {
            soma += salarioMinimo;
            qtd += 1;
        }

        System.out.printf("A quantidade de sal�rios m�nimos que voc� ganha � de " + qtd);

        valor.close();
    }
}
