package testandocaneta;

public class TesteCaneta {

	public static void main(String[] args) {
		Caneta caneta1 = new Caneta();
		
		caneta1.modelo = "esferográfica";
		caneta1.cor = "preta";
		caneta1.ponta = 0.3f;
		caneta1.carga = 50;
//		caneta1.tampada = false;
		
		caneta1.destampar();
		caneta1.rabiscar();
		caneta1.estadoAtual();
		
		System.out.println("-----------------------------------");
		
		Caneta caneta2 = new Caneta();
		
		caneta2.modelo = "hidrorográfica";
		caneta2.cor = "azul";
		caneta2.ponta = 0.7f;
		caneta2.carga = 10;
		
		caneta2.destampar();
		caneta2.pintar();
		caneta2.estadoAtual();	
		
		System.out.println("-----------------------------------");

		Caneta caneta3 = new Caneta();
		
		caneta3.modelo = "hidrorográfica";
		caneta3.cor = "rosa";
		caneta3.ponta = 0.2f;
		caneta3.carga = 0;
		
		caneta3.tampar();
		caneta3.pintar();
		
		System.out.println("\nEstado da Caneta: ");
		caneta3.estadoAtual();
	}
}
