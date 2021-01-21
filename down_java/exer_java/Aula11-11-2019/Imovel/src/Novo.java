
public class Novo extends Imovel {
	
	protected double preco;
	
	Novo(String endereco, double preco) {
		super(endereco, preco);
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public double Acrescimo() {
		return this.getPreco() *  0.2;
	}
	
}
