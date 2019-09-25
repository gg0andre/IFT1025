/**
 * Fait par Andre-Viet Tran (20051185) et Alexandre Keo
 * 
 * Date : 15 Septembre 2019
 * 
 * But :	- Afficher un mot dans un cadre
 * 			- J'ai utiliser la classe Scanner afin que l'utilisateur 
 * 		puisse entrer le mot 
 * 		
 */

import java.util.Scanner;	//importer la classe Java Scanner
public class Afficher {

	public static void AfficherLeMot (String mot) {
		int n = mot.length();	//calculer la longueur
		
		//Afficher la premiere ligne du cadre
		System.out.print("+");
		for (int i=0; i<n; i++) {
			System.out.print("-");
		}
		System.out.print("+\n");
		
		//Afficher la deuxieme ligne
		System.out.println("|" + mot + "|");
		
		//Afficher la troisieme ligne
		System.out.print("+");
		for (int i=0; i<n; i++) {
			System.out.print("-");
		}
		System.out.print("+");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creer un objet pour entrer le mot
		Scanner in = new Scanner(System.in);
		System.out.println("Entrez le mot : ");
		String mot = in.nextLine();	//on lit un String
		in.close();	//fermer la classe Scanner
		AfficherLeMot(mot);
	}

}
