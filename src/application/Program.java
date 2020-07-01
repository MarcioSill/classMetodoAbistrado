package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Fisica;
import entities.Imposto;
import entities.Juridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Imposto> list = new ArrayList<>();
		
		System.out.print("Enter the number para of tax payers: ");
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			System.out.println("Tax payer #"+ i +" data:");
			System.out.print("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Renda income: ");
			double rendaAno = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double gastoSaude = sc.nextDouble();
				list.add(new Fisica(name, rendaAno, gastoSaude));
			}
			else
			{
				System.out.print("Number of employees: ");
				int funcionario = sc.nextInt();
				list.add(new Juridica(name, rendaAno, funcionario));
			}
		}
			
			System.out.println();
			
			System.out.println("Taxes Paid:");
			
			for(Imposto imposto : list) {
				System.out.printf("%S: %.2f%n", imposto.getName(), imposto.impostoPago());
			}
			
			System.out.println();
			
			double sum = 0;			
			for(Imposto imposto : list) {
				sum += imposto.impostoPago();
			}
			
			System.out.printf("Total Taxea: $%.2f%n", sum);
			
		
		sc.close();

	}

}
