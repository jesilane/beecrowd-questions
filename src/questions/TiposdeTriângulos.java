package questions;

import java.util.Locale;
import java.util.Scanner;

public class TiposdeTriângulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		if((a<b+c) && (b<a+c) && (c<a+b)) {
			
		}
	sc.close();
	}

}
