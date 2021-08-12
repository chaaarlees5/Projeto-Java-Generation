package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produtos {
	
	public static void main(String[] args) {
		int contC=10, contM=10, contA=10, contP=10, contL=10, op, opcao=0, quant=0;
		String verifica;
		
		PessoaFisica cpf = new PessoaFisica (null, null, null, null, null, null);
		PessoaJuridica cnpj = new PessoaJuridica (null, null, null, null, null);
		Cadastro cadastro = new Cadastro(null, null, null, null, null);
		Estoque estoque = new Estoque(0, null, false, 0);
		
		List <String> produtos = new ArrayList <String>();
		
		produtos.add("cadeira de rodas");
		produtos.add("muleta");
		produtos.add("andador");
		produtos.add("protese");
		produtos.add("liner");
	
		int doacao = cadastro.doaEmpresta();
		
		do {
			opcao = cadastro.fisicaJuridica();
			
			switch(opcao) {
			case 1:
				cpf.setInformacoes(doacao);
				break;
			case 2:
				cnpj.setInformacoes();
				break;
			default:
				System.out.println(" * Op��o Inv�lida *\n");
			}
		} while (opcao < 1 || opcao > 2);
	
		do {
			op = estoque.menuEstoque();
			switch (op) {
			case 1: 
				verifica = estoque.addProd();
				quant = estoque.quantidade();
				
				if (produtos.contains(verifica)) {
					if (verifica.equals("cadeira de rodas")) {
						contC += quant;
					}
					else if (verifica.equals("muleta")) {
						contM += quant;
					}
					else if (verifica.equals("andador")) {
						contA += quant;
					}
					else if (verifica.equals("protese")) {
						contP += quant;
					}
					else if (verifica.equals("liner")) {
						contL += quant;
					}
				} 
				else {
					System.out.println("\nProduto n�o reconhecido.");
				}
				
				System.out.println("\t"+contC+"\t"+contM+"\t"+contA+"\t"+contP+"\t"+contL);
				break;
				
			case 2:
				verifica = estoque.removeProd();
				quant = estoque.quantidade();
				
				if (produtos.contains(verifica)) {
					if (verifica.equals("cadeira de rodas")) {
						contC -= quant;
					}
					else if (verifica.equals("muleta")) {
						contM -= quant;
					}
					else if (verifica.equals("andador")) {
						contA -= quant;
					}
					else if (verifica.equals("protese")) {
						contP -= quant;
					}
					else if (verifica.equals("liner")) {
						contL -= quant;
					}
					else {
						System.out.println("Produto digitado n�o existe!!!");
					}
				}
				break;
				
			case 3:
				System.out.println("\t\t\n::: Equipamentos dispon�veis para empr�stimo :::\n");
				for(String listaProdutos:produtos) {
					if(listaProdutos=="muleta") {
						System.out.println("- " + listaProdutos + ": " + contM + "un");
					} else if(listaProdutos=="andador") {
						System.out.println("- " +listaProdutos + ": " + contA + "un");
					} else if(listaProdutos=="protese") {
						System.out.println("- " +listaProdutos + ": " + contP + "un");
					} else if(listaProdutos=="liner") {
						System.out.println("- " +listaProdutos + ": " + contL + "un");
					} else if(listaProdutos=="cadeira de rodas") {
						System.out.println("- " +listaProdutos + ": " + contC + "un");
					}
					
				}
				break;
			default:
				System.out.println("\nVoc� finalizou o programa, volte sempre! :D");
			}
	
		} while (op != 0);
		
		if(opcao == 1 && doacao == 1) {
			cpf.imprimirInfoDoacao();
		} else if(opcao == 1 && doacao == 2){
			cpf.imprimirInfoEmp();
		} else if(opcao == 2 && doacao == 1){
			cnpj.imprimirInfoDoacao();
		} else {
			cnpj.imprimirInfoEmp();
		}
	}

}