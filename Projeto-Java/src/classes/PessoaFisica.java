package classes;

public class PessoaFisica extends Cadastro {
	  private String cpf;

	   public PessoaFisica(String nome, String endereco, 
	         String telefone, String email, String receita, String cpf) {

	       super(nome, endereco, telefone, email, receita);
	       this.cpf = cpf;
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
