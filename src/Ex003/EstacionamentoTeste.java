package Ex003;

public class EstacionamentoTeste {

	public static void main(String[] args) {
		Manobrista joao = new Manobrista("João");

		LandRover landRover1 = new LandRover(5);
		
		joao.setVeiculoSendoManobrado(landRover1);
		
		joao.manobrar();
		
		Veiculo landRover2 = new LandRover(5);
		
		joao.setVeiculoSendoManobrado(landRover2);
		
		joao.manobrar();
		
		Veiculo porsche1 = new Porsche(4);
		// ao setar passageiros acima de 4 ele da o erro e para
		porsche1.setPassageiros(5);
		
		// ao setar a velocidade acima de 60, ele da o erro e para
		porsche1.setVelocidade(61.1);
		
		
		joao.setVeiculoSendoManobrado(porsche1);
		
		joao.manobrar();
		
		
		
		
	}

}
