
public class testa {

	public static void main(String[] args) {
		c obj = new c(9,9);
		
		System.out.println("Resultado = " + obj.calc());
		obj.setA1(5);
		obj.setA2(3);
		System.out.println("Resultado = " + obj.calc());

	}

}
