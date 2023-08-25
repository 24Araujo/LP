/*
 * AprovadoReprovadoRandom.java
 * 
 * Copyright 2023 hemil <hemil@HEMILY>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.util.Random;

public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {
		
		Random gerador = new Random();
		
        int nota = gerador.nextInt(11);
        
        System.out.println("Nota: " + nota);
		System.out.println ("O(A) aluno(a) foi" +(nota >= 6 ? " APROVADO.":" REPROVADO."));
		
		//Hemily de Araujo Ferraz
	}
}

