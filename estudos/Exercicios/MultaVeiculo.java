import java.util.Scanner;

public class MultaVeiculo{
	public static void main (String [] args){
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Qual o tipo de veículo?(Passeio ou caminhao): ");
		String tipoVeiculo = entrada.nextLine();
		
		System.out.print("Qual a velocidade maxima da via?: ");
		int velocidadeMaxima = entrada.nextInt();
		
		System.out.print("Qual a velocidade do veiculo?: ");
		int velocidadeVeiculo = entrada.nextInt();
		
		if (( tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1) || (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05)){
			System.out.println("multa!");
		}else {
			System.out.print("Dentro do limite de velocidade da via!");
		}
	}
}