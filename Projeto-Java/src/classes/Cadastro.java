package classes;

import java.util.Scanner;

public class Cadastro {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private String receita;
	
	Scanner input = new Scanner(System.in);
	
	public Cadastro(String nome, String endereco, 
			String telefone, String email, String receita) {	
		
		super();
		System.out.println("\n\t\t ::: Dados do Paciente ::: ");
		
		System.out.print("Nome: ");
		this.setNome(input.nextLine());
		System.out.print("Endere�o: ");
		this.setEndereco(input.nextLine());
		System.out.print("Telefone: ");
		this.setTelefone(input.nextLine());
		System.out.print("Email: ");
		this.setEmail(input.nextLine());
		System.out.print("C�digo da receita: ");
		this.setReceita(input.nextLine());
	}
	
	public Cadastro(String nome, String endereco, 
			String telefone, String email) {
		
		System.out.println("\n\t\t ::: Dados da Empresa ::: ");

		System.out.print("Nome: ");
		this.setNome(input.nextLine());
		System.out.print("Endere�o: ");
		this.setEndereco(input.nextLine());
		System.out.print("Telefone: ");
		this.setTelefone(input.nextLine());
		System.out.print("Email: ");
		this.setEmail(input.nextLine());
		System.out.print("C�digo da receita: ");
		this.setReceita(input.nextLine());
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
	
	public void imprimirInfoCPF() {
		System.out.println("\t\t\n ::: PESSOA F�SICA :::");
		System.out.println("\nNome: "+getNome()+"\nEndere�o: "+getEndereco()
		+"\nTelefone: "+getTelefone()+"\nEmail: "+getEmail());
	}
	
	public void imprimirInfoCNPJ() {
		System.out.println("\t\t\n ::: PESSOA JUR�DICA ::: ");
		System.out.println("\nNome: "+getNome()+"\nEndere�o: "
		+getEndereco()+"\nTelefone: "+getTelefone()+"\nEmail: "+getEmail());
	}
}
