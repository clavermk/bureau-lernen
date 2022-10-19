
public class BankkontoTester {

	public static void main(String[] args) {
		Bankkonto konto1
        = new Bankkonto( "123", "Bob", 100 );
        

System.out.println( konto1.kontonummer + " " +
    konto1.kontoinhaber + " " + konto1.kontostand );
konto1.anzeigen();
konto1.verarbeiteEinzahlung(2000); 
konto1.verarbeitungAuszahlung(1500);
konto1.anzeigen();


Bankkonto konto2=
 new Bankkonto ("007", "James bond ", 50000);
konto2.anzeigen();
konto2.verarbeiteEinzahlung(70000);
konto2.verarbeitungAuszahlung(10000);
konto2.anzeigen();

	}

}
