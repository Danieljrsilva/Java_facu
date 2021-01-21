
public class Gerente extends funcionario {
	
	protected String usuario;
	protected String senha;
	
	Gerente(String nome, double salario,
			String usuario, String senha) {
		super(nome, salario);
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}
	
	public double calculadoraBonificacao() {
		return this.getSalario() * 0.6 + 100;
	}
}
