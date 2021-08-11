package classes;

public class PessoaJuridica extends Cadastro {
	
	private String cnpj;

    public PessoaJuridica(String nome, String endereco, 
            String telefone, String email,  String cnpj) {

        super(nome, endereco, telefone, email);
        this.cnpj = cnpj;
    }
    
    public void setInformacoes() {
   		System.out.println("\n\t\t ::: Dados da Empresa ::: ");
		
		System.out.print("Nome: ");
		setNome(input.nextLine());
		do {
			System.out.print("CNPJ: ");
			setCnpj(input.nextLine());
		} while(validaCNPJ() == false);
		System.out.print("Endereço: ");
		setEndereco(input.nextLine());
		System.out.print("Telefone: ");
		setTelefone(input.nextLine());
		System.out.print("Email: ");
		setEmail(input.nextLine());
   	}
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public boolean validaCNPJ() {
    	if((this.getCnpj().length()!=14))
    			/*|| this.getCnpj().equals("00000000000000") || this.getCnpj().equals("11111111111111")
    			|| this.getCnpj().equals("22222222222222") || this.getCnpj().equals("33333333333333") || this.getCnpj().equals("44444444444444")
    			|| this.getCnpj().equals("55555555555555") || this.getCnpj().equals("66666666666666") || this.getCnpj().equals("77777777777777")
    			|| this.getCnpj().equals("88888888888888") || this.getCnpj().equals("99999999999999"))*/
    		System.err.println("Erro. Digite um CNPJ válido.");
    	return this.getCnpj().length()==14;
    }

    public void imprimirInfo() {
        System.out.println("\t\t\n ::: Dados da Empresa :::");
        System.out.println("\nNome: "+getNome()+"\nCNPJ: "+getCnpj()+"\nEndereço: "+getEndereco()
        +"\nTelefone: "+getTelefone()+"\nEmail: "+getEmail());

    }
}