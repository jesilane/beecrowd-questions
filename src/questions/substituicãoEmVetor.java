package questions;

import java.util.Locale;
import java.util.Scanner;

public class substituicãoEmVetor {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int[] numeros = new int[10];
		for(int i =0;i<10;i++){
			numeros[i] = sc.nextInt();
		}
		for(int i =0;i<10;i++){
			// verificar se o numero é menor ou igual a 0
				// se for menor ou igual a 0, o valor de numeros[i] = 1
			if(numeros[i]<=0) {
				numeros[i] = 1;
			}
			
			System.out.printf("X[%d] = %d%n",i ,numeros[i]);
		}
		
		sc.close();
	}

}    
	
