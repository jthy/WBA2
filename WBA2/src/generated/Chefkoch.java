//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.09 um 12:00:32 PM CEST 
//


package generated;

import java.math.BigInteger;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rezept">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Allgemeines">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Rezeptname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Autor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Zutaten">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Zutat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Gewicht" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="Einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Portionen">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Zubereitung">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Arbeitszeit" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *                             &lt;element name="Schwierigkeitsgrad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Brennwert-p.P" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="Vorgänge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Kommentieren">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="Zeit" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *                             &lt;element name="Kommentare" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Kommentar_hilfreich">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="ja|nein"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rezept"
})
@XmlRootElement(name = "Chefkoch")
public class Chefkoch {

    @XmlElement(name = "Rezept", required = true)
    protected ArrayList<generated.Rezept> rezept;

    /**
     * Ruft den Wert der rezept-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Chefkoch.Rezept }
     *     
     */
    public ArrayList<generated.Rezept> getRezept() {
        return rezept;
    }

    /**
     * Legt den Wert der rezept-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Chefkoch.Rezept }
     *     
     */
    public void setRezept(ArrayList<generated.Rezept> value) {
        this.rezept = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Allgemeines">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Rezeptname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Autor" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Zutaten">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Zutat" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Gewicht" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="Einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Portionen">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Zubereitung">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Arbeitszeit" type="{http://www.w3.org/2001/XMLSchema}time"/>
     *                   &lt;element name="Schwierigkeitsgrad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Brennwert-p.P" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="Vorgänge" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Kommentieren">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="Zeit" type="{http://www.w3.org/2001/XMLSchema}time"/>
     *                   &lt;element name="Kommentare" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Kommentar_hilfreich">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="ja|nein"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "allgemeines",
        "zutaten",
        "portionen",
        "zubereitung",
        "kommentieren"
    })
    public static class Rezept {

        @XmlElement(name = "Allgemeines", required = true)
        protected Chefkoch.Rezept.Allgemeines allgemeines;
        @XmlElement(name = "Zutaten", required = true)
        protected Chefkoch.Rezept.Zutaten zutaten;
        @XmlElement(name = "Portionen")
        protected int portionen;
        @XmlElement(name = "Zubereitung", required = true)
        protected Chefkoch.Rezept.Zubereitung zubereitung;
        @XmlElement(name = "Kommentieren", required = true)
        protected Chefkoch.Rezept.Kommentieren kommentieren;

        /**
         * Ruft den Wert der allgemeines-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Chefkoch.Rezept.Allgemeines }
         *     
         */
        public Chefkoch.Rezept.Allgemeines getAllgemeines() {
            return allgemeines;
        }

        /**
         * Legt den Wert der allgemeines-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Chefkoch.Rezept.Allgemeines }
         *     
         */
        public void setAllgemeines(Chefkoch.Rezept.Allgemeines value) {
            this.allgemeines = value;
        }

        /**
         * Ruft den Wert der zutaten-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Chefkoch.Rezept.Zutaten }
         *     
         */
        public Chefkoch.Rezept.Zutaten getZutaten() {
            return zutaten;
        }

        /**
         * Legt den Wert der zutaten-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Chefkoch.Rezept.Zutaten }
         *     
         */
        public void setZutaten(Chefkoch.Rezept.Zutaten value) {
            this.zutaten = value;
        }

        /**
         * Ruft den Wert der portionen-Eigenschaft ab.
         * 
         */
        public int getPortionen() {
            return portionen;
        }

        /**
         * Legt den Wert der portionen-Eigenschaft fest.
         * 
         */
        public void setPortionen(int value) {
            this.portionen = value;
        }

        /**
         * Ruft den Wert der zubereitung-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Chefkoch.Rezept.Zubereitung }
         *     
         */
        public Chefkoch.Rezept.Zubereitung getZubereitung() {
            return zubereitung;
        }

        /**
         * Legt den Wert der zubereitung-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Chefkoch.Rezept.Zubereitung }
         *     
         */
        public void setZubereitung(Chefkoch.Rezept.Zubereitung value) {
            this.zubereitung = value;
        }

        /**
         * Ruft den Wert der kommentieren-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Chefkoch.Rezept.Kommentieren }
         *     
         */
        public Chefkoch.Rezept.Kommentieren getKommentieren() {
            return kommentieren;
        }

        /**
         * Legt den Wert der kommentieren-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Chefkoch.Rezept.Kommentieren }
         *     
         */
        public void setKommentieren(Chefkoch.Rezept.Kommentieren value) {
            this.kommentieren = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Rezeptname" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Autor" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "rezeptname",
            "autor"
        })
        public static class Allgemeines {

            @XmlElement(name = "Rezeptname", required = true)
            protected String rezeptname;
            @XmlElement(name = "Autor", required = true)
            protected String autor;

            /**
             * Ruft den Wert der rezeptname-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRezeptname() {
                return rezeptname;
            }

            /**
             * Legt den Wert der rezeptname-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRezeptname(String value) {
                this.rezeptname = value;
            }

            /**
             * Ruft den Wert der autor-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAutor() {
                return autor;
            }

            /**
             * Legt den Wert der autor-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAutor(String value) {
                this.autor = value;
            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="Zeit" type="{http://www.w3.org/2001/XMLSchema}time"/>
         *         &lt;element name="Kommentare" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="Kommentar_hilfreich">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="ja|nein"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "datum",
            "zeit",
            "kommentare"
        })
        public static class Kommentieren {

            @XmlElement(name = "Name", required = true)
            protected String name;
            @XmlElement(name = "Datum", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar datum;
            @XmlElement(name = "Zeit", required = true)
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar zeit;
            @XmlElement(name = "Kommentare", required = true)
            protected String kommentare;
            @XmlAttribute(name = "Kommentar_hilfreich")
            protected String kommentarHilfreich;

            /**
             * Ruft den Wert der name-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Legt den Wert der name-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Ruft den Wert der datum-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDatum() {
                return datum;
            }

            /**
             * Legt den Wert der datum-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDatum(XMLGregorianCalendar value) {
                this.datum = value;
            }

            /**
             * Ruft den Wert der zeit-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getZeit() {
                return zeit;
            }

            /**
             * Legt den Wert der zeit-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setZeit(XMLGregorianCalendar value) {
                this.zeit = value;
            }

            /**
             * Ruft den Wert der kommentare-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKommentare() {
                return kommentare;
            }

            /**
             * Legt den Wert der kommentare-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKommentare(String value) {
                this.kommentare = value;
            }

            /**
             * Ruft den Wert der kommentarHilfreich-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKommentarHilfreich() {
                return kommentarHilfreich;
            }

            /**
             * Legt den Wert der kommentarHilfreich-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKommentarHilfreich(String value) {
                this.kommentarHilfreich = value;
            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Arbeitszeit" type="{http://www.w3.org/2001/XMLSchema}time"/>
         *         &lt;element name="Schwierigkeitsgrad" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Brennwert-p.P" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="Vorgänge" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "arbeitszeit",
            "schwierigkeitsgrad",
            "brennwertPP",
            "vorg\u00e4nge"
        })
        public static class Zubereitung {

            @XmlElement(name = "Arbeitszeit", required = true)
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar arbeitszeit;
            @XmlElement(name = "Schwierigkeitsgrad", required = true)
            protected String schwierigkeitsgrad;
            @XmlElement(name = "Brennwert-p.P", required = true)
            protected BigInteger brennwertPP;
            @XmlElement(name = "Vorg\u00e4nge", required = true)
            protected String vorgänge;

            /**
             * Ruft den Wert der arbeitszeit-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getArbeitszeit() {
                return arbeitszeit;
            }

            /**
             * Legt den Wert der arbeitszeit-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setArbeitszeit(XMLGregorianCalendar value) {
                this.arbeitszeit = value;
            }

            /**
             * Ruft den Wert der schwierigkeitsgrad-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchwierigkeitsgrad() {
                return schwierigkeitsgrad;
            }

            /**
             * Legt den Wert der schwierigkeitsgrad-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchwierigkeitsgrad(String value) {
                this.schwierigkeitsgrad = value;
            }

            /**
             * Ruft den Wert der brennwertPP-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getBrennwertPP() {
                return brennwertPP;
            }

            /**
             * Legt den Wert der brennwertPP-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setBrennwertPP(BigInteger value) {
                this.brennwertPP = value;
            }

            /**
             * Ruft den Wert der vorgänge-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVorgänge() {
                return vorgänge;
            }

            /**
             * Legt den Wert der vorgänge-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVorgänge(String value) {
                this.vorgänge = value;
            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Zutat" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Gewicht" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="Einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "zutat",
            "gewicht",
            "einheit"
        })
        public static class Zutaten {

            @XmlElement(name = "Zutat", required = true)
            protected String zutat;
            @XmlElement(name = "Gewicht", required = true)
            protected BigInteger gewicht;
            @XmlElement(name = "Einheit", required = true)
            protected String einheit;

            /**
             * Ruft den Wert der zutat-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZutat() {
                return zutat;
            }

            /**
             * Legt den Wert der zutat-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZutat(String value) {
                this.zutat = value;
            }

            /**
             * Ruft den Wert der gewicht-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getGewicht() {
                return gewicht;
            }

            /**
             * Legt den Wert der gewicht-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setGewicht(BigInteger value) {
                this.gewicht = value;
            }

            /**
             * Ruft den Wert der einheit-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEinheit() {
                return einheit;
            }

            /**
             * Legt den Wert der einheit-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEinheit(String value) {
                this.einheit = value;
            }

        }

    }

}
