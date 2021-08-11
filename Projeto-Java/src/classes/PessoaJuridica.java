package classes;

public class PessoaJuridica extends Cadastro {
	
	private String cnpj;

    public PessoaJuridica(String nome, String endereco, 
            String telefone, String email,  String cnpj) {

        super(nome, endereco, telefone, email);
        this.cnpj = cnpj;
    }
    
    public void setInformacoes() {
   		System.out.println("\n\t\t ::: Dados do Paciente ::: ");
		
		System.out.print("Nome: ");
		setNome(input.nextLine());
		System.out.print("CNPJ: ");
		setCnpj(input.nextLine());
		System.out.print("Endereço: ");
		setEndereco(input.nextLine());
		System.out.print("Telefone: ");
		setTelefone(input.nextLine());
		System.out.print("Email: ");
		setEmail(input.nextLine());
		System.out.print("Código da receita: ");
		setReceita(input.nextLine());
   	}
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void imprimirInfo() {
        System.out.println("\t\t\n ::: Dados da Empresa :::");
        System.out.println("\nNome: "+getNome()+"\nCNPJ: "+getCnpj()+"\nEndereço: "+getEndereco()
        +"\nTelefone: "+getTelefone()+"\nEmail: "+getEmail());

    }
}