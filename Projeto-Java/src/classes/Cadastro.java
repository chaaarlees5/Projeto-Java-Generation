package classes;

import java.util.Scanner;

public class Cadastro {
	
	private String nome;
	private String cpf;
	private String cnpj;
	private String endereco;
	private String telefone;
	private String email;
	private String receita;
	
	Scanner input = new Scanner(System.in);
	
	public Cadastro(String nome, String cpf, String endereco, 
			String telefone, String email, String receita) 
	{	
		System.out.println("\t\tDados do Paciente");
		
		System.out.print("Nome: ");
		this.setNome(input.next());
		System.out.print("CPF: ");
		this.setCpf(input.next());
		System.out.print("Endereço: ");
		this.setEndereco(input.next());
		System.out.print("Telefone: ");
		this.setTelefone(input.next());
		System.out.print("Email: ");
		this.setEmail(input.next());
		System.out.print("Código da receita: ");
		this.setReceita(input.next());
	}
	
	public Cadastro(String nome, String cnpj, String endereco, 
			String telefone, String email) 
	{
		System.out.println("\t\tDados da Empresa");

		System.out.print("Nome: ");
		this.setNome(input.next());
		System.out.print("CNPJ: ");
		this.setCnpj(input.next());
		System.out.print("Endereço: ");
		this.setEndereco(input.next());
		System.out.print("Telefone: ");
		this.setTelefone(input.next());
		System.out.print("Email: ");
		this.setEmail(input.next());
		System.out.print("Código da receita: ");
		this.setReceita(input.next());
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
	
	public void imprimirInfoCPF()
	{
		System.out.println("\t\t**PESSOA FÍSICA**");
		System.out.println("\nNome: "+getNome()+"\n CPF: "+getCpf()+"\n Endereço: "+getEndereco()+"\n Telefone: "+getTelefone()+"\n Email: "+getEmail());
	}
	
	public void imprimirInfoCNPJ()
	{
		System.out.println("\t\t**PESSOA JURÍDICA**");
		System.out.println("\nNome: "+getNome()+"\n CNPJ: "+getCnpj()+"\n Endereço: "+getEndereco()+"\n Telefone: "+getTelefone()+"\n Email: "+getEmail());
	}
}
	
