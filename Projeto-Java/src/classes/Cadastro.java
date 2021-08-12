package classes;

import java.util.Scanner;
import java.util.Random;

public class Cadastro {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private String receita;
	int opcao;
	int doaEmpresta;
	
	Scanner input = new Scanner(System.in);
	Random sorteia = new Random();

	public Cadastro(String nome, String endereco, 
			String telefone, String email, String receita) {	
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
	
	public int doaEmpresta() {
   		System.out.println("\t\t\t::: ONG AmparA��o :::\n"
   				+ "::: EMPR�STIMO DE EQUIPAMENTOS PARA PESSOAS COM DIFICULDADE DE LOCOMO��O :::\n");
   		System.out.print("(1) Doa��o \n(2) Empr�stimo \nDigite a op��o desejada: ");
		return input.nextInt();
   	}
	
	public int fisicaJuridica() {
		System.out.print("\n(1) Pessoa F�sica \n(2) Pessoa Jur�dica \nDigite uma das op��es acima: ");
		opcao = input.nextInt();
		return opcao;
	}
	
	public int getRandom() {
    	int min = 100000000;
    	int max = 999999999;
    	int numero = sorteia.nextInt((max-min) + 1) + min;
    	return numero;
	}
	
	public void imprimirInfo(int opPessoa, int doacao, String cpf, String cnpj) {
		if(opPessoa == 1 && doacao == 1) {
			System.out.println("\t\t\n ::: Carteirinha de Doador :::");
	        System.out.println("\nID Doador: " + getRandom());
	        System.out.println("\nNome: "+getNome()+"\tTelefone: "+getTelefone());
		} else if(opPessoa == 1 && doacao == 2){
			System.out.println("\t\t\n ::: Contrato de Empr�stimo de Equipamentos :::");
	        System.out.println("\nN�mero do Contrato: " + getRandom());
	        System.out.println("\nNome: "+getNome()+"\nCPF: "+cpf+"\nEndere�o: "+getEndereco()
	        +"\nTelefone: "+getTelefone()+"\nEmail: "+getEmail());
		} else if(opPessoa == 2 && doacao == 1){
			System.out.println("\t\t\n ::: AGRADECIMENTOS :::");
	        System.out.println("\nMuito obrigado " + getNome() + "!!!\nAgradecemos a sua doa��o!!");
		} else {
			System.out.println("\t\t\n ::: Contrato de Empr�stimo de Equipamentos :::");
	        System.out.println("\nN�mero do Contrato: " + getRandom());
	        System.out.println("\nNome: "+getNome()+"\nCNPJ: "+cnpj+"\nEndere�o: "+getEndereco()
	        +"\nTelefone: "+getTelefone()+"\nEmail: "+getEmail());
		}
	}
}