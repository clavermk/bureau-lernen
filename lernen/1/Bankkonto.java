
public class Bankkonto {
	// Instanzvariablen
	  String kontonummer;
	  String kontoinhaber;
	  int    kontostand;

	  // Konstruktoren
	  Bankkonto( String ktoNummer, String ktoInhaber, int start )
	  {
		    kontonummer  = ktoNummer;
		    kontoinhaber = ktoInhaber;
		    kontostand   = start;
		  }

		  // Methoden
	  int getKontostand()
	  {
	     return kontostand;
	  }
	  int verarbeiteEinzahlung( int betrag )
	  {
	    kontostand = kontostand + betrag;
	    return kontostand;
	  }
	  void anzeigen()
	  {
	    System.out.println( kontonummer + "\t" + kontoinhaber + "\t" + kontostand );
	  }
	  void verarbeitungAuszahlung ( int betrag ) {
	  int gebühr;
	      if (kontostand<10000) {
	    	  gebühr=15;
	    	  kontostand = kontostand-betrag -gebühr;
	      }
	      else {
	    	  gebühr=0;
	    	  kontostand = kontostand-betrag -gebühr;
	      }
	      }
	  
	  
		}

