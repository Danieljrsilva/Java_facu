
public class series {
	int i1, i2, passo;
	
	void seti1(int i1) {
		this.i1 = i1;
	}
	
	void seti2(int i2) {
		this.i2 = i2;
	}
	
	void setPasso(int passo) {
		if(this.passo <= 0) {
			this.passo = 1;
		}
		else {
			this.passo=passo;
		}
		
	}
	
	String mostraSerie() {
		do {
			passo += ";" + i2;
			i1 += i2;
			i1++;
			i2++;
			}while (passo <= i2);
		}
}
