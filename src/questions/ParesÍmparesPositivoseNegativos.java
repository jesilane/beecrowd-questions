package questions;

import java.util.Locale;
import java.util.Scanner;

public class ParesÍmparesPositivoseNegativos {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1066
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int negativo=0;
		int possitivo=0;
		int pares=0;
		int impar=0;
		for(int i =1;i<=5;i++) {
			int x=sc.nextInt();
			if(x%2==0) {
				pares++;
			}
			if(x%2==-1 || x%2==1 ) {
				impar++;
				}
			if(x>0) {
				possitivo++;
				}
			if(x<0) {
				negativo++;
				
			}
		}
	
	

	
		
			
		System.out.printf("%d valor(es) par(es)%n",pares );
		System.out.printf("%d valor(es) impar(es)%n", impar);
		System.out.printf("%d valor(es) positivo(s)%n", possitivo);
		System.out.printf("%d valor(es) negativo(s)%n", negativo);
sc.close();
	}

}
