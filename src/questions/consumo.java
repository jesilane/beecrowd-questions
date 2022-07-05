package questions;

import java.util.Locale;
import java.util.Scanner;

public class consumo {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1014
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int x = sc.nextInt();
		double y = sc.nextDouble();
		double consumomedio = (x/y);
		System.out.printf("%.3f km/l%n ", consumomedio);
		
		sc.close();
	}

}
