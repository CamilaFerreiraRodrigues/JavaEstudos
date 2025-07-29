package org.Products;

import java.time.LocalDate;
import java.util.Date;

public class UsedProduct extends Product {
        private LocalDate date;

    public UsedProduct(String name, double price, LocalDate data) {
        super(name, price);
        this.date = data;
    }

    @Override
    public String priceTag(){
        return getName() + " $ " + getPrice() + " (Manufacture date: " + getDate()+" )";
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
