package questions;

import java.util.Locale;
import java.util.Scanner;

public class MenorePosição {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1180
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] list = new int[n];
		for(int i=0;i<n;i++) {
			list[i]=sc.nextInt();
		}
		int menorValor = list[0];
		int posicaoMenorValor = 0;
		// encontrar o menor e a posicao dele
		for(int i=0;i<n;i++) {
			if(menorValor>list[i]) {
				menorValor=list[i];
				posicaoMenorValor=i;
			}
			
			
		}
		System.out.printf("Menor valor: %d%n",menorValor);
		System.out.printf("Posicao: %d", posicaoMenorValor);
		
		sc.close();	
	}

}
