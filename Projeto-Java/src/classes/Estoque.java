package classes;

public class Estoque {
	
	private int quantidade;
	private String codProduto;
	private boolean emprestimo;
	private int tipoDef;
	private String indeterminado;
	
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
	
}
