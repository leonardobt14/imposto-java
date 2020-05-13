import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, prestservico, ganho, gastomedico, gastoedu, salariomensal, impsalario, impservico, impganho, imptotal, maxdedutivel, gastodedutivel;
		
		System.out.print("Renda anual com salário: ");
		salario = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		prestservico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		ganho = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		gastomedico = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		gastoedu = sc.nextDouble();
		
		salariomensal = salario / 12;

		
		if (salariomensal < 3000) {
			impsalario = 0;
		} 
		else if (salariomensal >= 3000 && salariomensal < 5000) {
			impsalario = salario * 0.1;
		} else {
			impsalario = salario * 0.2;
		}
		
		impservico = prestservico * 0.15;
		impganho = ganho * 0.2;
		
		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		if (impsalario == 0) {
			System.out.println("Imposto sobre salário: Isento");
		} else {
		System.out.printf("Imposto sobre salário: %.2f%n" , impsalario);
		}
		System.out.printf("Imposto sobre serviços: %.2f%n" , impservico);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n" , impganho);

		imptotal = impsalario + impservico + impganho;
		
		maxdedutivel = imptotal * 0.3;
		gastodedutivel = gastomedico + gastoedu;
		
		System.out.println();
		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f%n" , maxdedutivel);
		System.out.printf("Gastos dedutíveis: %.2f%n" , gastodedutivel);
	}

}
