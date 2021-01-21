
public class testret {

	public static void main(String[] args) {
		int x = 9;
		int y = 5;
		retangulo r = new retangulo(x,y);
		System.out.println("Dimensão do Retângulo");
		System.out.println("Área: " + r.area());
		System.out.println("Perimetro: " + r.perimetro());
		
		retangulo outro = new retangulo(3,5);
		System.out.println("Área total: ");
		System.out.println(r.area() + outro.area());

	}

}
