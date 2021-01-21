import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int numero;
	private String data;
	private String cliente;
	private List<Item> Item = new ArrayList<>();
	
	public Pedido(int numero, String data, String cliente) {
		this.numero = numero;
		this.data = data;
		this.cliente = cliente;
	}
	
	public void add(Item item) {
		this.Item.add(item);
	}
	
	public void remove(int i) {
		this.Item.remove(i);
	}
	
	public double total() {
		double s=0;
		for(Item i : this.Item) {
			s+= i.getTotalItem();
		}
		return s;
	}
	
	public String listaItens() {
		String l="";
		for(Item i : this.Item) {
			l+=i.getItem()+"\n";
		}
		return l;
	}
	
	public String show() {
		String extrato = "";
		extrato = "Pedido: " + this.numero + "\n"+
		"CLiente : " + this.cliente + "\n" +
		"Data : " + this.data + "\n\n" +
		"Itens do Pedido\n" +
		listaItens() + "\n" +
		"Total do Pedido R$ " + total();
		return extrato;
	}
}
