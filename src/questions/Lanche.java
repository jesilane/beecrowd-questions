package questions;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1038
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		
		double preco = 0;
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		switch(codigo){
			case 1: 
				preco = 4.00;
				System.out.println("Total: R$ "+ df.format(quantidade*preco));
				break;
			case 2:
				preco = 4.50;
				System.out.println("Total: R$ "+  df.format(quantidade*preco));
				break;
			case 3:
				preco = 5.00;
				System.out.println("Total: R$ "+  df.format(quantidade*preco));
				break;
			case 4:
				preco = 2.00;
				System.out.println("Total: R$ "+  df.format(quantidade*preco));
				break;
			case 5:
				preco = 1.50;
				System.out.println("Total: R$ "+  df.format(quantidade*preco));
				break;
				
			default:
				break;
			
		}
		
		sc.close();

	}

}
