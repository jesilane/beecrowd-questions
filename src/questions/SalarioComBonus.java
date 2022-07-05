package questions;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class SalarioComBonus {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1009
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in); 
		 
		 String nome = sc.nextLine();
		 double salariofixo = sc.nextDouble();
		 double vendasEmDinheiro = sc.nextDouble();
		 
		 double comissão= vendasEmDinheiro * 0.15;
		 double totalSalario = salariofixo + comissão;
		  
		 DecimalFormat df = new DecimalFormat("0.00");
		 System.out.println("TOTAL = R$ " + df.format(totalSalario));
		 
		 
		 
		 
		 

	}

}
