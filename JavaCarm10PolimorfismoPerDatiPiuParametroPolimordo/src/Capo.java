
public class Capo extends Dipendente{

	public Capo(String nome, String cognome) {
		super(nome, cognome);
	}
	
	// Voglio effettuare un Override del Metodo calcola Stipendio
	// Metto l'annotazione Override in modo tale che se svaglio a scivere il nome del metodo di cui voglio fare l'Override
	// Java mi avvisa dandomi errore
	
	@Override
	public double calcolaStipendio(int giorniLavorativi) {
		return giorniLavorativi *8.0 *6.0;
	}

}
