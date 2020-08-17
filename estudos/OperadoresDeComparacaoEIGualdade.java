public class OperadoresDeComparacaoEIGualdade{
	
	public static void main(String[] args){
		// Comparação: > maior , >= maior igual , < menor , <= menor igual
		// Igualdade : == igual , != diferente
		
		int a = 10;
		int b = 5;
		int c = 2;
		
		boolean maior = b > a;
		boolean maiorOuIgual = b >= a;
		boolean menor = a < b;
		boolean MenorOuIgual = a <= 10;
		boolean igual = a == b - c;
		boolean diferente = a != c;
		
		System.out.println("b > a ?: " + maior);
		System.out.println("b >= a?: " + maiorOuIgual);
		System.out.println("a < b?: " + menor);
		System.out.println("a <= 10?: " + MenorOuIgual);
		System.out.println("a = b - c?: " + igual);
		System.out.println("a diferente de c?: " + diferente);
	}
}