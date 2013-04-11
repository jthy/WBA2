package generated;

import generated.Chefkoch.Rezept.*;
import generated.Rezept;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class Aufgabe4_b {

  private static final String REZEPT_XML = "./Aufgabe3dSchokoladenkuchen.xml";

  public static void main(String[] args) throws JAXBException, IOException {

    ArrayList<Rezept> rezeptListe = new ArrayList<Rezept>();

    //Rezepte erstellen
    Rezept rezept1 = new Rezept();
    rezept1.getAllgemeines();
    rezept1.getZutaten();
    rezept1.getPortionen();
    rezept1.getZubereitung();
    rezept1.getKommentieren();
    rezeptListe.add(rezept1);
    
    //Allgemeines festlegen
    Allgemeines allgemeines1 = new Allgemeines();
    allgemeines1.getRezeptname();
    allgemeines1.getAutor();
    
    //Zutaten festlegen
    Zutaten zutat1 = new Zutaten();
    zutat1.getZutat();
    zutat1.getGewicht();
    zutat1.getEinheit();
    
    //Zubereitung festlegen 
    Zubereitung zubereitung1 = new Zubereitung();
    zubereitung1.getArbeitszeit();
    zubereitung1.getSchwierigkeitsgrad();
    zubereitung1.getBrennwertPP();
    zubereitung1.getVorgänge();
    
    //Kommentare eingeben
    Kommentieren kommentar1 = new Kommentieren();
    kommentar1.getName();
    kommentar1.getDatum();
    kommentar1.getZeit();
    kommentar1.getKommentare();
    kommentar1.getKommentarHilfreich();
    

   // create JAXB context and instantiate marshaller
    JAXBContext context = JAXBContext.newInstance(Rezept.class);
    Marshaller m = context.createMarshaller();
    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

    // Write to System.out
    m.marshal(rezept1, System.out);
   

    // Write to File
     m.marshal(rezept1, new File("src/ausgaben.xml"));
    
    Writer w = null; 
    try { 
      w = new FileWriter( "src/ausgabe.xml" ); 
      m.marshal( rezept1, w ); 
    } 
    finally { 
      try { w.close(); } catch ( Exception e ) { } 
    }

    // get variables from our xml file, created before
    System.out.println();
    System.out.println("Ausgabe der XML-Datei: ");
    Unmarshaller um = context.createUnmarshaller();
    Rezept r = (Rezept) um.unmarshal(new File("src/Aufgabe3dSchokoladenkuchen.xml"));
   // ArrayList<Rezept> list = r.get();
//    for (Rezept rezepttest : list) {
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
		
		/*System.out.println("\nneuer Kommentar \n Name:" + kommentarneu.getName()
				+			"\n Zeit:" +kommentarneu.getZeit()
				+			"\n Datum:" +kommentarneu.getDatum()
				+			"\n Kommentar:" +kommentarneu.getKommentare()
				+			"\n Kommentar hilfreich?:" +kommentarneu.getKommentarHilfreich());	*/
	
		 
		Scanner scanner = new Scanner(System.in);
		
		 Kommentieren kommentarneu= new Kommentieren();
		    System.out.print("Name: ");
		    kommentarneu.name = scanner.nextLine();
		    //System.out.print("Zeit: ");
		    //kommentarneu.zeit = scanner.next();
		    //System.out.print("Datum: ");
		    //kommentarneu.datum = scanner.nextLine();
		    System.out.print("Kommentar: ");
		    kommentarneu.kommentare = scanner.nextLine();
		    //System.out.print("Kommentar hilfreich?: ");
		    //kommentarneu.kommentarHilfreich = scanner.nextLine();
		    System.out.print("Danke für Deinen Kommentar!");
		
  }
}