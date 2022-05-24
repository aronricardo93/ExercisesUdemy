package fixacao5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import fixacao5.entities.ImportedProduct;
import fixacao5.entities.Product;
import fixacao5.entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int numberProducts = sc.nextInt();
		
		for(int i = 1; i <= numberProducts; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i) ? ");
			char typeProduct = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(typeProduct == 'u') {
				System.out.print("Manufacture Date: ");
				Date date = sdf.parse(sc.next());
				products.add(new UsedProduct(name, price, date));
			}else if(typeProduct == 'i'){
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			}else {
				products.add(new Product(name, price));
			}		
		}
		System.out.println("\n\nPRICE TAGS:");
		for (Product prod : products) {
			System.out.println(prod.priceTag());
		}
		sc.close();
	}
}
