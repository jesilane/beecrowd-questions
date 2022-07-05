package questions;

import java.util.Locale;
import java.util.Scanner;

public class QuadradodePares {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1073
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quadrado=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				quadrado=i*i;
				System.out.printf("%d^2 = %d%n",i,quadrado);
				
			}
		}
sc.close();
	}

}
