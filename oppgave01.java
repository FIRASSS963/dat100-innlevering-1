import java.util.Scanner;
public class oppgave01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println (" Skriv din intekt ");
		double intekt = scanner.nextDouble();
		double skatt = 0;
		if ( intekt >= 1467201 ) {
			skatt = skatt + ( intekt - 1467201 ) * 0.178;
		}
		if ( intekt >= 980101 ) {
			skatt = skatt + ( intekt - 980101 ) * 0.168;
		}
		if ( intekt >= 725051 ) {
			skatt = skatt + ( intekt - 725051 ) * 0.137;
		}
	    if ( intekt >= 318301 ) {
			skatt = skatt + ( intekt - 318301 ) * 0.04;
		}
		if ( intekt >= 226101 ) {
			skatt = skatt + ( intekt - 226101 ) * 0.017;
		}	
		if ( intekt < 226101 ) {
			skatt = 0;
		}
System.out.println ( "skatt" + "=" + skatt );
	}
}
