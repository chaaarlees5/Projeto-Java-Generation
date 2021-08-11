package classes;

import java.util.Scanner;

public class Cadastro {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private String receita;
	
	int opcao;
	Scanner input = new Scanner(System.in);
	
	public Cadastro(String nome, String endereco, 
			String telefone, String email, String receita) {	
		
		super();
		
	}
	
	public Cadastro(String nome, String endereco, 
			String telefone, String email) {
		
			}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReceita() {
		return receita;
	}

	public void setReceita(String receita) {
		this.receita = receita;
	}
	
	public String menuEstoque() {
		return "\n\t\t::: Menu do estoque :::"
			+ "\n---------------------------------------"
			+ "\n(1) Adicionar produtos ao estoque"
				+ "\n(2) Remover produtos do estoque"
				+ "\n(3) Mostrar todos os produtos do estoque"
				+ "\n(0) Encerrar"
			+"\n---------------------------------------"
			+"\nDigite a opção desejada: ";
	}
	
	public int fisicaJuridica() {
		System.out.print("\n(1) Pessoa Física \n(2) Pessoa Jurídica. \nDigite uma das opções acima: ");
		opcao = input.nextInt();
		return opcao;
	}
	
	
}