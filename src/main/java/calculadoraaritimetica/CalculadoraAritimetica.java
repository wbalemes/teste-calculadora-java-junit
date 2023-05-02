package calculadoraaritimetica;

import java.util.Scanner;


public class CalculadoraAritimetica {

	public static void main(String[] args) {
		Metodos arit = new Metodos();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero");
		int n1 = input.nextInt();
		System.out.println("Entre com o segundo numero");
		int n2 = input.nextInt();
		
		int aritimetica = arit.aritmetica(n1, n2);
		System.out.println("A média dos dos numeros digitados é: " + aritimetica);

input.close();
	}

}
