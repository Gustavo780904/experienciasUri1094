import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, quantia, totalCobaias, i;
		double percentualCoelhos, percentualRatos, percentualSapos;
		int totalCoelhos = 0, totalRatos = 0, totalSapos = 0;
		char cobaia;

		N = sc.nextInt();

		for (i = 0; i < N; i++) {
			quantia = sc.nextInt();
			cobaia = sc.next().charAt(0);
			if (cobaia == 'C') {
				totalCoelhos = totalCoelhos + quantia;
			} else if (cobaia == 'R') {
				totalRatos = totalRatos + quantia;
			} else if (cobaia == 'S'){
				totalSapos = totalSapos + quantia;
			}
		}
		totalCobaias = totalCoelhos + totalRatos + totalSapos;
		percentualCoelhos = (double) 100 * totalCoelhos / totalCobaias;
		percentualRatos = (double) 100 * totalRatos / totalCobaias;
		percentualSapos = (double) 100 * totalSapos / totalCobaias;
		
		System.out.println("Total: " + totalCobaias + " cobaias");
		System.out.println("Total de coelhos: " + totalCoelhos);
		System.out.println("Total de ratos: " + totalRatos);
		System.out.println("Total de sapos: " + totalSapos);
		System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelhos);
		System.out.printf("Percentual de ratos: %.2f %%%n", percentualRatos);
		System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapos);
				
		sc.close();

	}

}
