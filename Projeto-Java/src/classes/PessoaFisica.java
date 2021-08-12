package classes;

import java.util.Random;

public class PessoaFisica extends Cadastro {
		private String cpf;
		Random sorteia = new Random();

	   	public PessoaFisica(String nome, String endereco, 
	         String telefone, String email, String receita, String cpf) {

	       super(nome, endereco, telefone, email, receita);
	       this.cpf = cpf;
	    }
	   	
	   	public void setInformacoes(int doacao) {
			if(doacao == 2) {
				System.out.println("\n\t\t ::: Dados do Paciente ::: ");
			} else {
				System.out.println("\n\t\t ::: Dados do Doador ::: ");
			}
			
			System.out.print("\nNome: ");
			setNome(input.nextLine());
			
			do {
				System.out.print("CPF: ");
				setCpf(input.nextLine());
			} while(validaCPF() == false);
			
			System.out.print("Endereço: ");
			setEndereco(input.nextLine());
			
			System.out.print("Telefone: ");
			setTelefone(input.nextLine());
			
			System.out.print("Email: ");
			setEmail(input.nextLine());
			
			if(doacao == 2) {
				System.out.print("Código da receita: ");
				setReceita(input.nextLine());
			}
	   	}
	   
	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }
	    
	    public boolean validaCPF() {
	    	if((this.getCpf().length()!=11))
	    			System.err.println("Erro. Digite um CPF válido.");	    		
	    	return (this.getCpf().length() == 11);
	    }
	    
	    public void imprimirInfoEmp() {
	        System.out.println("\t\t\n ::: Contrato de Empréstimo de Equipamentos :::");
	        System.out.println("\nNúmero do Contrato: " + getRandom());
	        System.out.println("\nNome: "+getNome()+"\nCPF: "+getCpf()+"\nEndereço: "+getEndereco()
	        +"\nTelefone: "+getTelefone()+"\nEmail: "+getEmail());
	    }
	    
	    public void imprimirInfoDoacao() {
	        System.out.println("\t\t\n ::: Carteirinha de Doador :::");
	        System.out.println("\nID Doador: " + getRandom());
	        System.out.println("\nNome: "+getNome()+"\tTelefone: "+getTelefone());
	    }
	}