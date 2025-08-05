package models.services;

public class CorreioService implements FreteService{
    @Override
    public double calcularFrete(double valorBasico) {

        if (valorBasico < 200){
            return valorBasico * 0.15;
        }
        return 0;

    }
}
