
public class testaImovel {

	public static void main(String[] args) {
		
		Imovel imovel = new Imovel("Rua Luiz Vaz", 130000);
		Novo novo = new Novo("Bairro dos Franco", 150000);
		Velho velho = new Velho("Centro",120000);
		
		System.out.println(" --> Imovel <-- ");
		System.out.println("Endereco: " + imovel.getEndereco());
		System.out.println("Preço: " + imovel.getPreco());
		System.out.println();
		

		System.out.println(" --> Novo <-- ");
		System.out.println("Preço: " + novo.getPreco());
		System.out.println("Acrescimo: " + novo.Acrescimo());
		System.out.println();
		
		System.out.println(" --> Velho <-- ");
		System.out.println("Preço: " + velho.getPreco());
		System.out.println("Desconto: " + velho.Desconto());
		System.out.println();
	}

}
