
public class testeElevador  {

	public static void main(String[] args) {
		elevador e = new elevador(1,0,60,20);
		e.Entra();
		e.Sai();
		e.Sobe();
		e.Desce();
		System.out.println("Elevador Metrocamp Wyden" +
		" \nN°: " + e.getAndarAtual() +
		" \nPessoas nesse Elevador : " + e.getPessoas() +
		" \nAndares: " + e.getTotalAndar() +
		" \nCapacidade: " + e.getCapacidade());
		
	}

}
 