
public class Calculadora {
	
	public static void main(String[] args) {
		double numero1 = 12.7;
		double numero2 = 0;
		
		double soma = soma(numero1, numero2);
		double diferenca = subtracao(numero1, numero2);
		double produto = multiplicacao(numero1, numero2);
		double quociente = divisao(numero1, numero2);
		
		System.out.println(numero1 + " + " + numero2 + " = " + soma);
		System.out.println(numero1 + " - " + numero2 + " = " + diferenca);
		System.out.println(numero1 + " * " + numero2 + " = " + produto);
		System.out.println(numero1 + " / " + numero2 + " = " + quociente);		
	}
	
	// Método que soma dois double
	public static double soma(double n1, double n2) {
		return (n1 + n2);		
	}
	
	// Método que subtrai dois double
	public static double subtracao(double num1, double num2) {
		return (num1 - num2);
	}
	
	public static double multiplicacao(double n1, double n2) {
		return (n1 * n2);
	}
	
	
	public static double divisao(double dividendo, double divisor) {		
		if (divisor == 0) {
			System.out.println("\nErro de divisão por zero.\n");
			return 9.999999999999999;
		}
		return (dividendo / divisor);
	}
}
