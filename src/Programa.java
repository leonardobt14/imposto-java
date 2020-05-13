import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, prestservico, ganho, gastomedico, gastoedu, salariomensal, impsalario, impservico, impganho, imptotal, maxdedutivel, gastodedutivel;
		
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
		System.out.println("RELAT�RIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		if (impsalario == 0) {
			System.out.println("Imposto sobre sal�rio: Isento");
		} else {
		System.out.printf("Imposto sobre sal�rio: %.2f%n" , impsalario);
		}
		System.out.printf("Imposto sobre servi�os: %.2f%n" , impservico);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n" , impganho);

		imptotal = impsalario + impservico + impganho;
		
		maxdedutivel = imptotal * 0.3;
		gastodedutivel = gastomedico + gastoedu;
		
		System.out.println();
		System.out.println("DEDU��ES:");
		System.out.printf("M�ximo dedut�vel: %.2f%n" , maxdedutivel);
		System.out.printf("Gastos dedut�veis: %.2f%n" , gastodedutivel);
	}

}
