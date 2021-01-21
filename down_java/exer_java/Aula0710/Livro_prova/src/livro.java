
public class livro {
	String titulo;
	int numpaginas;
	int paginaatual;
	
	livro(String titulo,int numpaginas,int paginaatual){
		this.titulo = titulo;
		this.numpaginas = numpaginas;
		this.paginaatual = paginaatual;
	}
	
	void avancapagina() {
		if(this.paginaatual < this.numpaginas)
			this.paginaatual += 1;
	}
	
	void voltapagina() {
		if(this.paginaatual > 0)
			this.paginaatual -= 1;
	}
	
	int paginaatual() {
		return this.paginaatual;
	}
}
