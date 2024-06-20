package testandobanco;

import java.util.*; // Trazendo TODAS as classes da biblioteca util do JAVA

public class Conta {
	int numeroConta;
	String titularConta;
	double saldo;

	Scanner entrada = new Scanner(System.in);

	// Metodo construtor
	public Conta(String nomeTitular, double saldoInicial) {
		this.titularConta = nomeTitular;
		this.saldo = saldoInicial;

		Random geradorNumero = new Random(); // Gerador randomico de n�meros

		numeroConta = geradorNumero.nextInt(1000); // Estou dizendo que vai gerar n�meros ale�torios de 1 at� 1000
	}

	void verContaCompleta() {
		System.out.println("O n�mero da conta �: " + numeroConta);
		System.out.println("O nome do titular �: " + titularConta);
		System.out.println("O saldo da conta �: " + saldo);
	}

	void saque(double valorSaque) {
		if (saldo >= valorSaque) {
			saldo = saldo - valorSaque;
			System.out.println("Saque no valor de R$" + valorSaque + " Realizado com sucesso");
			System.out.println("Saldo atual de R$" + saldo);
		} else {
			System.out.println("Saldo insuficiente para o saque");
			System.out.println("Saldo atual de R$" + saldo);
		}
	}

	void deposito(double valorDeposito) {
		if (valorDeposito > 0) {
			saldo = saldo + valorDeposito;
		} else {
			System.out.println("O valor de dep�sito deve ser maior que zero");
		}
	}

	void exibirMenu() {
		System.out.println("Bem vindo ao Banco do l�l�o");
		System.out.println("Escolhas sua op��o");
		System.out.println("1 - Ver Conta");
		System.out.println("2 - Sacar");
		System.out.println("3 - Depositar");
		System.out.println("4 - Finalizar");
	}

	void iniciar() {
		int opcao;
		do {
			exibirMenu();
			opcao = entrada.nextInt();
			escolherFuncao(opcao);
		} while (opcao != 4);
	}

	void escolherFuncao(int opcao) {
		double saque;
		double deposito;
		
		switch(opcao) {
			case 1:
				verContaCompleta();
				break;
			case 2:
				System.out.println("Digite o valor a ser sacado: ");
				saque = entrada.nextDouble();
				saque(saque);
				break;
			case 3:
				System.out.println("Digite o valor a ser depositado: ");
				deposito = entrada.nextDouble();
				deposito(deposito);
				break;
			case 4:
				System.out.println("Opera��o finalzada!");
				break;
				
			default:
				System.out.println("Op��o inv�lida");
		}
	}
}
