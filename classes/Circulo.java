package oo;

public class Circulo {
	int r;
	int centroX, centroY;
	
	public Circulo(int centroX,int centroY,int r) {
		this.centroX=centroX;
		this.centroY=centroY;
		this.r=r;
	}
	double area() {
		return Math.PI * r *r;
	}
}
