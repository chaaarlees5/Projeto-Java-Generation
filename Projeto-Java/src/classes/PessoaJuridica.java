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
		
		System.out.print("\nNome: ");
		setNome(input.nextLine());
		
		do {
			System.out.print("CNPJ: ");
			setCnpj(input.nextLine());
		} while(validaCNPJ() == false);
		
		System.out.print("Endere�o: ");
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
    		System.err.println("Erro. Digite um CNPJ v�lido.");
    	return this.getCnpj().length()==14;
    }

    public void imprimirInfoEmp() {
    	
    }
    
    public void imprimirInfoDoacao() {
            
    }
}