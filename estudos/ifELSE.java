import java.util.Scanner;
	
public class ifELSE{
	
	public static void main(String[] args){
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Digite sua altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso/ (altura*altura);
		
		System.out.println( nome + ", Seu IMC : " + imc);
		
		if (imc < 18.5) {
			System.out.println("Abaixo do peso ideal!");
		} else if (imc < 24.9){
			System.out.println("Peso ideal!");
		} else if (imc < 29.9){
			System.out.println("Sobrepeso (Obesidade grau 1)");
		} else if (imc < 39.9){
			System.out.println("Obesidade (grau 2)");
		} else {
			System.out.println("Obesidade GRAVE! (grau 3)");
			System.out.println("Muito cuidado com seu peso!");
		}
	}		
}