package questions;

import java.util.Locale;
import java.util.Scanner;

public class ParesentreCincoNúmeros {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1065
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int par = 0; 
		for(int i=0;i<5;i++) {
			int x = sc.nextInt();
			if(x%2==0) {
				par = par +1;
			}
			
		}
		System.out.printf("%d valores pares%n", par);
		sc.close();
	}

}
