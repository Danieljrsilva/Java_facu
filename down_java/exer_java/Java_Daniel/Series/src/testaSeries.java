
public class testaSeries {

	public static void main(String[] args, int i1, int i2, int passo) {
		series s = new series();
		s.i1=i1;
		s.i2=i2;
		s.passo=passo;
		System.out.println(s.equals(i1));
		System.out.println(s.equals(i2));
		System.out.println(s.equals(passo));
		
	}

}
