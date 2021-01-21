package balde;

public class TestaBalde {//1

	//classe principal
	public static void main(String[] args) {//2
		Balde b = new Balde("Plastico",1000,0);
		
		if(b.poe(500)) {
			System.out.println("Operação Realizada");
		}
		else {
			System.out.println("Opearação não Realizada");
		}
		if(b.tira(700)) {
			System.out.println("Operação Realizada");
		}
		else 
			System.out.println("Operarção não Realizada");
		

	}//2

}//1
