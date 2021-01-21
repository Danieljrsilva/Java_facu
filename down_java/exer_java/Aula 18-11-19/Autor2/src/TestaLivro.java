
public class TestaLivro {

	public static void main(String[] args) {
		Autor a = new Autor(9, "Mario Jino");
		Autor b = new Autor(8, "J.C. Maldonado");
		Autor[] autores = {a,b};
		Livro l = new Livro(1,"Introdução ao Teste de Software",autores);
		System.out.println(l.show());
	}

}
