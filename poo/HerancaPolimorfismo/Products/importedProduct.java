package org.Products;

public class importedProduct extends Product {

    private double curtomsFee;

    public importedProduct(String name, double price, double curtomsFee) {
        super(name, price);
        this.curtomsFee = curtomsFee;
    }

    @Override
    public String priceTag(){
        return getName() + " $ " + getPrice() + " (Customa Fee: $" + getCurtomsFee()+" )";
    }

    public double getCurtomsFee() {
        return curtomsFee;
    }

    public void setCurtomsFee(double curtomsFee) {
        this.curtomsFee = curtomsFee;
    }
}
