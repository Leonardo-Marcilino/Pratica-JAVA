package testandocaneta;

public class Caneta {
//	Atributo
	String modelo;
	String cor;
	Float ponta;
	int carga;
	boolean tampada;

// somente o void quando não tem retorno

// Métodos
	void rabiscar() {
// This significa que o atributo será instanciado em outra classe, porém está sendo referenciado na mesma classe
		if (this.tampada == true) {
			System.out.println("ERRO!! A caneta está tampada!!");
		} else {
			System.out.println("Pode rabiscar à vontade!!");
		}
	}

	void tampar() {
		this.tampada = true;
	}

	void destampar() {
		this.tampada = false;
	}

	void estadoAtual() {
		System.out.println("Está caneta é do modelo " + this.modelo);
		System.out.println("Está caneta tem a cor: " + this.cor);
		System.out.println("Está caneta tem a ponta " + this.ponta);
		System.out.println("Está caneta está com a carga em: " + this.carga + "%");
		if (this.tampada = true) {
			System.out.println("Está caneta está tampada!!");
		} else {
			System.out.println(" A caneta está destampada!!");
		}
	}

	void pintar() {
		if (this.carga > 0 && this.tampada == false) {
			System.out.println("Pode pintar a vontade");

		} else if(this.carga <= 0 && this.tampada == true) {
			System.out.println("ERRO!! a carga da caneta é zero e está tampada");
		} else {
			if(this.carga <= 0) {
				System.out.println("ERRO!! a carga da caneta é zero");
			} else if(this.tampada == true) {
				System.out.println("ERRO!! a caneta está tampada");
			}
		}
	}

}
