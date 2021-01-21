import java.util.Scanner;

public class testacalc2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		calculadora c;
		double x,y = 0;
		System.out.print("Valor 1: ");
		x = s.nextDouble();
		c = new calculadora(x,y);
		
		System.out.println(c.n1 + "+" + c.n2 + "=" + c.soma());
		System.out.println(c.n1 + "*" + c.n2 + "=" + c.produto());
		System.out.println(c.n1 + "^" + c.n2 + "=" + c.potencia());

	}

}
