package oo;

public class CarroMain {
		public static void main(String[] args) {
			System.out.println("Total de carros no inicio: " + Carro.getTotalCarros());
			
			Carro c1 = new Carro("Sedan", "ABC-1234");
			Carro c2 = new Carro("SUV", "XYZ-5678");
			Carro c3 = new Carro("Hatch", "KJH-9012");
			
			c1.exibirDados();
			c2.exibirDados();
			c3.exibirDados();
			
			System.out.println("Total de carros criados: " + Carro.getTotalCarros());
		}
	}

