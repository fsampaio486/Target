package target_sistemas;

import java.util.Scanner;

public class FaturamentoEmpresa {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de dias do mês: ");
		int numDias = sc.nextInt();

		double[] faturamentoDiario = new double[numDias];

		for (int i = 0; i < numDias; i++) {
			System.out.print("Digite o faturamento do dia " + (i + 1) + ": ");
			faturamentoDiario[i] = sc.nextDouble();
		}

		double menorFaturamento = faturamentoDiario[0];
		double maiorFaturamento = faturamentoDiario[0];

		for (int i = 1; i < numDias; i++) {
			if (faturamentoDiario[i] < menorFaturamento) {
				menorFaturamento = faturamentoDiario[i];
			}
			if (faturamentoDiario[i] > maiorFaturamento) {
				maiorFaturamento = faturamentoDiario[i];
			}
		}

		double somaFaturamento = 0;
		int numDiasComFaturamento = 0;

		for (double faturamento : faturamentoDiario) {
			if (faturamento > 0) {
				somaFaturamento += faturamento;
				numDiasComFaturamento++;
			}
		}

		double mediaMensal = somaFaturamento / numDiasComFaturamento;

		int diasAcimaMedia = 0;

		for (double faturamento : faturamentoDiario) {
			if (faturamento > mediaMensal) {
				diasAcimaMedia++;
			}
		}

		System.out.println("Menor faturamento: " + menorFaturamento);
		System.out.println("Maior faturamento: " + maiorFaturamento);
		System.out.println("Número de dias com faturamento superior à média mensal: " + diasAcimaMedia);

		sc.close();
	}

}
