
public class Main {

	public static void main(String[] args) {
		
		Liste l = new Liste();
		
		l.fuegeEin("Hi");
		l.fuegeEin("Hallo");
		l.fuegeEin("Hello");
		
		l.zumAnfang();
		l.entferne();
		l.vor();
		
		l.fuegeEin("Tschuess");
		
		l.zumAnfang();
		while(!l.istDahinter()){
			System.out.println((String)l.aktuellesElement());
			l.vor();
		}
		
	}
	
}
