package questions;
import java.util.Locale;
import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1007
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 int A, B, C, D;
		 A = sc.nextInt();
		 B = sc.nextInt();
		 C = sc.nextInt();
		 D = sc.nextInt();
		 
		 double diferenca = A*B - C*D;
			   
				
				
		 System.out.printf("DIFERENCA = %.0f\n", diferenca);
				 
		 sc.close();
				 
	}

}


	