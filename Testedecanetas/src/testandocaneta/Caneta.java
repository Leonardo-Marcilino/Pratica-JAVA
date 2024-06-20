package testandocaneta;

public class Caneta {
//	Atributo
	String modelo;
	String cor;
	Float ponta;
	int carga;
	boolean tampada;

// somente o void quando n�o tem retorno

// M�todos
	void rabiscar() {
// This significa que o atributo ser� instanciado em outra classe, por�m est� sendo referenciado na mesma classe
		if (this.tampada == true) {
			System.out.println("ERRO!! A caneta est� tampada!!");
		} else {
			System.out.println("Pode rabiscar � vontade!!");
		}
	}

	void tampar() {
		this.tampada = true;
	}

	void destampar() {
		this.tampada = false;
	}

	void estadoAtual() {
		System.out.println("Est� caneta � do modelo " + this.modelo);
		System.out.println("Est� caneta tem a cor: " + this.cor);
		System.out.println("Est� caneta tem a ponta " + this.ponta);
		System.out.println("Est� caneta est� com a carga em: " + this.carga + "%");
		if (this.tampada = true) {
			System.out.println("Est� caneta est� tampada!!");
		} else {
			System.out.println(" A caneta est� destampada!!");
		}
	}

	void pintar() {
		if (this.carga > 0 && this.tampada == false) {
			System.out.println("Pode pintar a vontade");

		} else if(this.carga <= 0 && this.tampada == true) {
			System.out.println("ERRO!! a carga da caneta � zero e est� tampada");
		} else {
			if(this.carga <= 0) {
				System.out.println("ERRO!! a carga da caneta � zero");
			} else if(this.tampada == true) {
				System.out.println("ERRO!! a caneta est� tampada");
			}
		}
	}

}
