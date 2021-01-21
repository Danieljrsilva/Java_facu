
public class humano {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String sexo;
	
	public  humano(String nome,int idade,double altura,double peso,String sexo) {
		this.nome=nome;
		this.idade=idade;
		this.altura=altura;
		this.peso=peso;
		this.sexo=sexo;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	public String analisaIMC() {
		
	
	}
	
	private double calcIMC() {
		
	}
}
