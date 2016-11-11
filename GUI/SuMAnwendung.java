/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 11.11.2016
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettElement;
    private Textfeld hatNeuesElement;
    private Etikett hatEtikettPosition;
    private Textfeld hatNeuePosition;
    private Knopf hatKnopfHinzufuegen;
    private Knopf hatKnopfErsetzen;
    private Knopf hatKnopfVor;
    private Knopf hatKnopfZumAnfang;
    private Tabelle hatTabelle1;
    private Knopf hatKnopfBeenden;

    // Attribute

/**
 * Konstruktor
 */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(311, 408);

        hatEtikettElement = new Etikett(23, 23, 47, 25, "Element:");
        // Ausrichtung
        hatEtikettElement.setzeAusrichtung(Ausrichtung.LINKS);
        hatNeuesElement = new Textfeld(75, 23, 100, 25, "");
        // Ausrichtung
        hatNeuesElement.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettPosition = new Etikett(23, 58, 47, 25, "Position:");
        // Ausrichtung
        hatEtikettPosition.setzeAusrichtung(Ausrichtung.LINKS);
        hatNeuePosition = new Textfeld(75, 58, 100, 25, "");
        // Ausrichtung
        hatNeuePosition.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfHinzufuegen = new Knopf(182, 23, 100, 25, "Hinzufuegen");
        hatKnopfHinzufuegen.setzeBearbeiterGeklickt("hatKnopfHinzufuegenGeklickt");
        hatKnopfErsetzen = new Knopf(182, 58, 100, 25, "Ersetzen");
        hatKnopfErsetzen.setzeBearbeiterGeklickt("hatKnopfErsetzenGeklickt");
        hatKnopfVor = new Knopf(38, 122, 105, 25, "Vor");
        hatKnopfVor.setzeBearbeiterGeklickt("hatKnopfVorGeklickt");
        hatKnopfZumAnfang = new Knopf(39, 93, 104, 25, "Zum Anfang");
        hatKnopfZumAnfang.setzeBearbeiterGeklickt("hatKnopfZumAnfangGeklickt");
        hatTabelle1 = new Tabelle(153, 92, 129, 280, 3, 3);
        hatKnopfBeenden = new Knopf(37, 346, 100, 25, "Beenden");
        hatKnopfBeenden.setzeBearbeiterGeklickt("hatKnopfBeendenGeklickt");
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfHinzufuegen fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfHinzufuegenGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfErsetzen fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfErsetzenGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfVor fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfVorGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfZumAnfang fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfZumAnfangGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfBeenden fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfBeendenGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

}
