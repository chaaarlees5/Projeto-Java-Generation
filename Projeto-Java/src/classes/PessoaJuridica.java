package classes;

public class PessoaJuridica extends Cadastro {
	
	private String cnpj;

    public PessoaJuridica(String nome, String endereco, 
            String telefone, String email,  String cnpj) {

        super(nome, endereco, telefone, email);
        this.cnpj = cnpj;
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
