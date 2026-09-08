import java.util.Scanner;
public class oppgave03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int resultet = 1;
		System.out.println ( " skriv inn en tall > 0 " );
		int tall;
		tall = scanner.nextInt();
		int i;
		for ( i = 1; i <= tall; i++ ) {
			resultet = resultet * i;
		}
System.out.println ( tall + "!" + "=" + resultet );
		}
}