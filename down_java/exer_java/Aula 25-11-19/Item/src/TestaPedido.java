
public class TestaPedido {

	public static void main(String[] args) {
		Pedido p = new Pedido(9,"19/11/2019","UNIMETROCAMP");
		Item i1 = new Item("Caderno",2.00,5);
		Item i2 = new Item("Lapis",0.50,10);
		Item i3 = new Item("Regua",5.00,1);
		
		p.add(i1);
		p.add(i2);
		p.add(i3);
		
		System.out.println(p.show());
		
		p.remove(1);
		
		System.out.println(p.show());
	}

}
