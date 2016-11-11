import sum.komponenten.*;
import sum.werkzeuge.*;

import java.awt.Color;

import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung{
	
    private Etikett hatEtikettElement;
    private Textfeld hatNeuesElement;
    private Etikett hatEtikettPosition;
    private Textfeld hatNeuePosition;
    private Knopf hatKnopfHinzufuegen;
    private Knopf hatKnopfErsetzen;
    private Knopf hatKnopfVor;
    private Knopf hatKnopfZumAnfang;
    private Zeichenbereich liste;
    private Knopf hatKnopfBeenden;
    
    private Liste l;

    public SuMAnwendung(){
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
        
        liste = new Zeichenbereich(153, 92, 129, 280, "");
        
        hatKnopfBeenden = new Knopf(37, 346, 100, 25, "Beenden");
        hatKnopfBeenden.setzeBearbeiterGeklickt("hatKnopfBeendenGeklickt");
        
        l = new Liste();
    }

    public void hatKnopfHinzufuegenGeklickt(){
    	if(hatNeuePosition.inhaltAlsText().equals(""))
    		l.fuegeEin(hatNeuesElement.inhaltAlsText());
    	else{
    		l.geheZuPosition(hatNeuePosition.inhaltAlsGanzeZahl());
    		l.fuegeEin(hatNeuesElement.inhaltAlsText());
    	}
    	darstellen();
    }

    public void hatKnopfErsetzenGeklickt(){
    	if(hatNeuePosition.inhaltAlsText().equals(""))
     	   l.ersetzeAktuelles(hatNeuesElement.inhaltAlsText());
        else{
     	   l.geheZuPosition(hatNeuePosition.inhaltAlsGanzeZahl());
     	   l.ersetzeAktuelles(hatNeuesElement.inhaltAlsText());
        }
    	darstellen();
    }

    public void hatKnopfVorGeklickt(){
        l.vor();
    	darstellen();
    }

    public void hatKnopfZumAnfangGeklickt(){
        l.zumAnfang();
    	darstellen();
    }

    public void hatKnopfBeendenGeklickt(){
        beenden();
    }
    
    public void darstellen(){
    	liste.setzeInhalt("");
    	int aktuellePosition = l.aktuellePosition();
    	l.zumAnfang();
    	while(!l.istDahinter()){
    		if(l.aktuellePosition() == aktuellePosition)
    			liste.haengeAn("*");
    		liste.haengeAn((String)l.aktuellesElement() + "\n");
    		l.vor();
    	}
    	l.geheZuPosition(aktuellePosition);
    	
    	//Dokument zurücksetzen
    	hatNeuesElement.setzeInhalt("");
    	hatNeuePosition.setzeInhalt("");
    }
}
