
public class aliquotaIRPR {

	public static void main(String[] args) {

		double salario = 3300.0;

		if(salario >=1900.00 && salario <=2800.00) {
			System.out.println("Al�quita de 7.5% ");
			System.out.println("Pode deduzir na declara��o R$142,00 ");
		}
		if(salario >2800.00 && salario <=3751.00) {
			System.out.println("Al�quita de 15% ");
			System.out.println("Pode deduzir na declara��o R$350,00 ");
		}
		if(salario >3751.00 && salario <=4664.00) {
			System.out.println("Al�quita de 22.5% ");
			System.out.println("Pode deduzir na declara��o R$636,00 ");
		}
	}

}
