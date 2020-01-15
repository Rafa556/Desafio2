package Veiculo;

public abstract class veiculo {

	private String modelo;
	private int velocidade;
	private int passageiros;
	private float combustivel;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public float getCombuctivel() {
		return combustivel;
	}

	public void setCombuctivel(int combuctivel) {
		this.combustivel = combuctivel;
	}

	public veiculo(String mod, int vel, int pass, float comb) {
		super();
		this.modelo = mod;
		this.velocidade = vel;
		this.passageiros = pass;
		this.combustivel = comb;
	}

	public veiculo(String mod, int vel, int pass, float comb, String tipo, String uso) {
		// TODO Auto-generated constructor stub
	}

	public void status() {
		 
		System.out.println("\nmodelo: " + this.getModelo() +
				"\nvelocidade: " + this.getVelocidade() + 
				"\n passageiros: " + this.getPassageiros()+ 
				"\ncombustivel: " + this.getCombuctivel());
	
	}

}
