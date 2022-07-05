package questions;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1154
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int soma=0;
		int quantidade=0;
		double media=0;
		int n=0;
		while(n>=0) {
			n=sc.nextInt();
			if(n>=0) {
				
				soma=soma+n;
				quantidade++;
				
			}
		}
	
	media = soma/quantidade;
	System.out.printf(String.format("%.2f%n",media));
	sc.close();
	}

}
