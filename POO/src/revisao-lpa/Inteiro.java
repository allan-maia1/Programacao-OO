package revisao;

import java.util.Scanner;

public class Inteiro {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Informe o numero: ");
		n=sc.nextInt();
		if(n>=0) {
			for(int i=n;i>=0; i+=-2) {
				System.out.println(i);
				if(i==1) {
					System.out.println(i-=1);
				}
			}
		}else {
			for(int i=n;i<=0; i+=2) {
				System.out.println(i);
				if(i==-1) {
					System.out.println(i+=1);
				}
			}
		}
	sc.close();
	}

}
