
public class Exercice1 {
	public static void Afficher (String mot) {
		int n = mot.length();
		System.out.print("+");
		for (int i=0; i<n; i++) {
			System.out.print("-");
		}
		System.out.print("+\n");
		System.out.println("|" + mot + "|");
		System.out.print("+");
		for (int i=0; i<n; i++) {
			System.out.print("-");
		}
		System.out.print("+");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Afficher("Allo World!");
	}

}
