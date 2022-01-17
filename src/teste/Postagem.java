package teste;

public class Postagem {
	
	String tema;
	String titulo;
	String conteudo;
	
	public Postagem(String tema, String titulo, String conteudo) {
		super();
		this.tema = tema;
		this.titulo = titulo;
		this.conteudo = conteudo;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	
}
