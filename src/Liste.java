
public class Liste {

	private class Element{
		
		private Object kenntInhalt;
        private Element kenntNachfolger;
        private int id;
        
        public Element(Object pInhalt, int id){
            kenntInhalt = pInhalt;
            kenntNachfolger = null;
            this.id = id;
        }
        
        public Object inhalt(){
            return kenntInhalt;
        }
        
        public Element nachfolger(){
            return kenntNachfolger;
        }
        
        public void setzeNachfolger(Element pNachfolger){
            kenntNachfolger = pNachfolger;
        }
		
	}
	
	private int zAnzahl = 0;
	
	private Element hatKopf = null;
	
	private Element hatZeiger = null;
	
	public void zumAnfang(){
		hatZeiger = hatKopf;
	}
	
	public void vor(){
		if(hatZeiger != null)
			hatZeiger = hatZeiger.nachfolger();
	}
	
	public boolean istDahinter(){
		return hatZeiger == null;
	}
	
	public Object aktuellesElement(){
		if(hatZeiger == null)
			return null;
		return hatZeiger.inhalt();
	}
	
	public void fuegeEin(Object element){
		if(hatKopf == null){
			hatKopf = new Element(element, zAnzahl);
			hatZeiger = hatKopf;
		}
		else{
			Element alterNachfolger = hatZeiger.kenntNachfolger;
			hatZeiger.setzeNachfolger(new Element(element, zAnzahl));
			hatZeiger.nachfolger().setzeNachfolger(alterNachfolger);
		}
		zAnzahl++;
	}
	
	public int laenge(){
		return zAnzahl;
	}
	
	public boolean istLeer(){
		return zAnzahl == 0;
	}
	
}
