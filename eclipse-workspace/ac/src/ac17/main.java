package ac17;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) { 
    	String nomeEquipe, corEquipe, resp, nomeJogador, resposta;
    	int idade;
        ArrayList<equipe> equipes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);       
        while (true) {
            System.out.print("Deseja criar uma nova equipe? (s/n): ");
            resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n")) break;
            System.out.print("Digite o nome da equipe: ");
            nomeEquipe = scanner.nextLine();
            System.out.print("Digite a cor da equipe: ");
            corEquipe = scanner.nextLine();    
            equipe equipe = new equipe(nomeEquipe, corEquipe);
            equipes.add(equipe);      
            while (true) {
                System.out.print("Deseja adicionar um jogador na equipe? (s/n): ");
                resp = scanner.nextLine();
                if (resp.equals("n")) break;
                System.out.print("Digite o nome do jogador: ");
                nomeJogador = scanner.nextLine();
                System.out.print("Digite a idade do jogador: ");
                idade = scanner.nextInt();
                scanner.nextLine();          
                jogador jogador = new jogador();
                jogador.setNome(nomeJogador);
                jogador.setIdade(idade);
                jogador.setEquipes(new ArrayList<>());                
                equipe.addJogador(jogador);
                System.out.println("Jogador inserido.");
            }
        }
        System.out.println("\nResumo das Equipes:");
        for (equipe equipe : equipes) {
            System.out.println("Equipe: " + equipe.getNomeEquipe() + " | Cor: " + equipe.getCor());
            System.out.println("Jogadores:");
            for (jogador jogador : equipe.getJogadores()) {
                System.out.println("- " + jogador.getNome() + " (" + jogador.getIdade() + " anos)");
            }
        }
    }
}