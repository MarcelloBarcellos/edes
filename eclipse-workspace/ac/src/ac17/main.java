package ac17;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<jogador> jogadores = new ArrayList<jogador>();
		ArrayList<equipe> equipes = new ArrayList<equipe>();
		
		int i = 1,numequipes;
		while(i!=0) {
			jogador j = new jogador();
			System.out.printf("Qual o nome do jogador %d :",i);
			j.setNome(sc.nextLine());
			System.out.printf("Qual a idade do jogador %d :",i);
			j.setIdade(sc.nextInt());
			System.out.printf("Qual o numero de equipes o jogador %d esta contratado :",i);
			numequipes = sc.nextLine();
			sc.nextLine();
			
		}
	}
}
