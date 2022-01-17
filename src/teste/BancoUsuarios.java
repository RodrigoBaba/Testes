package teste;

import java.util.HashMap;
import java.util.Map;

public class BancoUsuarios {

	Map<String, Usuario> bancoUsuarios;

	public BancoUsuarios() {
		super();
		this.bancoUsuarios = new HashMap<>();
	}
	
	public Usuario getLogin(String login) {
		return bancoUsuarios.get(login);
	}
	
	public void cadastrar(Usuario usuario) {
		bancoUsuarios.put(usuario.getLogin(), usuario);
	}
	
}
