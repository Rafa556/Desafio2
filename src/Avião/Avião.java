package Avião;

import Veiculo.veiculo;

public class Avião extends veiculo {

	private String tipo;
	private String uso;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	public Avião(String mod, int vel, int pass, float comb, String tipo, String uso) {
		super(mod, vel, pass, comb);
		this.tipo = tipo;
		this.uso = uso;
	}
    
	public void status() {
		super.status();
		System.out.println("Tipo: " + this.getTipo() + 
				"\nUso: " + this.getUso());
	}
   

}
