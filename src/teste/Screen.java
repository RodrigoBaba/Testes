package teste;

import java.util.Scanner;

public class Screen {

	public void telaInicio(Scanner read, BancoUsuarios usuario) {
		System.out.println("Bem vindo ao Curriculo\n");
		
		System.out.println("1. Login\n2. Cadastre-se\n3. Sair");
		int escolha = read.nextInt();
		
		while(escolha == 1 || escolha == 2) {
			switch(escolha) {
			case 1:
				System.out.println("Entrando no login ...");
				login(read, usuario);
				break;
			case 2:
				System.out.println("Faça seu cadastro:");
				cadastrar(read, usuario);
		 		break;
			}
			System.out.println("\n1. Login\n2. Cadastre-se\n3. Sair");
			escolha = read.nextInt();

		}
		System.out.println("\nSaindo do sistema ...");
	}
	
	public void cadastrar(Scanner read, BancoUsuarios banco) {
		System.out.println("Cadastre-se:");
		System.out.print("Digite seu nome: ");
		read.nextLine();
		String nome = read.nextLine();
		System.out.print("Digite um login: ");
		String login = read.nextLine();
		System.out.print("Digite senha: ");
		String senha = read.nextLine();
		System.out.print("Confirme senha: ");
		String confirmarSenha = read.nextLine();
		
		while(!senha.equals(confirmarSenha)) {
			if(confirmarSenha != senha) {
				System.out.println("\nConfirmação Inválida!\nTente novamente.");
				System.out.println();
				System.out.print("Digite senha: ");
				senha = read.nextLine();
				System.out.print("Confirme senha: ");
				confirmarSenha = read.nextLine();
			}
		}
		
		banco.cadastrar(new Usuario(nome, login, senha, new Curriculo("ola", 0, "ola")));
	}	
	
	
	public void login(Scanner read, BancoUsuarios banco) {
		System.out.print("Login: ");
		read.nextLine();
		String login = read.nextLine();
		
		if(!banco.bancoUsuarios.containsKey(login)) {
			System.out.println("Login não existente!\nCadastre-se!");
		}
		else {
			System.out.print("Senha: ");
			String senha = read.nextLine();
			
			if(!banco.bancoUsuarios.get(login).getSenha().equals(senha)) {
				System.out.println("Senha incorreta!\n Tenta novamente.");
				System.out.print("Senha: ");
				senha = read.nextLine();			
				}
			else {
				System.out.println("Entrando no sistema ...");
				menu(read, banco, login);
			}
		}
	}
	
	public void menu(Scanner read, BancoUsuarios banco, String login) {
		System.out.println("Bem vindo " + banco.bancoUsuarios.get(login).getNome() + "!!!");
		if(banco.bancoUsuarios.get(login).curriculo.equals(new Curriculo("ola", 0, "ola"))) {
			System.out.println("Crie seu curriculo através da nossa ferramenta.\nÉ super facil de se usar."
					+ "\nDeseja usar nossa ferramenta?(s/n)");
			char escolha = read.nextLine().charAt(0);
			if(escolha == 's' || escolha == 'S') {
				System.out.print("Nome: ");
				String nome = read.nextLine();
				System.out.print("Idade: ");
				int idade = read.nextInt();
				System.out.print("Conteúdo: ");
				String conteudo = read.nextLine();
				
				banco.bancoUsuarios.get(login).setCurriculo(new Curriculo(nome, idade, conteudo));
			}			
		}
		
		System.out.println("\n" + banco.bancoUsuarios.get(login).getCurriculo());
		
		System.out.println("\n1 - Postar\n2 - Buscar\n3 - Alterar currículo");
		int escolha2 = read.nextInt();
	}
}


	


