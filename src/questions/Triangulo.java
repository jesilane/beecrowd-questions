package questions;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1043
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double Area=0;
		double Perimetro=0;
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		if((a<b+c) && (b<a+c) && (c<a+b)) {
			Perimetro = a +b + c;
			System.out.printf("Perimetro = %.1f%n", Perimetro);
			
		}else {
			Area=((a+b)*c/2);
			System.out.printf("Area = %.1f%n",Area );
		}	
		
	sc.close();
	}

}
