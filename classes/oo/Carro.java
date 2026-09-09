package oo;

public class Carro {
	//Atibutos de Instancia - Cada carro vai ter o seu
	private String modelo;
	private String placa;
	
	//Atibuto estatico - Compartilhado por todos os carros
	private static int contadorCarros = 0;
	
	
	//Construtor
	public Carro(String modelo, String placa){
		this.modelo=modelo;
		this.placa=placa;
		
		
	//Sempre que um noov objeto é criado, incrementamos o contador
		contadorCarros++;
	}
	public void exibirDados() {
		System.out.println("Modelo: " + this.modelo + " | Placa: " + this.placa);
	}
	public static int getTotalCarros() {
		return contadorCarros;
	}
}


