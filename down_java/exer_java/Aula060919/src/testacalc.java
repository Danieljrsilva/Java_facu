
public class testacalc {

	public static void main(String[] args) {
		
		calculadora c1 = new calculadora(3,2);
		calculadora c2 = new calculadora(2,2);
		//calculadora c1 e c2 declara a variavel e define seu tipo
		//new calculadora = instancia o objeto passando valores(parametros)para o construtor
		
		System.out.println(c1.n1 + "+" + c1.n2 + "=" + c1.soma());
		System.out.println(c1.n1 + "*" + c1.n2 + "=" + c1.produto());
		System.out.println(c1.n1 + "^" + c1.n2 + "=" + c1.potencia());
		System.out.println(c2.n1 + "+" + c2.n2 + "=" + c2.soma());
		System.out.println(c2.n1 + "*" + c2.n2 + "=" + c2.produto());
		System.out.println(c2.n1 + "^" + c2.n2 + "=" + c2.potencia());
														//Sintaxe:objeto.metodo
		
		

	}

}
