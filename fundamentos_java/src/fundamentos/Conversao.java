package fundamentos;

import java.util.Scanner;

public class Conversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro sal�rio:");
		String valor1 = entrada.next().replace(",", ".");
		System.out.println("Informe o segundo sal�rio:");
		String valor2 = entrada.next().replace(",", ".");
		System.out.println("Informe o segundo sal�rio:");
		String valor3 = entrada.next().replace(",", "."); 
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double salario = salario1 + salario2 + salario3 / 3;
		
		System.out.printf("%.2f",salario);
		
		entrada.close();
		
	}
	

}
