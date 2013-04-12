package generated;


import generated.Rezepte.Rezept;


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

public class Aufgabe4b {

	static Scanner scanner = new Scanner (System.in); 
	  
	public static void main(String[] args) throws JAXBException, IOException {

		 Boolean anzeige = true;
		 int eingabe = 0;
	  
	    //xml_File in Datei speichern
	    File file = new File("src/Aufgabe3dSchokoladenkuchen.xml");
	    
	    //jaxb Objekt erstellen
	    JAXBContext context = JAXBContext.newInstance(Rezepte.class);
	    //Marshaller
	    Marshaller m = context.createMarshaller();
	    //Unmarshaller
	    Unmarshaller um = context.createUnmarshaller();
	    Rezepte r = (Rezepte) um.unmarshal(file);
	 
	    
	   //Menue
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
      public static void ausgabe(Rezepte r) {
    	  for (int i = 0; i<=r.getRezept().size() -1; i++){
    		  System.out.println("Rezept: ");
    		  System.out.println("Rezeptname" + r.getRezept().get(i).getRezeptname());
    		  System.out.println("Autor" + r.getRezept().get(i).getAutor());
    		  
    		  for (int j=0;j<=r.getRezept().get(i).getZutaten().getZutat().size() -1; j++){
    			  System.out.println("" + r.getRezept().get(i).getZutaten().getZutat().get(j).getMenge());
    			  System.out.println("" + r.getRezept().get(i).getZutaten().getZutat().get(j).getEinheit());
    			  System.out.println("" + r.getRezept().get(i).getZutaten().getZutat().get(j).getName());
    		  }
    		  System.out.println("Portionen:" + r.getRezept().get(i).getPortionen());
    		  
    		  System.out.println("Zubereitung\nArbeitszeit" + r.getRezept().get(i).getZubereitung().getArbeitszeit());
    		  System.out.println("Schwierigkeitsgrad" + r.getRezept().get(i).getZubereitung().getSchwierigkeitsgrad());
    		  System.out.println("Brennwert pP" + r.getRezept().get(i).getZubereitung().getBrennwertPP());
    		  System.out.println("\n\nZubereitung\nArbeitszeit" + r.getRezept().get(i).getZubereitung().getVorgänge());
    		  
    		  System.out.println("Kommentare\nName" + r.getRezept().get(i).getKommentieren().getName());
    		  System.out.println("Zeit:" + r.getRezept().get(i).getKommentieren().getZeit());
    		  System.out.println("Datum" + r.getRezept().get(i).getKommentieren().getDatum());
    		  System.out.println("Kommentar" + r.getRezept().get(i).getKommentieren().getKommentare());
    		  
    	  }
      }
    	  
    	
		
      
   // Neuen Kommentar einfuegen
      public static void eingeben(Rezepte r, File file, Marshaller m) throws IOException, JAXBException {

		Writer w = new FileWriter(file);
		String name;
		String kommentar;
		
		//Abfrage nach Rezept
		System.out.println("Welches Rezept?");
		int x = scanner.nextInt();
		if (x > r.getRezept().size()) {
            System.out.println("Rezept nicht vorhanden.");
        }
		
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
       // r.getRezept().get(0).getKommentieren().getKommentare().add(x, neuerKommentar);
		m.marshal(r,w);
  }
}