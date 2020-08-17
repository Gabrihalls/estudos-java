import java.util.Scanner;

public class Escopo{
	public static void main(String [] args){
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Idade: ");
		int idade = entrada.nextInt();
		
		boolean podeDirigir = idade >= 18;
		String pai = "";
		
		if (!podeDirigir){
			System.out.print("Nome do pai: ");
			pai = entrada.next();
		}
		System.out.println("Voce pode dirigir?");
		if (podeDirigir) {
			System.out.println("Sim,claro");
		}else {
			System.out.println("Nao , se voce fizer isso, seu pai " + pai + " vai ser preso");	
		}
	}	
}