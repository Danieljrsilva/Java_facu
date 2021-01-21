package funcionario;

	public class Funcionario {
		//atributos
		String nome;
		double valorhora;
		double Qtdhoras;
	
	//metodos
	Funcionario(String nome,double valorhora,double Qtdhoras){
		this.nome = nome;
		this.valorhora = valorhora; 
		this.Qtdhoras = Qtdhoras; 
	}
	
	double salario() {
		return(this.valorhora * this.Qtdhoras);
	}

}


