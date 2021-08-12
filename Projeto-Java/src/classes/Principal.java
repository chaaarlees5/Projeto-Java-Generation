package classes;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		int contC=10, contM=10, contA=10, contP=10, contL=10, op, opPessoa=0, quant=0;
		String verifica;
		
		PessoaFisica cpf = new PessoaFisica (null, null, null, null, null, null);
		PessoaJuridica cnpj = new PessoaJuridica (null, null, null, null, null);
		Cadastro cadastro = new Cadastro(null, null, null, null, null);
		Estoque estoque = new Estoque();
		List <String> produtos = new ArrayList <String>();
		
		produtos.add("cadeira de rodas");
		produtos.add("muleta");
		produtos.add("andador");
		produtos.add("protese");
		produtos.add("liner");
	
		int doacao = cadastro.doaEmpresta();
		
		do {
			opPessoa = cadastro.fisicaJuridica();
			
			switch(opPessoa) {
			case 1:
				cpf.setInformacoes(doacao);
				break;
			case 2:
				cnpj.setInformacoes();
				break;
			default:
				System.out.println(" * Opção Inválida *\n");
			}
		} while (opPessoa < 1 || opPessoa > 2);
	
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
					System.out.println("\nProduto não reconhecido.");
				}
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
						System.out.println("Produto digitado não existe!!!");
					}
				}
				break;
				
			case 3:
				System.out.println("\t\t\n::: Equipamentos disponíveis para empréstimo :::\n");
				for(String listaProdutos:produtos) {
					if(listaProdutos=="muleta") {
						System.out.println("* Muleta: " + contM + "un *");
					} else if(listaProdutos=="andador") {
						System.out.println("* Andador: " + contA + "un *");
					} else if(listaProdutos=="protese") {
						System.out.println("* Protese de perna: " + contP + "un *");
					} else if(listaProdutos=="liner") {
						System.out.println("* Liner: " + contL + "un *");
					} else if(listaProdutos=="cadeira de rodas") {
						System.out.println("* Cadeira de rodas: " + contC + "un *");
					}
					
				}
				break;
			default:
				System.out.println("\nVocê finalizou o programa, volte sempre! :D");
			}
		} while (op != 0);
		
		if(opPessoa == 1 && doacao == 1) {
			cpf.imprimirInfoDoacao();
		} else if(opPessoa == 1 && doacao == 2){
			cpf.imprimirInfoEmp();
		} else if(opPessoa== 2 && doacao == 1){
			cnpj.imprimirInfoDoacao();
		} else {
			cnpj.imprimirInfoEmp();
		}
	}

}