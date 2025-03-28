package ac11;

import java.util.Scanner;

public class media {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total;
		double soma = 0;
		double media;
		
		System.out.print("inserir o total de avaliações");
		total = sc.nextInt();
		
		double[] notas = new double[total];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("inserir nota" + (i+1) + ":");
			notas[i] = sc.nextDouble();
			soma = soma + notas[i];
		}
		
		media = soma/notas.length;
		
		for(int i = 0; i<notas.length;i++) {
			System.out.println("nota" + (i+1)+":" + notas[i]);
		}
		System.out.printf("media final: %.2f",media);
	}
}
