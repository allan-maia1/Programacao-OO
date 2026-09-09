package revisao;

import java.util.Scanner;

public class ReceberParesVetor {

	public static void main(String[] args) {
		
		int num,cont=0,somaPar=0;
		int vetPar[]= new int[10];
		//double vetImpar[]=new double[];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite um numero");
		num=sc.nextInt();
		if(num%2==0) {
			for(int i=0;i<=vetPar.length;i++) {
				vetPar[i]=num;
				cont+=1;
				
			}
		}else if(cont==10) {
			for(int i=0;i<=vetPar.length;i++) {
				somaPar+=i;
			}
		}
	System.out.println("Soma dos pares: "+somaPar);
	sc.close();
	}

}
