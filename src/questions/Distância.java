package questions;

import java.util.Locale;
import java.util.Scanner;

public class Distância {

	public static void main(String[] args) {
		// beecrowd.com.br/judge/pt/problems/view/1016
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt();
		int tempo = y*2;
		System.out.printf("%d minutos%n", tempo);
		
		
		sc.close();
	}

}
