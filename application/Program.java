package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.CompanyPayer;
import entities.IndividualPayer;
import entities.TaxPayment;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayment> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char response = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(response == 'i') {
				System.out.print("Health expenditures: ");
				double hex = sc.nextDouble();
				list.add(new IndividualPayer(name, anualIncome, hex));
			}
			else{
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new CompanyPayer(name, anualIncome, employees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(TaxPayment tp : list) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.total()));
		}
		
		double sum = 0.0;
		for (TaxPayment tp : list) {
			sum += tp.total();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n", sum);
		
	 sc.close();
	}
}
