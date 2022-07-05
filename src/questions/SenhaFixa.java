package questions;

import java.util.Locale;
import java.util.Scanner;

public class SenhaFixa {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1114
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senhacerta= sc.nextInt();
		while(senhacerta!=2002) {
			System.out.println("Senha Invalida");
			senhacerta= sc.nextInt();
			
		}
		System.out.println("Acesso Permitido");
			
			
		sc.close();
	}

}
