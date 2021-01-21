
public class conta {
	String nome;
	double saldo;
	
	conta(String nome, double saldo){
		this.nome = nome;
		this.saldo = saldo;
	}
	
	boolean saque(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
		    return true;
		}
		else {
			return false;
		}
	}
	
	void deposito(double valor) {
		this.saldo += valor;
	}
	
	double saldo() {
		return this.saldo;
	}
}
