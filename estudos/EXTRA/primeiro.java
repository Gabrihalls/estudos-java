import java.util.Scanner;

public class primeiro{
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Qual sua idade?Em anos Meses e Dias: ");
		int idade = entrada.nextInt();
		int meses = entrada.nextInt();
		int dias = entrada.nextInt();
	
		int anosEmDias = idade * 365;
		int mesesEmDias = meses * 30;
		
		int total = anosEmDias + mesesEmDias + dias;
		
		System.out.println("Sua idade em dias: " + total);
	}
}