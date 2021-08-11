package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produtos {
	
	public static void main(String[] args) {
		
		List <String> produtos = new ArrayList <String>();
		
		produtos.add("cadeira de rodas");
		produtos.add("muleta");
		produtos.add("andador");
		produtos.add("protese");
		produtos.add("liner");
	
		/*System.out.println("\t\tEQUIPAMENTOS DISPONÍVEIS PARA EMPRÉSTIMO: ");
		for(String listaProdutos: produtos)
		{
			System.out.println(listaProdutos);
		}*/
		
		int contc=10, contm=10, conta=10, contp=10, contl=10, op, opcao;
		Scanner input = new Scanner (System.in);
		
		do {
			System.out.println("\t\t*** ONG AMPARAÇÃO ***");
			System.out.println("*** EMPRÉSTIMO DE EQUIPAMENTOS PARA DEFICIENTES E ACIDENTADOS ***");
			System.out.println("Opção 1 - Pessoa Física.");
			System.out.println("Opção 2 - Pessoa Jurídica.");
			System.out.print("Digite se você é Pessoa Física ou Pessoa Jurídica: ");
			opcao = input.nextInt();
			
			switch(opcao) {
			case 1:
				PessoaFisica cpf = new PessoaFisica (null, null, null, null, null, null);
				cpf.imprimirInfo();
				break;
			case 2:
				PessoaJuridica cnpj = new PessoaJuridica (null, null, null, null, null);
				cnpj.imprimirInfo();
				break;
				default:
				System.out.println(" * Opção Inválida *\n");
			}
			
		} while (opcao < 1 || opcao > 2);
	
		do
		{
			System.out.println("\n\t\tMenu do estoque: ");
			System.out.println("---------------------------------------");
			System.out.println("\n(1) Adicionar produtos ao estoque"
					+ "\n(2) Remover produtos do estoque"
					+ "\n(3) Mostrar todos os produtos do estoque"
					+ "\n(0) Encerrar");
			System.out.println("---------------------------------------");
			System.out.println("\n\t\tDigite uma opção: ");
			op = input.nextInt();
		
			switch (op)
			{
			case 1: 
				input.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String verifica = input.nextLine();
			
				if (produtos.contains(verifica.toLowerCase()))
				{
					if (verifica == "cadeira de rodas")
					{
						contc++;
					}
					else if (verifica == "muleta")
					{
						contm++;
					}
					else if (verifica == "andador")
					{
						conta++;
					}
					else if (verifica == "protese")
					{
						contp++;
					}
					else if (verifica == "liner")
					{
						contl++;
					}
				}
				System.out.println("\t"+contc+"\t"+contm+"\t"+conta+"\t"+contp+"\t"+contl);
				break;
				
			case 2:
				input.nextLine();
				System.out.println("\nDigite o produto para remover ao estoque: ");
				String remover =input.nextLine();
				
				if (produtos.contains(remover.toLowerCase()))
				{
					if (remover == "cadeira de rodas")
					{
						contc--;
					}
					else if (remover == "muleta")
					{
						contm--;
					}
					else if (remover == "andador")
					{
						conta--;
					}
					else if (remover == "protese")
					{
						contp--;
					}
					else if (remover == "liner")
					{
						contl--;
					}
				}
				System.out.println("\t"+contc+"\t"+contm+"\t"+conta+"\t"+contp+"\t"+contl);
				break;
				
			case 3:
				System.out.println("\t\tEQUIPAMENTOS DISPONÍVEIS PARA EMPRÉSTIMO: ");
				for(String listaProdutos: produtos)
				{
					System.out.println(listaProdutos);
				}
				break;
				default:
				System.out.println("\nVocê finalizou o programa, volte sempre! :D");
			}
	
		} while (op != 0);
	
	}

}