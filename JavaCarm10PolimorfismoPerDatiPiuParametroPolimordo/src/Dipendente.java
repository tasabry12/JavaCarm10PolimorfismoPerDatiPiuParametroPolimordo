
public class Dipendente {
	
	private String nome;
	private String cognome;
	
	public Dipendente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public double calcolaStipendio(int giorniLavorativi) {
		return giorniLavorativi *8.0 *3.0;
	}
	
	@Override
	public String toString(){
		return nome + " " + cognome;
	}

}
