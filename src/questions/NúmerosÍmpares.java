package questions;

import java.util.Locale;
import java.util.Scanner;

public class NúmerosÍmpares {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1067
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int impar=0;
		int x = sc.nextInt();
		for(int i=1;i<=x;i++) {
			if(i%2==1) {
				impar=impar+1;
				System.out.printf("%d%n", i);
			
			}
		}
		
		sc.close();
	}

}
