public class NotaDoAluno {
	
	public static void main(String[] args){
		int notaAluno1 = 99;
		int notaAluno2 = 80;
	    int notaAluno3 = 53;
		
		int notaGeral = notaAluno1 + notaAluno2 + notaAluno3;		
		System.out.println(notaGeral);
		
		float mediaDasNotas = (notaAluno1 + notaAluno2 + notaAluno3)/3;
		System.out.println("A media da nota dos alunos:" + mediaDasNotas);
	}
} 	