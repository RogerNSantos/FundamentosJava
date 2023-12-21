package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salário: ");
		String salario1 = entrada.next().replace(",", ".");
		
		System.out.print("Informe o segundo salário: ");
		String salario2 = entrada.next().replace(",", ".");
		
		System.out.print("Informe o terceiro salário: ");
		String salario3 = entrada.next().replace(",", ".");
		
		double numero1 = Double.parseDouble(salario1);
		double numero2 = Double.parseDouble(salario2);
		double numero3 = Double.parseDouble(salario3);
		
		double media = (numero1 + numero2 + numero3 ) / 3;
		System.out.println("A média salarial é: " + media);
		
	
		entrada.close();
		
	}

}
