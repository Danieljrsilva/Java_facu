
public class elevador {
	private int andarAtual;
	private int pessoas;
	private int totalAndar;
	private int capacidade;
	
	
	public elevador(int andarAtual,int pessoas,int totalAndar,int capacidade){
		this.andarAtual = andarAtual;
		this.pessoas = pessoas;
		this.totalAndar = totalAndar;
		this.capacidade = capacidade;
		
	}
	
	boolean Entra() {
		if(this.pessoas < this.capacidade) {
			this.pessoas += 1;
			return true;
		}	
		else {
			return false;
		}
	}
	
	boolean Sai() {
		if(this.pessoas != 0) {
			this.pessoas -= 1;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	boolean Sobe() {
		if((int)this.andarAtual != this.totalAndar) {
			this.andarAtual +=1;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	boolean Desce() {
		if(this.andarAtual != 1) {
			this.andarAtual -= 1;
			return true;
		}
		else {
			return false;
		}
	}

	public int getTotalAndar() {
		return this.totalAndar;
	}

	public void setTotalAndar(int totalAndar) {
		this.totalAndar = totalAndar;
	}

	public int getAndarAtual() {
		return this.andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getCapacidade() {
		return this.capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getPessoas() {
		return this.pessoas;
	}

	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
	}
	

	
	
	
}
