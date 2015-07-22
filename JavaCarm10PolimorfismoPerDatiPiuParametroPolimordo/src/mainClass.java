
public class mainClass {

	public static void main(String[] args) {
		/**
		 * Polimorfismo per dati:
		 * Si può assegnare un reference di una super classe
		 * ad un'istanza di una sottoclasse
		 */
		
		Dipendente d = new Dipendente("Mario","Toscano");
		/**
		 * Limite:
		 * Un reference di una super classe non potrà accedere
		 * ai campidichiarati nella sottoclasse.
		 * Es: metodo calcolaStipendio definito nella classe Capo.
		 */
		
		d.calcolaStipendio(24);  // calcolaStipendio : classe Dip.
		
		/**
		 * In un metodo, un parametro di tipo reference si dice
		 * POLIMORFO quando, anche essendo di fatto un reference
		 * relativo ad una determinata classe, può puntare ad un
		 * oggetto istanziato da una sottoclasse.
		 */
		
		/**
		 * Metodo println prende Object come parametro.
		 * Grazie al polimorfismo per dati e si fatto che
		 * ogni classe estende la clòasse Object, al metodo
		 * println con parametro Object possiamo passare
		 * qualsiasi classe, come ad esempio Dipendente.
		 */
		System.out.println(d.toString());  //Parametro polimorfo.
		
		

	}

}
