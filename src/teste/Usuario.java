package teste;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	String nome;
	String login;
	String senha;
	Curriculo curriculo;
	List<Postagem> postagem;
	
	public Usuario(String nome, String login, String senha, Curriculo curriculo) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.curriculo = curriculo;
		this.postagem = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Curriculo getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(Curriculo curriculo) {
		this.curriculo = curriculo;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

	
	
	
	
}
