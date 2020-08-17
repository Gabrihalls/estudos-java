public class segundo{
	public static void main(String[]args){
		int a = 8;
		int b = 9;
		int c = 7;
		int d = 4;
		int e = 5;
		int f = 6;
		
		double media1 = (a + b + c) / 3; 
		double media2 = (d + e + f) / 3;
		double soma = media1 + media2; 
		double mediaDasMedias = (media1 + media2) / 2; 
		
		System.out.println("Media 1: " + media1); 
		System.out.println("Media 2: " + media2);
		System.out.println("Somatorias da medias: " + soma);
		System.out.println("Media das mediaas " + mediaDasMedias);
		
	}
}