import java.util.Scanner;
public class oppgave02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		for ( int i = 1; i <= 10; i++ ){
		System.out.println (" Skriv din poingsum ");
		double poingsum = scanner.nextDouble();
		while ( poingsum > 100 || poingsum < 0 ) {
			System.out.println ( "Skriv inn på nytt mellom 0 og 100 " );
			poingsum = scanner.nextDouble();
		}
		if ( poingsum >= 90 ) {
			System.out.println ( "din karakter = A" );
		}
		else if ( poingsum >= 80 ) {
			System.out.println ( "din karakter = B" );
		}
		else if ( poingsum >= 60 ) {
			System.out.println ( "din karakter = c" );
		}
		else if ( poingsum >= 50 ) {
			System.out.println ( "din karakter = D" );
		}
		else if ( poingsum >= 40 ) {
			System.out.println ( "din karakter = E" );
		}
		else {
			System.out.println ( "din karakter = F" );
		}
		}
	}
}