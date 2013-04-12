package generated;

import generated.Rezept;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.Timestamp;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class Aufgabe4_b {

	  static Scanner scanner = new Scanner (System.in); 
	  
  public static void main(String[] args) throws JAXBException, IOException {

	  
	  //xml_File in Datei speichern
	     File file = new File("src/Aufgabe3dSchokoladenkuchen.xml");
	 
	    //jaxb Objekt erstellen
	    JAXBContext context = JAXBContext.newInstance(Rezept.class);
	    
	    //Marshaller
	    Marshaller m = context.createMarshaller();
	    
	    //Unmarshaller
	    Unmarshaller um = context.createUnmarshaller();
	    
	    //Datei einlesen
	    Rezept r = (Rezept) um.unmarshal(file);
	    
	 // Menue
	   Boolean anzeige = true;
	   int eingabe = 0;
	    
      while (anzeige) {
          System.out.println();
          System.out.println("1. Ausgabe XML Datei");
          System.out.println("2. Neuen Kommentar verfassen");
          System.out.println("3. Beenden");
          System.out.println();
          eingabe = scanner.nextInt();

          // Ausgabe XML Datei
          if (eingabe == 1) {
              ausgabe(r);
          }

          // Neuen Kommentar verfassen
          if (eingabe == 2) {
              eingeben(r, file, m);
          }

          // Menue beenden
          if (eingabe == 3) {
              anzeige = false;
          }
          else
        	  System.out.println("Ungültige Eingabe");
      }
   }    

    //Ausgabe der XML-Datei in Java
      
      public static void ausgabe(Rezept r) {
    	  
    	System.out.println("Rezept: ");
		System.out.println("\nAllgemeines\nRezeptname: " + r.getAllgemeines() .getRezeptname() 
				+     	   "\nAutor: " + r.getAllgemeines() .getAutor()
        		+ 		   "\nZutaten: "+ r.getZutaten() .getGewicht()+ r.getZutaten() .getEinheit()+ r.getZutaten() .getZutat()
        		+		   "\n\nZubereitung\nArbeitszeit:" + r.getZubereitung() .getArbeitszeit() 
				+          "\nSchwierigkeitsgrad:" +  r.getZubereitung() .getSchwierigkeitsgrad() 
				+          "\nBrennwert:" + r.getZubereitung() .getBrennwertPP() 
				+          "\nVorgänge:"  + r.getZubereitung() .getVorgänge()
				+          "\nPortionen:" + r.getPortionen()
				+		   "\n\nKommentare\nName: " + r.getKommentieren() .getName() 
				+          "\nZeit:" +r.getKommentieren() .getZeit() 
				+ 		   "\nDatum:" + r.getKommentieren() .getDatum() 
				+          "\nKommentar:" + r.getKommentieren() .getKommentare() 
				+		   "\nKommentar hilfreich?:"+ r.getKommentieren() .getKommentarHilfreich()
				);
      }
      
   // Neuen Kommentar einfuegen
      public static void eingeben(Rezept r, File file, Marshaller m) throws IOException, JAXBException {

		//Kommentar einfügen
		Writer w = new FileWriter(file);
		String name;
		String kommentar;
		
		Rezept.Kommentieren neuerKommentar = new Rezept.Kommentieren();
		
		System.out.println("\nName: ");
		name = scanner.nextLine();
		neuerKommentar.setName(name);
		
		//automatische Systemzeit ermitteln
		Timestamp zeit = new Timestamp(System.currentTimeMillis());
        System.out.println("Datum: " + zeit);
		
		System.out.println("\nIhr Kommentar:");
		kommentar = scanner.nextLine();
		neuerKommentar.setKommentare(kommentar);
        
        System.out.print("Danke für Deinen Kommentar!");
        
        // Formatierung der XML-Datei
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        
        //Kommentar hinzufügen
       // r.getKommentieren().add(rezept1, neuerKommentar);
		m.marshal(r,w);
  }
}