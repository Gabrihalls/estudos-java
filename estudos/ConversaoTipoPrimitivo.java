public class ConversaoTipoPrimitivo {
	
	public static void main(String[] args){
		long x = 933333333333333333L;
		//casting ( NÃO RECOMENDADO NESSE CASO)  
		int y = (int)x;
		System.out.println(y);
		
		double largura = 100.37;
		//nesse caso de casting foi truncado ( sumiu as casas após a vírgula ) 
		int comprimento = (int) largura;
		System.out.println(comprimento);
	}
}	