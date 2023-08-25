/*
 Exibir na tela os caracteres da tabela de códigos ASCII (American Standard Code for
Information Interchange).
 */


public class Ex1Lista7 {
	
	public static void main (String[] args) {
		
		for (int i = 1; i <= 255; i++){
			System.out.print((char) i + " ");
			
			if (i % 20 == 0){
				System.out.println();
			}
		}
		/*
		 * ou...
		 * for (char i = 1; i <= 255; i++){
			System.out.print( i + " ");
			
			if (i % 20 == 0){
				System.out.println();
			}
		} 
		*/
		
		//Hemily Araujo Ferraz
	}
}

