import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, prestservico, ganho, gastomedico, gastoedu;
		
		System.out.print("Renda anual com sal�rio: ");
		salario = sc.nextDouble();
		System.out.print("Renda anual com presta��o de servi�o: ");
		prestservico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		ganho = sc.nextDouble();
		System.out.print("Gastos m�dicos: ");
		gastomedico = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		gastoedu = sc.nextDouble();

	}

}
