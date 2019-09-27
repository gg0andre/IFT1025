/**
 * Fait par Andre-Viet Tran (20051185) et Alexandre Keo
 * 
 * Date : 23 Septembre 2019
 * 
 * But :	- Creer un generateur et appeller un certain nombre de fois
 * 			- J'ai utiliser la classe Scanner afin que l'utilisateur 
 * 		puisse entrer 2 nombres
 * 		
 */
 
import java.util.Scanner;
public class PowerGeneratorTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		//premier nombre
		System.out.println("Entrez le premier nombre : ");
		long premier = in.nextLong();	//entrer un Long
		
		//deuxieme nombre
		System.out.println("Entrez le deuxieme nombre : ");
		long deuxieme = in.nextLong();	//entrer un Long
		in.close();	//fermer la classe
		
		//creer l'objet myGenerator de la classe PowerGenerator
		PowerGenerator myGenerator = new PowerGenerator(premier);
		
		//Afficher
		for(int i=0; i<deuxieme; i++) {
			System.out.println(i+1 + ")\t" + myGenerator.nextPower());
		}
	}

}
