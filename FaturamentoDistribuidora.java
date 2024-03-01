package target_sistemas;

public class FaturamentoDistribuidora {

	public static void main(String[] args) {

		double sp = 67836.43, rj = 36678.66, mg = 29559.88, es = 27165.48, outros = 19849.53;
		double soma = sp + rj + mg + es + outros;
		
		sp = (sp * 100)/soma;
		rj = (rj * 100)/soma;
		mg = (mg * 100)/soma;
		es = (es * 100)/soma;
		outros = (outros * 100)/soma;
		
		System.out.printf("A representação total que cada estado teve em porcentagem é de: "
		        + "\nSão Paulo: %.2f" + "%n"
		        + "Rio de Janeiro: %.2f" + "%n"
		        + "Minas Gerais: %.2f" + "%n"
		        + "Espírito Santo: %.2f" + "%n"
		        + "Outros: %.2f", sp, rj, mg, es, outros);

	}

}
