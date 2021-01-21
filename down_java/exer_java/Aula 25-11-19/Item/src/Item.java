
public class Item {
	String descricao;
	double precoUnitario;
	int quantidade;
	
	public Item(String descricao, double precoUnitario, int quantidade) {
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
	}
	
	public double getTotalItem() {
		return this.precoUnitario * this.quantidade;
	}
	
	public String getItem() {
		return this.descricao + "\t" + this.precoUnitario + "\t" + this.quantidade + "\t" + getTotalItem();
	}
}
