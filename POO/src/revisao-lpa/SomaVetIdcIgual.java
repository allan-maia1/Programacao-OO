package revisao;

import java.util.Scanner;

public class SomaVetIdcIgual {

	public static void main(String[] args) {
		int vet1[]= new int[10],
			vet2[]=new int[10],
			vetRes[]=new int[10],
			matriz[][]= new int[3][3];
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Preencha o vetor 1: ");	//Preencho vetor
		for(int i=0;i<vet1.length;i++) {
			vet1[i]=sc.nextInt();
			System.out.println( "---");
		}															
		System.out.println("Preencha o vetor 2: ");   //Preencho vetor
		for(int i=0;i<vet2.length;i++) {
			vet2[i]=sc.nextInt();
			System.out.println("---");				//-------
		}
		printVetor(vet1);															
		printVetor(vet2);
		
		System.out.print("\nVetor Soma: ");	//Somo os dois vetores e printo
		for (int i=0;i<vetRes.length;i++) {
			vetRes[i]=vet1[i]+vet2[i];								
			System.out.print(vetRes[i]+ " ");
		}											//-------
		
		System.out.println("\nPreencha a matriz: "); //Preencho a matriz
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz.length;j++) {
				matriz[i][j]=sc.nextInt();
			}
		}
		elementosDiag(matriz);
		sc.close();
	}
	
	
	public static void elementosDiag(int[][] matriz) {	//Modulo dos elementos da diagonal
		
		for (int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print(matriz[i][j]+ " ");
				}
			System.out.println();
			}
		System.out.println("Diagonal: ");
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz.length;j++) {
				if(i==j){
					System.out.print(matriz[i][j]+" ");
				}
			}
		}
	}
	public static void printVetor(int[] vetor) {
		System.out.print("Vetor : ");	
		for(int i=0;i<vetor.length;i++) {
			System.out.print(vetor[i]+" ");	
		}
		System.out.println();
	}
	
}
