package revisao;

import java.util.Scanner;

public class RevSeg {

	public static void main(String[] args) {
		
		String name;
		int hr,min,seg,total_dia;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
			name=sc.nextLine();
		System.out.println("Informe a(s) hora(s): ");
			hr=sc.nextInt();
		System.out.println("Informe o(s) minuto(s): ");
			min=sc.nextInt();
		System.out.println("Informe o(s) segundo(s): ");
			seg=sc.nextInt();
			
		total_dia=(hr*3600)+(min*60)+seg;
		
		System.out.println(name +" se passaram "+ total_dia +" segundos do dia");
		
		sc.close();
	}

}
