package fundamentos;

public class ConversaoTemperatura {
	
	public static void main(String[] args) {
		
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O Resultado é: " + celsius + "ºC.");
		
		fahrenheit = 150;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.print("O Resultado é: " + celsius + "ºC.");
	}

}
