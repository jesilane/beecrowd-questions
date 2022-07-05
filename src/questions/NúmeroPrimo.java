package questions;

import java.util.Locale;
import java.util.Scanner;

public class NúmeroPrimo {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1165
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			if(n%i==x) {
				System.out.printf("%d eh primo");
			}else {
				System.out.printf("%d nao eh primo");
			}
		}
		
		
	sc.close();
	}

}
