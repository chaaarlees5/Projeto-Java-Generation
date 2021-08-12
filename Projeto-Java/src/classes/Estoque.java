package classes;

import java.util.Scanner;

public class Estoque {
	
	private int quantidade;
	private String codProduto;
	private boolean emprestimo;
	private int tipoDef;
	private String indeterminado;
	
	int op;
	String verifica;
	Scanner input = new Scanner(System.in);
	
	public Estoque(int quant, String codigo, boolean emprestimo, int tipoDef) 
	{
		this.quantidade = quant;
		this.codProduto = codigo;
		this.emprestimo = emprestimo;
		this.tipoDef = tipoDef;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getTipoDef() {
		return tipoDef;
	}

	public void setTipoDef(int tipoDef) {
		this.tipoDef = tipoDef;
	}

	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}

	public boolean isEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(boolean emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	public int menuEstoque() {
		System.out.print("\n\t\t::: Menu do estoque ::: \n---------------------------------------"
			+ "\n(1) Adicionar produtos ao estoque"
				+ "\n(2) Remover produtos do estoque"
				+ "\n(3) Mostrar todos os produtos do estoque"
				+ "\n(0) Encerrar \n---------------------------------------"
			+"\nDigite a opção desejada: ");
		op = input.nextInt();
		return op;
	}
	
	public String addProd() {
		input.nextLine();
		System.out.print("\nDigite o produto para adicionar ao estoque: ");
		verifica = input.nextLine();
		verifica = verifica.toLowerCase();
		return verifica;
	}
	
	public String removeProd() {
		input.nextLine();
		System.out.print("\nDigite o produto para remover do estoque: ");
		verifica = input.nextLine();
		verifica = verifica.toLowerCase();
		return verifica;
	}
	
	public int quantidade() {
		System.out.print("\nDigite a quantidade: ");
		int quant = input.nextInt();
		return quant;
	}
}