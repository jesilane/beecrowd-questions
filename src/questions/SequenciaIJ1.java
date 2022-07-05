package questions;

import java.util.Locale;
import java.util.Scanner;

public class SequenciaIJ1 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1095
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int vetor[] = null;
		for(int i=0;i<10;i++) {
			vetor[i] = sc.nextInt();
		}
		
		sc.close();
	}

}
