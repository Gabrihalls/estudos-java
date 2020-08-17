import java.util.Scanner;

public class OperadorTernario{
	public static void main (String [] args){
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		//                  expressão boleana    valor V  :  valor F
		String indicacao = (    idade >= 18  ) ? "Adulto" : "Crianca/Adolescente";

		System.out.println("Resultado: " + indicacao);
	}
}