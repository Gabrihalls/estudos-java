import java.util.Scanner;

public class quarto{
	public static void main(String[] args){
		Scanner entrada = new Scanner (System.in);

		System.out.print("Oi,qual seu nome?: ");
		String nome = entrada.nextLine();
		
		System.out.print(nome + ", qual o valor do salario minimo?: ");
		double salarioMinimo = entrada.nextDouble();
		
		System.out.print(nome + ", agora me diga o valor do seu salario?: ");
		double salarioUsuario = entrada.nextDouble();
		
		double quantidade = salarioUsuario / salarioMinimo;
		
		System.out.println(nome + ", voce recebe: " + quantidade + " salarios minimos"); 
	}	
}