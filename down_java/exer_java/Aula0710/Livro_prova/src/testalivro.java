
public class testalivro {

	public static void main(String[] args) {
		livro l = new livro("Biblia", 2366,1);
		l.avancapagina();
		l.avancapagina();
		l.voltapagina();
		System.out.print("Pagina: " + l.paginaatual());

	}

}
