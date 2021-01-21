
public class carro {
	private float capacidadeTanque;
	private float volumeTanque;
	private float rendimento;
	
	public carro(float capacidadeTanque,float volumeTanque,float rendimento) {
		this.capacidadeTanque = capacidadeTanque;
		this.volumeTanque = volumeTanque;
		this.rendimento = rendimento;
	}
	
	float encheTanque(float km){
		if(this.volumeTanque < this.capacidadeTanque) {
			this.volumeTanque += this.capacidadeTanque;
		}
		return volumeTanque;
	}
	
	float passeio(float km) {
		if(this.rendimento * km <= this.volumeTanque) {
			this.encheTanque(km);
		}
		return capacidadeTanque;
	}

	
	
}
