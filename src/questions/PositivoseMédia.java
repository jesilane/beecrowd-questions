package questions;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class PositivoseMédia {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1064
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		double soma=0;
		double media=0;
		int possitivo = 0;
		for(int i=0;i<6;i++) { 
			x = sc.nextDouble();
				if(x>0) {
					possitivo=possitivo+1;
					soma+=x;
			}
		}
		media=soma/possitivo;
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.printf("%d valores positivos%n", possitivo);
		System.out.printf(String.format("%.1f%n", media));
		sc.close();

	}

}
