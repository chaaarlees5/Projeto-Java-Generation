package classes;

import java.util.Scanner;

public class TesteCadastro {

	public static void main(String[] args) 
	{
		int opcao;
		System.out.println("Digite se voc� � Pessoa F�sica ou Pessoa Jur�dica: ");
		
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Op��o 1 - Pessoa F�sica.");
			System.out.println("Op��o 2 - Pessoa Jur�dica.");
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
				System.out.println(" *** Op��o Inv�lida ***");
			}
			
		} while(opcao < 1 || opcao > 2);
	}
}

