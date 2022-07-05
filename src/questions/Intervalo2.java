package questions;


import java.util.Locale;
import java.util.Scanner;

public class Intervalo2 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1072
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int in=0;
		int out=0;
		int n=sc.nextInt();
		for(int i =0;i<n;i++) {
			int x=sc.nextInt();
			if(x>=10 && x<=20) {
				in++;
			}else {
				out++;
			}
			}
		System.out.printf("%d in%n",in);
		System.out.printf("%d out%n",out);
	sc.close();
	}

}
