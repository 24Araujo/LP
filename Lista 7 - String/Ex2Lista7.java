/*
Declarar uma variável do tipo String com seu valor inicial igual a branco  e a
seguir atribuir as letras
maiúsculas do alfabeto (ABCDE...Z), uma-a-uma, as primeiras
vinte e seis posições da variável String. Imprimir o resultado.
 */


public class Ex2Lista7 {
	
	public static void main (String[] args) {
		
		String saida = " ";
		
		for (char i = 'A'; i <= 'Z'; i++){
			
			saida += i;
		}
		System.out.println(saida);
		saida = " ";
		
		for (int i = 65; i <= 90; i++){
			saida += (char)i;
		}
		
		System.out.println (saida);
		
		//Hemily Araujo Ferraz
	}
}

