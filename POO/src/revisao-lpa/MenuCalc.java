package revisao;

import java.util.Scanner;

public class MenuCalc {

	public static void main(String[] args) {
		
		int num1, num2,opc,res;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		num1=sc.nextInt();
		System.out.println("Informe o segundo numero: ");
		num2=sc.nextInt();
		
		System.out.println("------ MENU ------"
				+ "\n 1- Soma"
				+ "\n 2- Subtração"
				+ "\n 3- Multiplicação"
				+ "\n 4- Divisão"
				+ "\n 5- Trocar Valores"
				+ "\n 6- Sair");
		System.out.println("Escolha uma opção: ");
		opc=sc.nextInt();
		while(opc!=6) {
		switch (opc){
			case 1:
				res=soma(num1,num2);
				System.out.println("Soma: "+res);
				break;
			case 2:
				res=sub(num1,num2);
				System.out.println("Subtração: "+res);
				break;
			case 3:
				res=mul(num1,num2);
				System.out.println("Multiplicação: "+res);
				break;
			case 4:
				res=div(num1,num2);
				System.out.println("Divisão: "+res);
				break;
			case 5:
				System.out.println("Troque o valor 1: ");
				num1=sc.nextInt();
				System.out.println("Troque o valor 2: ");
				num2=sc.nextInt();
				break;
			case 6:
				System.out.println("Saiu!");
				break;
			default:
				System.out.println("Opção inválida!");
		}
		System.out.println("Escolha uma opção: ");
		opc=sc.nextInt();
		}
		sc.close();
	}
	public static int soma(int x, int y) {
		return x+y;
	}
	public static int sub(int x, int y) {
		return x-y;
	}
	public static int mul(int x,int y) {
		return x*y;
	}
	public static int div(int x,int y) {
		return x/y;
	}

}
