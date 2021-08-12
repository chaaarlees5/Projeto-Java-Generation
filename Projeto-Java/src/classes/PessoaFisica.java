package classes;

import java.util.Random;

public class PessoaFisica extends Cadastro {
		private String cpf;
		
		int doaEmpresta;
		
		Random sorteia = new Random();

	   	public PessoaFisica(String nome, String endereco, 
	         String telefone, String email, String receita, String cpf) {

	       super(nome, endereco, telefone, email, receita);
	       this.cpf = cpf;
	    }
	   	
	   	public void setInformacoes() {
			if(doaEmpresta == 2) {
				System.out.println("\n\t\t ::: Dados do Paciente ::: ");
			} else {
				System.out.println("\n\t\t ::: Dados do Doador ::: ");
			}
			System.out.print("Nome: ");
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
			if(doaEmpresta == 2) {
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
	    			//|| this.getCpf().equals("00000000000") || this.getCpf().equals("11111111111")
	    			//|| this.getCpf().equals("22222222222") || this.getCpf().equals("33333333333") || this.getCpf().equals("44444444444")
	    			//|| this.getCpf().equals("55555555555") || this.getCpf().equals("66666666666") || this.getCpf().equals("77777777777")
	    			//|| this.getCpf().equals("88888888888") || this.getCpf().equals("99999999999")) 
	    			System.err.println("Erro. Digite um CPF válido.");	    		
	    	return (this.getCpf().length() == 11);
	    }
	    
	    public int getRandom() {
	    	int min = 100000000;
	    	int max = 999999999;
	    	int numero = sorteia.nextInt((max-min) + 1) + min;
	    	return numero;
	    }
	    
	    public void imprimirInfo() {
	        System.out.println("\t\t\n ::: Contrato de Empréstimo de Equipamentos :::");
	        System.out.println("\nNúmero do Contrato: " + getRandom());
	        System.out.println("\nNome: "+getNome()+"\nCPF: "+getCpf()+"\nEndereço: "+getEndereco()
	        +"\nTelefone: "+getTelefone()+"\nEmail: "+getEmail());
	    }
	}