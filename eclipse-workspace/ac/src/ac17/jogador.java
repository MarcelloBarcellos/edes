package ac17;
import java.util.ArrayList;
public class jogador {
	private String nome;
	private int idade;
	private ArrayList<equipe> equipes;
	
	public ArrayList<equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(ArrayList<equipe> equipes) {
		this.equipes = equipes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void addEquipe(equipe equipe) { 
		equipes.add(equipe);
	}
}