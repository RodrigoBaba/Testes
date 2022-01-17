package teste;

public class Curriculo {
		
	String nome;
	int idade;
	String conteudo;
	
	public Curriculo(String nome, int idade, String conteudo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.conteudo = conteudo;
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

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	@Override
	public String toString() {
		return "Curriculo "
				+ "\nNome: " + nome 
				+ "\nIdade: " + idade 
				+ "\nConteudo: " + conteudo;
	}
}
