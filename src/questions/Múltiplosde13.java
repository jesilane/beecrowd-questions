package questions;

import java.util.Locale;
import java.util.Scanner;

public class Múltiplosde13 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1132
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int multiplos;
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x%y==13 || y%x==13) {
			multiplos=x+y;
			System.out.println(multiplos);
			
		}
		
	sc.close();
	}

}
