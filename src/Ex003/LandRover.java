package Ex003;

public class LandRover extends Veiculo {
	

	public LandRover(Integer lugares) {
		super(lugares);
	}

	@Override
	public void acelerar() {
		this.velocidade = this.velocidade + 10;
	}

	@Override
	public void frear() {
		this.velocidade = this.velocidade - 5;
	}

}
