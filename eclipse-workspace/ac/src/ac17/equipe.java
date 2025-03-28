package ac17;
import java.util.ArrayList;
public class equipe {
	private String nomeEquipe;
	private String cor;
	private ArrayList<jogador> jogadores;
	
	public equipe(String nomeEquipe, String cor) {
		this.nomeEquipe = nomeEquipe;
		this.cor = cor;
		this.jogadores = new ArrayList<jogador>()
;	}
	public String getNomeEquipe() {
		return nomeEquipe;
	}
	public void setNomeEquipe(String nomeEquipe) {
		this.nomeEquipe = nomeEquipe;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public ArrayList<jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<jogador> jogadores) {
		this.jogadores = jogadores;
	}
	public void addJogador(jogador jogador) {
		jogadores.add(jogador);
		jogador.addEquipe(this);
	}
}