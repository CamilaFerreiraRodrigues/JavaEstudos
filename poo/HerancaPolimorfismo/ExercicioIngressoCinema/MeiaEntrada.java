package HerancaPolimorfismo.ingressoCinema;

import java.nio.channels.FileLock;

public class MeiaEntrada extends  Ingresso{

    public MeiaEntrada(float valor, String nomeFilme, String dubladoOuLegendado) {
        super(valor, nomeFilme, dubladoOuLegendado);
    }

    public void valorRealIgresso(){
        float valorReal =  (getValor()/2);
        System.out.println(valorReal);
    }
}
