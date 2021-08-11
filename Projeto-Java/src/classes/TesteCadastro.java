package classes;

import java.util.Scanner;

public class TesteCadastro {

	public static void main(String[] args) 
	{
		int opcao;
		System.out.println("Digite se você é Pessoa Física ou Pessoa Jurídica: ");
		
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Opção 1 - Pessoa Física.");
			System.out.println("Opção 2 - Pessoa Jurídica.");
			opcao = input.nextInt();
			
			switch(opcao) {
			case 1:
				Cadastro cadastro = new Cadastro (null, null, null, null, null, null);
				cadastro.imprimirInfoCPF();
				break;
			case 2:
				Cadastro cadastroCNPJ = new Cadastro(null, null, null, null, null, null);
				cadastroCNPJ.imprimirInfoCNPJ();
				break;
				default:
				System.out.println(" *** Opção Inválida ***");
			}
			
		} while(opcao < 1 || opcao > 2);
	}
}

