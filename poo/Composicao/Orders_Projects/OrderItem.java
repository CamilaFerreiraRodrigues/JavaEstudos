package org.Pedidos;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private Integer quantity;
    private double priceTotal;

    //composição com o produto
    private Product product;

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.priceTotal = 0;
        this.product = product;
    }

    public double subTotal(){
        setPriceTotal(product.getPrice() * this.quantity);
        return getPriceTotal();

    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPriceTotal() {
        return priceTotal;
    }

    public void setPriceTotal(double price) {
        this.priceTotal = price;
    }

    @Override
    public String toString() {
        return
                product.getName() +", "+
                        " |Price: " + product.getPrice() + ", "+
                        " |Quantity: " + quantity +
                        " |Subtotal: " + this.subTotal();

    }
}
