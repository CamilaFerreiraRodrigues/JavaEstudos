package org.Products;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> products = new ArrayList<>();

        System.out.println("ENTER THE NUMBER OF PRODUCTS: ");
        int numProducts =  sc.nextInt();


        for (int i = 1; i<=numProducts; i++){
            sc.nextLine();
            System.out.println("Common, used or imported (c/u/i) ");
            String typeProduct = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            Product p1;
            if (Objects.equals(typeProduct, "i")){

                System.out.println("Custom fee: ");
                double customP = sc.nextDouble();
                p1 = new importedProduct(name, price, customP );
                products.add(p1);

            } else if (Objects.equals(typeProduct, "u")) {

                System.out.println("Manufacture date: ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                p1 =  new UsedProduct(name, price, date);
                products.add(p1);
            }
            else {
                products.add(p1 =new Product( name, price));
            }

        }

        System.out.println();
        System.out.println("ETIQUETAS DE PRECO:");
        for (Product p : products ){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
