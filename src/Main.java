
public class Main {

	public static void maain(String[] args) {
		
		Liste l = new Liste();
		
		l.fuegeEin("Hi");
		l.fuegeEin("Hallo");
		l.fuegeEin("Hello");
		
		l.zumAnfang();
		l.entferne();
		l.vor();
		
		l.fuegeEin("Tschuess");
		l.fuegeDavorEin("Hi");
		
		l.zumAnfang();
		
		l.ersetzeAktuelles("Halli Hallo");
		
		l.geheZuPosition(2);
		System.out.println(l.aktuellePosition());
		
		l.zumAnfang();
		
		l.haengeAn("Auf Wiedersehen!");
		while(!l.istDahinter()){
			System.out.println((String)l.aktuellesElement());
			l.vor();
		}
		
	}
	
}
