
public class retangulo {
	
	int c;
	int a;
	
	retangulo(int c, int a){
		this.c = c;
		this.a = a;
	}
	
	int area() {
		return this.c * this.a;				
	}
	
	int perimetro() {
		return 2 * this.c + 2 * this.a;
	}
	

}
