
public class circulo {
	//atributos
	float raio;
	float pi;
	
	//metodos
	circulo(float raio,float pi, int i){
		this.raio = raio;
		this.pi = pi;
	}
	
	float area() {
		return this.pi * this.raio * this.raio;
	}
	
	float perimetro() {
		return 2 * this.pi * this.raio;
	}
}
