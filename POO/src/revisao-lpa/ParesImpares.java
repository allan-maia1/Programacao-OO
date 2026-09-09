package revisao;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		int num, contPar=0,somaPar=0,somaImpar=0;
		double medImpar=0,contImpar=0;
		
		Scanner sc=new Scanner(System.in);
		
		while(contPar<10) {
		System.out.println("Digite um numero: ");
		num=sc.nextInt();
			if(num%2==0) {
				somaPar+=num;
				contPar+=1;
			}else {
				somaImpar+=num;
				contImpar+=1;
			
			}
		}medImpar=somaImpar/contImpar;
		System.out.println("Soma dos Pares: "+ somaPar + "\nMedia dos Impares: "+ medImpar);
		sc.close();
	}

}
