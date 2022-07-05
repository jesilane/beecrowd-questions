package questions;

import java.util.Locale;
import java.util.Scanner;

public class OMaior {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1013
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
		int maior=0;
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
			
		if(a>b) {
			maior = a;
		}else {
			maior = b;
		}
		if(c>maior) {
			maior = c;
		
		}
			
		System.out.printf("%d eh o maior%n", maior);
			sc.close();
		
	}
}
