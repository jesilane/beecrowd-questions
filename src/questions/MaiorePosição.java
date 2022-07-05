package questions;

import java.util.Locale;
import java.util.Scanner;

public class MaiorePosição {

	public static void main(String[] args) {
		// // https://www.beecrowd.com.br/judge/pt/problems/view/1080
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int maior=0;
		int x;
		int posicao=0;
		for(int i=1;i<=5;i++) {
			x= sc.nextInt();
			if(x>maior) {
				maior=x;
				posicao=i;
			}
		}
		System.out.printf("%d%n",maior);
		System.out.printf("%d%n",posicao);
	sc.close();	
	}

}


	