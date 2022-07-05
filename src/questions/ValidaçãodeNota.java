package questions;

import java.util.Locale;
import java.util.Scanner;

public class ValidaçãodeNota {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1117
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma=0;
		double cont=0;
		while(true) {
			double davez= sc.nextDouble();
			if(davez>=0 && davez<=10) {
				soma+=davez;
				cont++;
			}else {
				System.out.println("nota invalida");
			}
			if(cont==2)break;
		}
		System.out.printf("media = %.2f%n",soma/2);
		sc.close();
	}

}
