package JavaCondicionais;

import java.util.Scanner;

public class reajusteSalario {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Insira seu sal�rio: ");
        double salario = valor.nextDouble();

        double reajuste = salario * 0.015;
        double novoSalario = salario + reajuste;

        System.out.printf("O seu sal�rio com reajuste de 1.5%% � de " + novoSalario);

        valor.close();
    }
}

