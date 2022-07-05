package questions;

import java.util.Locale;
import java.util.Scanner;

public class VaiTerCopa {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1564
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n==0) {
				System.out.println("vai ter copa");
			} else {
				System.out.println("vai ter duas!");
			}
		}
		sc.close();
	}

}
