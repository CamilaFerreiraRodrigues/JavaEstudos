package org.Pedidos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private final Client client;
    private final List<OrderItem> items =  new ArrayList<>();

    public Order(OrderStatus status, Client client) {
        this.moment = new Date();
        this.status = status;
        this.client = client;

    }

    public  void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        double total = 0;
        for(OrderItem t  :  items){
             total = total + t.getPriceTotal();
        }
        return total;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------- ORDER SUMAMARY ---------").append("\n");
        sb.append("Order momment: ").append(moment).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append("Client: ").append(client.getName()).append(" " + client.getBithDate() + " -- ").append(client.getEmail()).append("\n");
        sb.append("--------Order items--------").append("\n");
        for ( OrderItem i : items){
            sb.append(i.toString()).append("\n");
        }
        sb.append("\nTotal: ").append(total());


        return sb.toString();
    }
}
