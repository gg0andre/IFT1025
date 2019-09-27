/**
 * Fait par Andre-Viet Tran (20051185) et Alexandre Keo
 * 
 * Date : 23 Septembre 2019
 * 
 * But :	- Creer la classe PowerGenerator
 * 			- Constructeur PowerGenerator
 * 			- methode nextPower qui retourne la valeur
 * 
 */
 
class PowerGenerator {
	private long nombre;
	private long resultat;
	
	/**   Construire un power generator.   
	 * @param aFactor est la base  
	 * */
	public PowerGenerator(long aFactor) {
		nombre = aFactor;
		resultat = (long)Math.pow(nombre,0);
	} 
	 
	 /**   
	  * Calculer la prochaine valeur de puissance. 
	  */  
	public long nextPower() {
		resultat*=nombre;
		return resultat;
	}
}
