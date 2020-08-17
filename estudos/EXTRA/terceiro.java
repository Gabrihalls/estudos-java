import java.util.Scanner;

public class terceiro{
	public static void main(String[] args){
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite um saldo: ");
		double saldo = entrada.nextDouble();
		
		double novoSaldo = saldo + (saldo* 1/100); 
		System.out.println("Novo saldo: " + novoSaldo);
	}
}