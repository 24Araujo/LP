/*
Declarar uma variável do tipo String com seu valor inicial igual a branco () e a
seguir atribuir as letras minúsculas do alfabeto (abcde...z), uma-a-uma, as primeiras
vinte e seis posições da variável String. Imprimir o resultado* MA 02110-1301, USA.
 */


public class Ex3Lista7 {
	public static void main (String[] args) {
		
		String texto = "";
		
		for (char letra = 'a'; letra <= 'z'; letra++) {
            texto += letra; 
        }
        
        System.out.println(texto);
        
        //Hemily Araujo Ferraz
	}
}

