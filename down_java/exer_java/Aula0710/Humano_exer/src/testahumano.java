
public class testahumano {

	public static void main(String[] args) {
		humano h = new humano("Maria",35,1.6,50,"F");
		System.out.println(("Análise IMC:"+h.analisaIMC()));
		
		h.setAltura(1.55);
		h.setPeso(65);
		System.out.println(("Análise IMC:"+h.analisaIMC()));
	}

}
