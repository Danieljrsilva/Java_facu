
public class testret {

	public static void main(String[] args) {
		int x = 9;
		int y = 5;
		retangulo r = new retangulo(x,y);
		System.out.println("Dimens�o do Ret�ngulo");
		System.out.println("�rea: " + r.area());
		System.out.println("Perimetro: " + r.perimetro());
		
		retangulo outro = new retangulo(3,5);
		System.out.println("�rea total: ");
		System.out.println(r.area() + outro.area());

	}

}
