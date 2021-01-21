
public class funcionario {
	protected String nome;
	protected double salario;
	
	funcionario(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public double calculadoraBonificacao() {
		return this.salario * 0.1;
	}
}
