package oo;

public class ContadorMain {

	public static void main(String[] args) {
		Contador obj[] = new Contador[9];
		
		for(int i=0; i<obj.length;i++) {
			obj[i]= new Contador();
		}
//		Contador ob1= new Contador();
//		Contador ob2= new Contador();
//		Contador ob3= new Contador();
//		Contador ob4= new Contador();
//		Contador ob5= new Contador();
		
		
		System.out.println("Objetos Criados: "+Contador.count);
	}

}

