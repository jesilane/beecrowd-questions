package questions;

import java.util.Locale;
import java.util.Scanner;

public class DistânciaEntreDoisPontos {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1015
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);  
		double x1= sc.nextDouble();
		double y1= sc.nextDouble();
		double x2= sc.nextDouble();
		double y2= sc.nextDouble();
		
		double distancia= Math.sqrt(Math.pow((x2-x1),2.0)+ Math.pow((y2-y1),2.0));
		System.out.printf("%.4f%n", distancia);
		
		sc.close();
	}

}
