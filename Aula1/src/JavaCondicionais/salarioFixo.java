package JavaCondicionais;

import java.util.Scanner;

public class salarioFixo {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nomeVendedor = valor.nextLine();

        System.out.print("Insira seu sal�rio fixo: ");
        double salarioFixo = valor.nextDouble();

        System.out.print("Insira o total de vendas realizadas no m�s em dinheiro: ");
        double totalVendas = valor.nextDouble();

        double comissao = 15 / 100.0;
        double salarioComissao = salarioFixo + (totalVendas * comissao);

        System.out.printf("%s, seu sal�rio fixo � %.2f e o sal�rio no final com a comiss�o fica %.2f%n", 
                          nomeVendedor, salarioFixo, salarioComissao);

        valor.close();
    }
}

