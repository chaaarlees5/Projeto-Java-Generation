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
			cpf.imprimirInfo();
			break;
		case 2:
			cnpj.setInformacoes();
			cnpj.imprimirInfo();
			break;
			default:
			System.out.println(" * Op��o Inv�lida *\n");
		}
		
	} while (opcao < 1 || opcao > 2);
	
	do {
		System.out.println("\n\nOp��o 1 - Muleta.");
		System.out.println("Op��o 2 - Cadeira de Rodas.");
		System.out.println("Op��o 3 - Liner.");
		System.out.println("Op��o 4 - Pr�tese de Perna.");
		System.out.println("Op��o 5 - ???????????.");
		System.out.println("Digite 0 para cancelar.");
		System.out.print("Digite a op��o que deseja solicitar: ");
		opcao = input.nextInt();
		
		switch(opcao) {
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
