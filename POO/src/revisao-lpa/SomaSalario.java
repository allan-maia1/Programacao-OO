package revisao;

import java.util.Scanner;

public class SomaSalario {

	public static void main(String[] args) {
		double salario, total=0;
		int cont=0;
		
		Scanner sc=new Scanner(System.in);
		
		while(cont<10) {
		System.out.println("Informe o salario: ");
		salario=sc.nextDouble();
		total+=salario;
		cont+=1;
		}
		System.out.println("Total: R$ "+total);
		sc.close();
	}

}
