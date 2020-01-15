package Carros;

import Veiculo.veiculo;

public class Carro extends veiculo {

	private String marca;
	private int portas;
	private int ano;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Carro(String mod, int vel, int pass, float comb, String marca, int portas, int ano) {
		super(mod, vel, pass, comb);
		this.marca = marca;
		this.portas = portas;
		this.ano = ano;
	}
	
	public void status() {
		super.status();
		System.out.println("marca: " + this.getMarca()+ 
				"\nportas: "+ this.getPortas() + 
				"\nano: " + this.getAno());
	}
	

}
