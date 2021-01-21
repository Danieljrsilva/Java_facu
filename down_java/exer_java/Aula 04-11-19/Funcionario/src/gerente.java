
public class gerente extends Funcionario{
	protected String automovel;
	
	public void setAutomovel(String auto) {
		this.automovel = auto;
	}
	
	public void calcBonus() {
		this.salario = this.salario * 1.05;
	}
}
