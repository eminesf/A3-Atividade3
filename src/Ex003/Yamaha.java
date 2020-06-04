package Ex003;

public class Yamaha extends Veiculo {
	
	public Yamaha(Integer lugares) {
		super(lugares);
	}
	
	@Override
	public void acelerar() {
		this.velocidade = this.velocidade + 15;
	}

	@Override
	public void frear() {
		this.velocidade = this.velocidade - 20;
	}

}