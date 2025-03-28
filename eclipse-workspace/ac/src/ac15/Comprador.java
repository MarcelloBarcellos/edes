package ac15;

public class Comprador {
	private String nome;
	private String cpf;
	Ingresso Ingresso;
	
	public Ingresso getIngresso() {
		return Ingresso;
	}
	public void setIngresso(Ingresso ingresso) {
		Ingresso = ingresso;
	}
	public Comprador() {}
	public Comprador(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}