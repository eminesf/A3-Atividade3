package Ex003;

public abstract class Veiculo {
	
	protected Double velocidade = 0.0;
	private Integer lugares;
	private Integer passageiros;

	public Veiculo(Integer lugares) {
		this.lugares = lugares;
	}

	public Double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Double velocidade) throws VelocidadeException {
		if(velocidade > 60) {
			throw new VelocidadeException("Velocidade MUITO ALTA!!!");
		}
		this.velocidade = velocidade;
	}

	public Integer getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(Integer passageiros) throws PassageirosException {
		if(passageiros > this.lugares)
			throw new PassageirosException("Numero de passageiros excedidos");
		this.passageiros = passageiros;
	}

	public abstract void acelerar();
	
	public abstract void frear();

}
