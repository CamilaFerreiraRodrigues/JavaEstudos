package models.services;

public class JadlogService implements FreteService{

    @Override
    public double calcularFrete(double valorBasico) {

        double valorFrete = 0;
        if (valorBasico < 100){
            valorFrete =20;
            
        }
        else if (valorBasico >= 100) {
            valorFrete = 12;
        }
        
        return valorFrete;
    }
}
