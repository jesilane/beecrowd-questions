package questions;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class NúmerosPositivos {

	public static void main(String[] args) {
		// beecrowd.com.br/judge/pt/problems/view/1060
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);  
		
		double x;
		int possitivo = 0;
		for(int i=0;i<6;i++) { 
			x = sc.nextDouble();
				if(x>0) {
					possitivo=possitivo+1;
			}
		}
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.printf("%d valores positivos%n", possitivo);
		
		sc.close();

	}

}
