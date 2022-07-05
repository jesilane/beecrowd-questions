package questions;

import java.util.Locale;
import java.util.Scanner;

public class SeisNúmerosÍmpares {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1070
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		int impares=0;
		x=sc.nextInt();
		while(impares<6) {
			if(x%2==1) {
				System.out.println(x);
				impares=impares+1;
			}
			x++;
		}
			sc.close();			
	}

}
