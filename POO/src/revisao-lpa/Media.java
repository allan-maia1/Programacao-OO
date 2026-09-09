package revisao;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		int cont;
		double nota, med;
		
		Scanner sc= new Scanner(System.in);
		
		nota=0;
		cont=1;
		
		while(cont<5) {
			System.out.println("Informe a Nota "+cont);
			nota+=sc.nextDouble();
			cont+=1;
		}
		med=(nota/4);
		System.out.println("Sua média é: "+med);
		if(med>=7) {
			System.out.println("Aprovado!");
		}else {
			System.out.println("Reprovado!");
		}
		sc.close();
	}

}
