package Aula2;

public class Avaliacao {
	float nota1;
	float nota2;
	float nota3;
	
	float totalNota;
	float totalNotaP;
	
	Avaliacao(float pnota1,float pnota2,float nota3){
		nota1 = pnota1;
		nota2 = pnota2;
		this.nota3 = nota3;
	};
	
	Avaliacao(){
		
		System.out.println("Valor nulo");
		
	}
	
	void MediaAritmetica() {
		
		totalNota = (nota1 + nota2 + nota3)/3;
		System.out.println(totalNota);
	};
	
	void MediaPonderada() {
		
		totalNotaP = ((nota1*2)+(nota2*3)+(nota3*4))/9;
		System.out.println(totalNotaP);
	};
}
