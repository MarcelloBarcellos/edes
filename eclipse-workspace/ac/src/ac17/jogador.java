package ac17;
import java.util.ArrayList;
public class jogador {
	private String nome;
	private int idade;
	private ArrayList<equipe>equipe;
	
	public jogador(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.equipe = new ArrayList<equipe>();
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
	public ArrayList<equipe> getEquipe() {
		return equipe;
	}
	public void setEquipe(ArrayList<equipe> equipe) {
		this.equipe = equipe;
	}
	public void addEquipe(equipe equipe) {
		equipe.add(equipe);
	}
}