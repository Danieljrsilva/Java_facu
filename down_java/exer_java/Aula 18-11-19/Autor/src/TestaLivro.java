
public class TestaLivro {

	public static void main(String[] args) {
		Autor a = new Autor(9, "Eduardo Bueno");
		Livro l = new Livro(1,"A viagem do Desconhecido",a);
		System.out.println(l.show());
	}

}
