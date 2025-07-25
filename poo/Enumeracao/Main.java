package org.exemplo2;

import java.util.Date;



public class Main {
    public static void main(String[] args) {


        // estou  pegando o valor so status por meio da classe enum e já selecionando o valor :)
        Order order  = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);


        System.out.println(order.toString());}
}
