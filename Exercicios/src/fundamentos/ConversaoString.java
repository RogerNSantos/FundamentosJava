package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoString {
	
	public static void main(String[] args) {
		//JOptionPane.showInputDialog - Para cria uma janela de digitação
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número: ");	
		
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número: ");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + soma / 2);
		
	}
	

}
