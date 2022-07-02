package Handler;

import Database.DatabaseHelper;

public class HandlerClass {

	public void HelperKunde1(String vorname, String nachname, String email,
			String adresse, String telefon) {

		DatabaseHelper databaseHelper = new DatabaseHelper();
		databaseHelper.insertKunde(vorname, nachname, email, adresse, telefon);

	}

	public void HelperKunde(Kunde kunde) {
		System.out.println("HelperKunde Called");
		
		if(kunde.getVorname().equals("bb")){
		DatabaseHelper databaseHelper = new DatabaseHelper();
		databaseHelper.insert(kunde);
		}else{
			System.out.println("name false");
		}
		

	}

	public void HelperFilm(String titel, int dauer, String Regissuer,
			int erschJahr, int altersfreigabe) {

		DatabaseHelper databaseHelper = new DatabaseHelper();
		databaseHelper.insertFilm(titel, dauer, Regissuer, erschJahr,
				altersfreigabe);

	}

}
