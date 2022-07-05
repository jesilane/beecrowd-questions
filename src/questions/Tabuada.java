package questions;

import java.util.Locale;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// beecrowd.com.br/judge/pt/problems/view/1078
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);  
		
		int N= sc.nextInt();
		for(int i =1;i<=10;i++){
			System.out.printf("%d x %d = %d%n",i,N,i*N);
		}
			
				
		
		sc.close();
	}

}
