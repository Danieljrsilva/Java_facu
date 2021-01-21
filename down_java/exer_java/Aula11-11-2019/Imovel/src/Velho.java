
public class Velho extends Imovel {
	
	protected double preco;
	
	Velho(String endereco, double preco) {
		super(endereco, preco);
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}
	
	public double Desconto() {
		return this.getPreco() * -0.2;
	}
}
