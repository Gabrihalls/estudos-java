import java.util.Scanner;

public class quinto{
	public static void main(String[]args){
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Oi , qual seu nome? : ");
		String nome = entrada.nextLine();
		
		System.out.print(nome + " , digite um número");
		int numero =  entrada.nextInt();
		
		int antecessor  = numero - 1;
		int sucessor = numero + 1;
		
		System.out.println(nome + " , você escolheu o numero " + numero + " , o sucessor dele: " + sucessor + " o antecessor dele: " + antecessor);
	}
}