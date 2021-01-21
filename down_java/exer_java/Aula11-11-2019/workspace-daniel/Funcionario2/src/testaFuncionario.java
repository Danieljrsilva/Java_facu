
public class testaFuncionario {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Daniel",3000.58,"Daniel","5523");
		funcionario funcionario = new funcionario("Jose",1500);
		
		System.out.println("#### Gerente ####");
		System.out.println("Nome.: " + gerente.getNome());
		System.out.println("Salario.: " + gerente.getSalario());
		System.out.println("Usuario.: " + gerente.getUsuario());
		System.out.println("Senha.: " + gerente.getSenha());
		System.out.println("Bonificação.: " + gerente.calculadoraBonificacao());
		System.out.println();
		

		System.out.println("#### Funcionario ####");
		System.out.println("Nome.: " + funcionario.getNome());
		System.out.println("Salario.: " + funcionario.getSalario());
		System.out.println("Bonificação.: " + funcionario.calculadoraBonificacao());
		System.out.println();
	}

}
