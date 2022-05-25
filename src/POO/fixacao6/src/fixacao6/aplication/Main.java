package fixacao6.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import fixacao6.entities.Pessoa;
import fixacao6.entities.PessoaFisica;
import fixacao6.entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int taxPayers = sc.nextInt();
		
		for(int i = 1; i <= taxPayers; i++) {
			System.out.println("Tax payer #" + i + " data");
			System.out.print("Individual or Company (i/c)? ");
			char person = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			
			if(person == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new PessoaFisica(name, anualIncome, healthExpenditures));
			}else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new PessoaJuridica(name, anualIncome, numberEmployees));
			}
		}
		
		System.out.println("\n\nTAXES PAID");
		int sum = 0;
		for(Pessoa pessoa : list) {
			System.out.println(pessoa.getNome() + ": $ " + pessoa.imposto());
			sum += pessoa.imposto();
		}
		System.out.println("TOTAL TAXES: $" + sum);
		
		sc.close();
	}
}
