package Handler;

public class Kunde {
	private int kundenID;
	private String vorname;
	private String nachname;
	private String telefon;
	private String adresse;
	private String email;

	public Kunde( String vorname, String nachname,String email ,String adresse,String telefon ){
		
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
		this.adresse = adresse;
		this.telefon = telefon;
		
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getKundenID() {
		return kundenID;
	}

	public void setKundenID(int kundenID) {
		this.kundenID = kundenID;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}
}
