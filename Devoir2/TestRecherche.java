/**
 * Auteurs : - Andr�-Viet Tran (p1121494)
 * 		 	 - Alrexandre-Sereyroeut K�o (p0992086)
 * 
 * Fait : le 10 octobre 2019
 * 
 * But : - Completer un programme qui permet de rechercher un numero
 * 		aleatoire dans une table de 1000 nombres choisis au hazard
 * 		 - Afficher les deux nombres aleatoires 
 */


import java.util.Random;
import java.util.Arrays;

public class TestRecherche {
	public static int trouver(int x, int [] data) {
		if(data.length>0) return trouver_rec(x,data, 0, data.length-1);
		else return -1;
	}
	public static int trouver_rec(int x, int [] data, int debut, int fin) {
		if(debut<fin) {
			int milieu = debut+(fin-debut)/2;
			
			if(x < data[milieu]) {
				return trouver_rec(x, data, debut, milieu);
			}
			else if (x > data[milieu]) {
				return trouver_rec(x, data, milieu, fin);
			}
			else
				return milieu;
		}
		return -(debut=1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []data = new int [1000];
		Random generateur = new Random();    
		// g�n�rer un tableau de fa�on al�atoire         
		for (int i=0; i<1000; i++) data[i] = generateur.nextInt();    
		
		// trier le tableau dans l�ordre croissant         
		Arrays.sort(data);         
		int index = generateur.nextInt(1000);         
		int x = data[index]; 
		
		// L�index trouv� correspondant � x doit �tre le m�me que index    
		System.out.println(index + " " + trouver(x, data));    
	}

}
