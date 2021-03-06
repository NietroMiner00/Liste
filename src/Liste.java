
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
        
        public void setzeInhalt(Object element){
        	kenntInhalt = element;
        }
        
        public Element nachfolger(){
            return kenntNachfolger;
        }
        
        public void setzeNachfolger(Element pNachfolger){
            kenntNachfolger = pNachfolger;
        }
		
	}
	
	private int zAnzahl = 0;
	
	private int position = 0;
	
	private Element hatKopf = null;
	
	private Element hatVorgänger = null;
	private Element hatZeiger = null;
	
	public void zumAnfang(){
		hatZeiger = hatKopf;
		hatVorgänger = null;
		position = 0;
	}
	
	public void vor(){
		if(hatZeiger != null){
			hatVorgänger = hatZeiger;
			hatZeiger = hatZeiger.nachfolger();
			position++;
		}else{
			zumAnfang();
		}
	}
	
	public void geheZuPosition(int index){
		while(position != index)
			vor();
	}
	
	public int aktuellePosition(){
		return position;
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
	
	public void fuegeDavorEin(Object element){
		if(hatKopf == null){
			hatKopf = new Element(element, zAnzahl);
			hatZeiger = hatKopf;
		}
		else{
			Element alterNachfolger = hatZeiger;
			hatVorgänger.setzeNachfolger(new Element(element, zAnzahl));
			hatVorgänger.nachfolger().setzeNachfolger(alterNachfolger);
		}
		zAnzahl++;
	}
	
	public void haengeAn(Object element){
		int letztePosition = position;
		while(!istDahinter())
			vor();
		fuegeDavorEin(element);
		geheZuPosition(letztePosition);
	}
	
	public void entferne(){
		if(hatZeiger == null)
			return;
		else if(hatVorgänger != null){
			Element neuerNachfolger = hatZeiger.nachfolger();
			hatVorgänger.setzeNachfolger(neuerNachfolger);
			hatZeiger = hatVorgänger.nachfolger();
		}
		else{
			hatKopf = hatKopf.nachfolger();
			
		}
		zAnzahl--;
	}
	
	public void ersetzeAktuelles(Object element){
		hatZeiger.setzeInhalt(element);
	}
	
	public int laenge(){
		return zAnzahl;
	}
	
	public boolean istLeer(){
		return zAnzahl == 0;
	}
	
}
