
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
		System.out.println(estBissextile(2016));
		System.out.println(estBissextile(1900));
		System.out.println(estBissextile(2000));
		System.out.println(estBissextile(2020));
		System.out.println(estBissextile(2019));
	}

}
