//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.09 um 12:00:32 PM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Chefkoch }
     * 
     */
    public Chefkoch createChefkoch() {
        return new Chefkoch();
    }

    /**
     * Create an instance of {@link Chefkoch.Rezept }
     * 
     */
    public Chefkoch.Rezept createChefkochRezept() {
        return new Chefkoch.Rezept();
    }

    /**
     * Create an instance of {@link Chefkoch.Rezept.Allgemeines }
     * 
     */
    public Chefkoch.Rezept.Allgemeines createChefkochRezeptAllgemeines() {
        return new Chefkoch.Rezept.Allgemeines();
    }

    /**
     * Create an instance of {@link Chefkoch.Rezept.Zutaten }
     * 
     */
    public Chefkoch.Rezept.Zutaten createChefkochRezeptZutaten() {
        return new Chefkoch.Rezept.Zutaten();
    }

    /**
     * Create an instance of {@link Chefkoch.Rezept.Zubereitung }
     * 
     */
    public Chefkoch.Rezept.Zubereitung createChefkochRezeptZubereitung() {
        return new Chefkoch.Rezept.Zubereitung();
    }

    /**
     * Create an instance of {@link Chefkoch.Rezept.Kommentieren }
     * 
     */
    public Chefkoch.Rezept.Kommentieren createChefkochRezeptKommentieren() {
        return new Chefkoch.Rezept.Kommentieren();
    }

}
