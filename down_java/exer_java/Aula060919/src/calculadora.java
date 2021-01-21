
public class calculadora {
	double n1;
	double n2;
	
	calculadora (double n1,double n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	
	double soma (){
		return(this.n1 + this.n2);
	} 
	//valor de retorno mesmo tipo de método
	
	double produto() {
		return(this.n1 * this.n2);
	}
	
	double potencia () {
		return(Math.pow(this.n1,this.n2));
	}
	//pow(n1,n2)=calculadora potencia=n1 n2
}
