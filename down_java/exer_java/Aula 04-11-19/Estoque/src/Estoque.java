
public class Estoque {
	private String nome;
	private int qtdAtual;
	private int qtdMinima;

	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}

	public Estoque() {
		
	}
	
	public void mudarNome(String nome) {
		this.nome = nome;
	}
	
	public void mudarqtdMinima( int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	
	public void repor(int qtd) {
		this.qtdAtual += qtd;
	}
	
	public void darBaixa(int qtd) {
		this.darBaixa(qtd);
	}
	
	public String mostra() {
		return "Nome: " + this.nome + "Quantidade: " + this.qtdAtual + "Quantidade Minima" + this.qtdMinima;
	}

	boolean precizaRepor() {
		if (this.qtdAtual < this.qtdMinima) {
			return true;
		}
		else {
			return false;
		}
	}

	public int getQtdAtual() {
		return this.qtdAtual;
	}


	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}


}
