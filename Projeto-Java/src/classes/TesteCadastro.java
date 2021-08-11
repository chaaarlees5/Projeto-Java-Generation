package classes;

import java.util.Scanner;

public class TesteCadastro {

	public static void main(String[] args) {
	int opcao;
	PessoaFisica cpf = new PessoaFisica (null, null, null, null, null, null);
	PessoaJuridica cnpj = new PessoaJuridica (null, null, null, null, null);

	Scanner input = new Scanner(System.in);

	do {
		System.out.println("Opção 1 - Pessoa Física.");
		System.out.println("Opção 2 - Pessoa Jurídica.");
		System.out.print("Digite se você é Pessoa Física ou Pessoa Jurídica: ");
		opcao = input.nextInt();
		
		switch(opcao) {
		case 1:
			cpf.setInformacoes();
			cpf.validaCPF();
			break;
		case 2:
			cnpj.setInformacoes();
			cnpj.validaCNPJ();
			break;
			default:
			System.out.println(" * Opção Inválida *\n");
		}
		
	} while (opcao < 1 || opcao > 2);
	
	do {
		System.out.println("\nOpção 1 - Cadeira de rodas");
		System.out.println("\nOpção 2 - Muleta");
		System.out.println("\nOpção 3 - Andador");
		System.out.println("\nOpção 4 - Prótese");
		System.out.println("\nOpção 5 - Liner");
		System.out.println("\nDigite 0 para cancelar.");
		System.out.print("\nDigite a opção que deseja solicitar: ");
		opcao = input.nextInt();
		
		switch(	opcao) {
		case 0:
			
			break;
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
			default:
			System.out.println(" * Opção Inválida *");
		}
		
	} while (opcao < 0 || opcao > 5);
  }
}
