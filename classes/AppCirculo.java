package oo;

public class AppCirculo {

	public static void main(String[] args) {
		Circulo circ=new Circulo(5,3,10);
		Circulo circ2=new Circulo(7,4,10);
		
		
		System.out.println("Centro centro:" + circ.centroX +", "+ circ.centroY + "\nRaio: "+circ.r
							+ "\nArea do circulo: "+ circ.area()+"cm²");
	
		
		System.out.println("Centro centro:" + circ2.centroX +", "+ circ2.centroY + "\nRaio: "+circ2.r
							+ "\nArea do circulo: "+ circ2.area()+"cm²");
		
	}

}
