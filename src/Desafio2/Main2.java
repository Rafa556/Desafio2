package Desafio2;

import Avião.Avião;
import Carros.Carro;

public class Main2 {

	public static void main(String[] args) {
		
		Carro v1 = new Carro("Camaro", 250, 5, 100, "Chevrolet", 2, 2014);
        v1.status();
        System.out.print("-----------");
        Avião v2 = new Avião ("Emirates", 500, 500, 100, "transporte", "pessoal");
        v2.status();

	}
}
