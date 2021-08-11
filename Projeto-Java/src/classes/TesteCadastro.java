package classes;

import java.util.Scanner;

public class TesteCadastro {

	public static void main(String[] args) {
	int opcao;
	PessoaFisica cpf = new PessoaFisica (null, null, null, null, null, null);
	PessoaJuridica cnpj = new PessoaJuridica (null, null, null, null, null);

	Scanner input = new Scanner(System.in);

	do {
		System.out.println("Op��o 1 - Pessoa F�sica.");
		System.out.println("Op��o 2 - Pessoa Jur�dica.");
		System.out.print("Digite se voc� � Pessoa F�sica ou Pessoa Jur�dica: ");
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
			System.out.println(" * Op��o Inv�lida *\n");
		}
		
	} while (opcao < 1 || opcao > 2);
	
	do {
		System.out.println("\nOp��o 1 - Cadeira de rodas");
		System.out.println("\nOp��o 2 - Muleta");
		System.out.println("\nOp��o 3 - Andador");
		System.out.println("\nOp��o 4 - Pr�tese");
		System.out.println("\nOp��o 5 - Liner");
		System.out.println("\nDigite 0 para cancelar.");
		System.out.print("\nDigite a op��o que deseja solicitar: ");
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
			System.out.println(" * Op��o Inv�lida *");
		}
		
	} while (opcao < 0 || opcao > 5);
  }
}
