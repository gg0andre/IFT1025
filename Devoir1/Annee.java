/**
 * Fait par Andre-Viet Tran (20051185) et Alexandre Keo
 * 
 * Date : 16 Septembre 2019
 * 
 * But :	- Programme qui permet de verifier si une annee est bissextile
 * 			- J'ai utiliser la classe Scanner afin que l'utilisateur 
 * 		puisse entrer l'annee 
 * 		
 */

import java.util.Scanner;

public class Annee {
	
	//fonction pour verifier
	public static boolean estBissextile (int annee) {
		boolean test = false;
		//verifier l'annee
			if (annee %4 == 0 && (annee%100 !=0 || annee %400==0)) {
				test = true;
			}
		return test;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creer l'objet pour scanner
		Scanner in = new Scanner(System.in);
		
		System.out.println("Entrez l'annee : ");
		int annee = in.nextInt();	//on lit un entier
		in.close();	//fermer la classe
		System.out.println(estBissextile(annee));
	}

}
