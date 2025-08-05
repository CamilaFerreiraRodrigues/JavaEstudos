package models.entities;

public class Pedido {
    private int numero;
    private double valorBasico;

    private Frete frete;
    public Pedido(int numero, double valorBasico) {
        this.numero = numero;
        this.valorBasico = valorBasico;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValorBasico() {
        return valorBasico;
    }

    public void setValorBasico(double valorBasico) {
        this.valorBasico = valorBasico;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }
}
