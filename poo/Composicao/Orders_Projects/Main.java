package org.Pedidos;


import org.composicao.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List<Order> orders = new ArrayList<>();

        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyy");


        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth Date (DD/MM/YYYY): ");
        String birthDate =  sc.nextLine();
        Date date = dt.parse(birthDate);

        System.out.println("---Enter order data---");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        System.out.print("How many items to this order: ");
        int hm_order =  sc.nextInt();

        Order order = new Order(status, new Client(name, email, date));

        for(int i = 1; i<= hm_order; i++){

            sc.nextLine();
            System.out.println("----Enter #" + i + " item data----");
            System.out.print("Product name: ");
            String product_name = sc.nextLine();

            System.out.print("Product price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            order.addItem(new OrderItem(quantity, new Product(product_name, price)));

        }

        System.out.println(order.toString());
        sc.close();
    }
}
