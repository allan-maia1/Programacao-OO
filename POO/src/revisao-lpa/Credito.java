package revisao;

import java.util.Scanner;

public class Credito {

	public static void main(String[] args) {
		
		double saldo_medio,cred;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Informe o saldo medio do cliente: ");
		saldo_medio=sc.nextDouble();
	
		if(saldo_medio==0 && saldo_medio<=200.00) {
			System.out.println("Saldo Medio: "+saldo_medio +"\nCredito: Nenhum crédito");
		}else if(saldo_medio>200 && saldo_medio<=400){
			cred=saldo_medio*0.2;
			System.out.println("Saldo Medio: "+saldo_medio + "\nCredito: R$ "+ cred);
		}else if(saldo_medio>400 && saldo_medio<=600) {
			cred=saldo_medio*0.3;
			System.out.println("Saldo Medio: "+saldo_medio+ "\nCredito: R$ "+ cred);
		}else{
			cred=saldo_medio*0.4;
			System.out.println("Saldo Medio: "+ saldo_medio+ "\nCredito: R$ "+cred);
		}
		sc.close();
	}
}

