package questions;

import java.util.Locale;
import java.util.Scanner;

public class Resto2 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1075
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		for(int i=1;i<=10000;i++) {
			if(i%n==2) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
	}

}
