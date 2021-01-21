
public class testaconta {

	public static void main(String[] args) {
		conta cc = new conta("Daniel",10000);
		cc.deposito(500);
		System.out.print("Saldo = " + cc.saldo());
		if(cc.saque(100)) {
			System.out.print("Operação Realizada");
		}
		else {
			System.out.print("Operação não Realizada");
		}
	}

}
