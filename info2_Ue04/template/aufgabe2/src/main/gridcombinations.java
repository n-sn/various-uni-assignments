package main;
public class gridcombinations {

	
	//gibt die Anzahl gueltiger Belegungen fuer ein bestimmtes n zurueck, 
	//indem alle Moeglichkeiten fuer jede Anzahl von Spielsteinen getestet wird.
	public static int gueltigeBelegungen(int n){
		//Anzahl der gueltigen Belegungen:
		int possibilities = 0;
		//TODO a)
		return possibilities;
		
	}
	
	//alle moeglichen Kombinationen von Platzierungen finden (unabhaengig davon ob gueltig oder nicht)
	public static int moeglichkeiten(int i, int n, int startX, boolean[] feld){
		//Anzahl der bereits gefundenen gueltigen Belegungen
		int poss = 0;
		//TODO b)
		return poss;
	}
	
	//pruefen ob eine Belegung des Schachbrettes gueltig ist
	public static boolean gueltig(boolean[] feld, int n){
		//TODO c)
		return true;
	}
	
	
	public static void main(String[] args) {
		//groesse des Schachbretts 
		int n = 1;
		
		System.out.println("Fuer die Brettgroesse " +n+" x "+n+" gibt es "+gueltigeBelegungen(n)+" gueltige Belegungen.");
		
	
	}

}
