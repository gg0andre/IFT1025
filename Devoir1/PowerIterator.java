/**
 * Fait par Andre-Viet Tran (20051185) et Alexandre Keo
 * 
 * Date : 20 Septembre 2019
 * 
 * But :	- Afficher une suite de puissances sans objet
 * 			- J'ai utiliser la classe Scanner afin que l'utilisateur 
 * 		puisse entrer 2 nombres 
 * 		
 */

import java.util.Scanner;
public class PowerIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creer une classe pour entrer le nombre
		Scanner in = new Scanner(System.in);	
		//premier nombre
		System.out.println("Entrez le premier nombre : ");
		long premier = in.nextLong();	//entrer un Long
		
		//deuxieme nombre
		System.out.println("Entrez le deuxieme nombre : ");
		long deuxieme = in.nextLong();	//entrer un Long
		in.close();	//fermer la classe
		
		//afficher
		for(long i=1; i<=deuxieme; i++)
		{
			System.out.println(i+")\t" +(long) Math.pow(premier, i-1));
		}
	}
	

}
