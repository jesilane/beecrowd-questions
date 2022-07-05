package questions;

import java.util.Locale;
import java.util.Scanner;

public class DivisoresI {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1157
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		if(i%n==0 || n%i==0) {
			System.out.printf("%d%n", i);
		}
		}
			
		
		sc.close();
	

	}

}
