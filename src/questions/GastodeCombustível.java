package questions;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class GastodeCombustível {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1017
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		
		int tempogasto=sc.nextInt();
		int velomedia=sc.nextInt();
		
		int kmtotal=tempogasto*velomedia;
		double consumo=kmtotal/12.0;
		System.out.printf("%.3f%n", consumo);
		sc.close();
	}

}
