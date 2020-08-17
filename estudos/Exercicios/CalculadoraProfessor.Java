public class CalculadoraProfessor{
	public static void main(String[] args){
		boolean calculoDetalhado = true;
		float pi = 3.14f;
		float raio = 5.3f;
	    float area = (raio*raio) * pi;
		int ValorSemCasasDecimais = (int) area;
		if (calculoDetalhado) {
			System.out.println("Area = " + raio + " * " + raio + " * " + pi);
		}
		System.out.println("Resultado: " + area);
		System.out.println("Resultado sem casas decimais: " + ValorSemCasasDecimais);
	}
}