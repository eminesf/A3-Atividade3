package Ex003;

public class Porsche extends Veiculo {
	
	
	public Porsche(Integer lugares) {
		super(lugares);
	}

	@Override
	public void acelerar() {
		this.velocidade = this.velocidade + 20;
	}

	@Override
	public void frear() {
		this.velocidade = this.velocidade - 10;
	}

}