package models.entities;

public class Frete {
    private double valorFrete;
    private  double valorTotal;

    public Frete(double valorFrete, double valorTotal) {
        this.valorFrete = valorFrete;
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    @Override
    public String toString() {
        return
                "Valor do frete: " + valorFrete +"|"+
               "Valor total: " + valorTotal;


    }
}
