package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import Handler.HandlerClass;
import Handler.Kunde;

public class DatabaseHelper {
	
	public void insert(Kunde kunde){
		System.out.println("insert Called");
		System.out.println("vorname"+kunde.getVorname());
		
		
		int letztIdNr = 0;
		 try {
			 Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			 Connection con = DriverManager.getConnection(
			 "jdbc:mysql://localhost/mydb","root","0000");
			
			 Statement stm = con.createStatement();
			//System.out.println("called 322");
			ResultSet rs = stm.executeQuery("select  max(idKunde) from kunde ;"); 
			while(rs.next()){
			System.out.println(rs.getInt(1));	
			letztIdNr = rs.getInt(1)+1;
			}
			//insert....
			
			stm.executeUpdate("insert  into  kunde (idKunde , Vorname , Nachname,telefon, Email )  values"
								+ " ( "+letztIdNr+" , '"+ kunde.getVorname()+" ' , '"+ kunde.getNachname()+"'"
										+ " ,'"+kunde.getTelefon()+"', '"+kunde.getEmail()+" ');");
			
			 rs.close();
			 stm.close();
			 con.close();
			 System.out.println("daten sind eingetragen :D ");
			 } catch (Exception ex) {
			 // TODO Auto-generated catch block
			 ex.printStackTrace();
			
			 }
	}
	
	public void insertKunde(String vorname,String nachname, String email, String adresse, String telefon){
		
		
			int letztIdNr = 0;
			 try {
				 Class.forName("com.mysql.jdbc.Driver").newInstance();
				
				 Connection con = DriverManager.getConnection(
				 "jdbc:mysql://localhost/mydb","root","0000");
				
				 Statement stm = con.createStatement();
				//System.out.println("called 322");
				ResultSet rs = stm.executeQuery("select  max(idKunde) from kunde ;"); 
				while(rs.next()){
				System.out.println(rs.getInt(1));	
				letztIdNr = rs.getInt(1)+1;
				}
				//insert....
				
				stm.executeUpdate("insert  into  kunde (idKunde , Vorname , Nachname,telefon, Email )  values"
									+ " ( "+letztIdNr+" , '"+ vorname+" ' , '"+ nachname+"'"
											+ " ,'"+telefon+"', '"+email+" ');");
				
				 rs.close();
				 stm.close();
				 con.close();
				 System.out.println("daten sind eingetragen :D ");
				 } catch (Exception ex) {
				 // TODO Auto-generated catch block
				 ex.printStackTrace();
				
				 }
			 
		}
	public void insertFilm(String titel, int dauer, String Regissuer,
			int erschJahr, int altersfreigabe){
		
		int letztIdNr = 0;
		 try {
			 Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			 Connection con = DriverManager.getConnection(
			 "jdbc:mysql://localhost/mydb","root","0000");
			
			 Statement stm = con.createStatement();
			//System.out.println("called 322");
			ResultSet rs = stm.executeQuery("select  max(idFilm) from film ;"); 
			while(rs.next()){
			System.out.println(rs.getInt(1));	
			letztIdNr = rs.getInt(1)+1;
			}
			//insert....

			
			stm.executeUpdate("insert  into  film (idFilm , Titel , Dauer,Regisseur,Erscheinungsjahr, Altersfreigabe)  values"
								+ " ( "+letztIdNr+" , '"+ titel+" ' , '"+ dauer+"'"
										+ " ,'"+Regissuer+"',"+erschJahr +",'"+altersfreigabe+" ');");
			
			 rs.close();
			 stm.close();
			 con.close();
			 System.out.println("daten sind eingetragen :D ");
			 } catch (Exception ex) {
			 // TODO Auto-generated catch block
			 ex.printStackTrace();
			
			 }
	}
	

}
