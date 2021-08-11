package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produtos {
	
	public static void main(String[] args) {

		PessoaFisica cpf = new PessoaFisica (null, null, null, null, null, null);

		PessoaJuridica cnpj = new PessoaJuridica (null, null, null, null, null);
		
		Cadastro cadastro = new Cadastro(null, null, null, null, null);
		
		List <String> produtos = new ArrayList <String>();
		
		produtos.add("cadeira de rodas");
		produtos.add("muleta");
		produtos.add("andador");
		produtos.add("protese");
		produtos.add("liner");
	
		int contc=10, contm=10, conta=10, contp=10, contl=10, op, opcao=0, quant=0;
		Scanner input = new Scanner (System.in);
		/*
		System.out.println("\t\t*** ONG AmparAção ***"
			+ "\n*** EMPRÉSTIMO DE EQUIPAMENTOS PARA DEFICIENTES E ACIDENTADOS ***");
		
		System.out.print("(1) Doação \n(2) Empréstimo \nDigite a opção desejada: ");
		*/		
		do {
			opcao = cadastro.fisicaJuridica();
			
			switch(opcao) {
			case 1:
				cpf.setInformacoes();
				break;
			case 2:
				cnpj.setInformacoes();
				break;
				default:
				System.out.println(" * Opção Inválida *\n");
			}
		} while (opcao < 1 || opcao > 2);
	
		do {
			System.out.print(cadastro.menuEstoque());
			op = input.nextInt();
		
			switch (op) {
			case 1: 
				input.nextLine();
				System.out.print("\nDigite o produto para adicionar ao estoque: ");
				String verifica = input.nextLine();
				verifica = verifica.toLowerCase();
				System.out.print("\nDigite a quantidade a ser adicionada: ");
				quant = input.nextInt();
				
				if (produtos.contains(verifica)) {
					if (verifica.equals("cadeira de rodas")) {
						contc += quant;
					}
					else if (verifica.equals("muleta")) {
						contm += quant;
					}
					else if (verifica.equals("andador")) {
						conta += quant;
					}
					else if (verifica.equals("protese")) {
						contp += quant;
					}
					else if (verifica.equals("liner")) {
						contl += quant;
					}
				} 
				else {
					System.out.println("\nProduto não reconhecido.");
				}
				
				System.out.println("\t"+contc+"\t"+contm+"\t"+conta+"\t"+contp+"\t"+contl);
				break;
				
			case 2:
				input.nextLine();
				System.out.print("\nDigite o produto para remover ao estoque: ");
				String remover = input.nextLine();
				remover = remover.toLowerCase();
				System.out.print("\nDigite a quantidade a ser removida: ");
				quant = input.nextInt();

				
				if (produtos.contains(remover)) {
					if (remover.equals("cadeira de rodas")) {
						contc -= quant;
					}
					else if (remover.equals("muleta")) {
						contm -= quant;
					}
					else if (remover.equals("andador")) {
						conta -= quant;
					}
					else if (remover.equals("protese")) {
						contp -= quant;
					}
					else if (remover.equals("liner")) {
						contl -= quant;
					}
					else {
						System.out.println("Produto digitado não existe!!!");
					}
				}
				break;
				
			case 3:
				System.out.println("\t\t::: Equipamentos disponíveis para empréstimo :::\n");
				for(String listaProdutos:produtos) {
					
					System.out.println(listaProdutos + " - " + contm);
				}
				break;
			default:
				System.out.println("\nVocê finalizou o programa, volte sempre! :D");
			}
	
		} while (op != 0);
		
		if(opcao == 1) {
			cpf.imprimirInfo();
		} else {
			cnpj.imprimirInfo();
		}
	}

}