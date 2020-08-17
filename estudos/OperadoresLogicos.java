import java.util.Scanner;

public class OperadoresLogicos{
	public static void main (String []args){
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		
		System.out.print("Digite 1 para sexo masculino e qualquer outro numero para sexo feminino: ");
		char sexo = entrada.nextShort() == 1 ? 'M' : 'F';
		
		double imc = peso / (altura*altura);
		
		if ((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 20.7)){
			System.out.println("Voce esta abaixo do peso!");
		}else if ((sexo == 'F' && imc <= 25.8) || (sexo == 'M' && imc <= 26.4)){
			System.out.println("Voce esta no peso ideal!");
		}else if ((sexo == 'F' && imc <= 27.3) || (sexo == 'M' && imc <= 27.8)){
			System.out.println("Voce esta um pouco acima do peso!");
		}else if ((sexo == 'F' && imc <= 32.3) || (sexo == 'M' && imc <= 31.3)){
			System.out.println("Voce esta acima do peso ideal!");
		}else {
			System.out.println("Voce esta obeso!!!");
		}
	}
}