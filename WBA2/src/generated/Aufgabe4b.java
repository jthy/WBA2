package generated;

import generated.Rezept.*;
import generated.ObjectFactory;

import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class Aufgabe4b {

  private static final String REZEPT_XML = "WBA2/src/.xml";

  public static void main(String[] args) throws JAXBException, IOException {

    ArrayList<Rezept> RezeptList = new ArrayList<Rezept>();

   //Allgemeines einlesen
    Allgemeines Allgemeines1 = new Allgemeines();
    Allgemeines1.setRezeptname("Lenchen's Schokoladenkuchen");
    Allgemeines1.setAutor("schnuebi");
    
    //Zutaten einlesen
    Zutaten Zutat1 = new Zutaten();
    Zutat1.setZutat("Butter");
    Zutat1.setGewicht(200);
    Zutat1.setEinheit("g");
    
    Zutaten Zutat2 = new Zutaten();
    Zutat2.setZutat("Zucker");
    Zutat2.setGewicht(200);
    Zutat2.setEinheit("g");
    
    Zutaten Zutat3 = new Zutaten();
    Zutat3.setZutat("Schokolade, Blockschokolade");
    Zutat3.setGewicht(200);
    Zutat3.setEinheit("g");
    
    Zutaten Zutat4 = new Zutaten();
    Zutat4.setZutat("Mehl");
    Zutat4.setGewicht(120);
    Zutat4.setEinheit("g");
    
    Zutaten Zutat5 = new Zutaten();
    Zutat5.setZutat("Backpulver");
    Zutat5.setGewicht(0.5);
    Zutat5.setEinheit("TL");
    
    Zutaten Zutat6 = new Zutaten();
    Zutat6.setZutat("Vanillezucker");
    Zutat6.setGewicht(1);
    Zutat6.setEinheit("Pkt");
    
    Zutaten Zutat7 = new Zutaten();
    Zutat7.setZutat("Ei(er)");
    Zutat7.setGewicht(4);
    Zutat7.setEinheit("");
    
    //Zubereitungsangaben einlesen
    Zubereitung Zubereitung1= new Zubereitung();
    Zubereitung1.setArbeitszeit(01:00:00);
    Zubereitung1.setSchwierigkeitsgrad("normal");
    Zubereitung1.setBrennwertPP(295);
    Zubereitung1.setVorgänge("Butter und Schokolade im Wasserbad schmelzen. Eier trennen. Eiweiß steif schlagen. Eigelbe, Zucker und Vanillezucker verrühren. Geschmolzene Butter-Schokomasse hinzufügen und mischen. Mehl mit dem Backpulver in die Masse sieben und zum Schluss die steifen Eiweiße vorsichtig unterheben. In eine gut gefettete Form geben. Bei 180°Grad 40 – 50 Minuten backen.");
    
    //Kommentare einlesen
    Kommentieren Kommentieren1= new Kommentieren();
    Kommentieren1.setName("swieselchen");
    Kommentieren1.setDatum(2002-02-07);
    Kommentieren1.setZeit(18:49:00);
    Kommentieren1.setKommentare("Habe Deinen Kuchen gestern gebacken (kleine Abwandlung: statt Blockschokolade hatte ich nur Kuvertüre, zartbitter und ich habe noch etwas Rumaroma und eine Prise Salz dazugegeben) mein LAG war total begeistert. Ich übrigends auch, super Rezept.");
    Kommentieren1.setKommentarHilfreich("ja");
    
   
    //Rezept erstellen
    Rezept Rezept1 = new Rezept();
    Rezept1.setAllgemeines(Allgemeines1);
    Rezept1.setZutaten(Zutat1);
    Rezept1.setZutaten(Zutat2);
    Rezept1.setZutaten(Zutat3);
    Rezept1.setZutaten(Zutat4);
    Rezept1.setZutaten(Zutat5);
    Rezept1.setZutaten(Zutat6);
    Rezept1.setZutaten(Zutat7);
    Rezept1.setPortionen(16);
    Rezept1.setZubereitung(Zubereitung1);
    Rezept1.setKommentieren(Kommentieren1);
    
    //Rezept in Liste aller Rezepte hinzufügen
    RezeptList.add(Rezept1);

    //JAXB-Kontent erstellen und Marshaller initialisieren
    JAXBContext context = JAXBContext.newInstance(Rezept.class);
    Marshaller m = context.createMarshaller();
    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

    // Write to System.out
    m.marshal(Rezept1, System.out);

    // Write to File
    m.marshal(Rezept1, new File(REZEPT_XML));

    // get variables from our xml file, created before
    System.out.println();
    System.out.println("Output from our XML File: ");
    Unmarshaller um = context.createUnmarshaller();
    Rezept Rezept2 = (Rezept) um.unmarshal(new FileReader(REZEPT_XML));
    ArrayList<Rezept> list = Rezept2.getAllgemeines();
    for (Rezept rezept : list) {
      System.out.println("Rezept: ");
    }
  }
} 