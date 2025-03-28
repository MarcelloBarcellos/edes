package ac17;
import java.util.ArrayList;
public class equipe {
	private String nome;
	private String cor;
	private ArrayList<jogador>jogador;
	
	public equipe(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
		this.jogador = new ArrayList<jogador>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public ArrayList<jogador> getJogador() {
		return jogador;
	}
	public void setJogador(ArrayList<jogador> jogador) {
		this.jogador = jogador;
	}
	public void addJogador(jogador jogador) {
		jogador.add(jogador);
		jogador.addEquipe(this);
	}
}