package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int peso;
		double altura;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite Peso seguido de altura: ");
		peso = teclado.nextInt();
		altura = teclado.nextDouble();

		
		Double imc = peso / (altura * altura);
		
 		System.out.printf("IMC: %.2f"+ imc);
	}

}
