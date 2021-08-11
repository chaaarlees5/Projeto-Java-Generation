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

	    public void imprimirInfo() {
	        System.out.println("\t\t\n ::: Dados do Paciente :::");
	        System.out.println("\nNome: "+getNome()+"\nCPF: "+getCpf()+"\nEndereço: "+getEndereco()
	        +"\nTelefone: "+getTelefone()+"\nEmail: "+getEmail());
	    }
	}