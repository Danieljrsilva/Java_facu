
public class cubo {
	int aresta;
	
	cubo(int aresta){
		this.aresta = aresta;
	}
	
	int area() {
		return 6 * this.aresta * this.aresta;
	}
	
	int volume() {
		return (int) Math.pow(this.aresta, 3);
	}
}
