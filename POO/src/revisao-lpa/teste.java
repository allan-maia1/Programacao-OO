package revisao;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		int matriz[][]=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Preencha a matriz: ");
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz.length;j++) {
				matriz[i][j]=sc.nextInt();	
			}
		}
		System.out.println("Diagonal: ");
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz.length;j++) {
				System.out.print(matriz[i][j]+ " ");
				if(i==j) {
				System.out.print(matriz[i][j] + " ");
				}
		}System.out.println();
		
		}	
		sc.close();
		
	}
}