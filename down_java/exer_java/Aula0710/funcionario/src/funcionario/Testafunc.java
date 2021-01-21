package funcionario;

public class Testafunc {

	//classe principal
	public static void main(String[] args) {
		Funcionario f = new Funcionario("Pedro",50,10);
		
		System.out.println("Salario R$" + f.salario());
	}

}
