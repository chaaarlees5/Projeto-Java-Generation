package classes;

public class PessoaFisica extends Cadastro {
	  private String cpf;

	   public PessoaFisica(String nome, String endereco, 
	         String telefone, String email, String receita, String cpf) {

	       super(nome, endereco, telefone, email, receita);
	       this.cpf = cpf;
	    }
	   
	   	public void setInformacoes() {
	   		System.out.println("\n\t\t ::: Dados do Paciente ::: ");
			
			System.out.print("Nome: ");
			setNome(input.nextLine());
			System.out.print("CPF: ");
			setCpf(input.nextLine());
			System.out.print("Endereço: ");
			setEndereco(input.nextLine());
			System.out.print("Telefone: ");
			setTelefone(input.nextLine());
			System.out.print("Email: ");
			setEmail(input.nextLine());
			System.out.print("Código da receita: ");
			setReceita(input.nextLine());
	   	}
	   
	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }
	    
	    public boolean validaCPF() {
	    	if((this.getCpf().length()!=11) || this.getCpf().equals("00000000000") || this.getCpf().equals("11111111111")
	    			|| this.getCpf().equals("22222222222") || this.getCpf().equals("33333333333") || this.getCpf().equals("44444444444")
	    			|| this.getCpf().equals("55555555555") || this.getCpf().equals("66666666666") || this.getCpf().equals("77777777777")
	    			|| this.getCpf().equals("88888888888") || this.getCpf().equals("99999999999")) 
	    			System.out.println("\nErro. Digite um CPF válido.");	    		
	    	return (false);
	    }

	    public void imprimirInfo() {
	        System.out.println("\t\t\n ::: Dados do Paciente :::");
	        System.out.println("\nNome: "+getNome()+"\nCPF: "+getCpf()+"\nEndereço: "+getEndereco()
	        +"\nTelefone: "+getTelefone()+"\nEmail: "+getEmail());
	    }
	}