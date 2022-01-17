package teste;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		BancoUsuarios banco = new BancoUsuarios();
		Screen tela = new Screen();
		
		tela.telaInicio(read, banco);
		
		
		
	}

}
