package HerancaPolimorfismo.ingressoCinema;

public class Familia  extends Ingresso{
        private int qtdPessoas;

    public Familia(float valor, String nomeFilme, String dubladoOuLegendado, int qtdPessoas) {
        super(valor, nomeFilme, dubladoOuLegendado);
        this.qtdPessoas = qtdPessoas;
    }

    public void valorRealIgresso(){
        float valorReal= 0;
        if (this.qtdPessoas > 3) {

            valorReal =  (getValor() * this.qtdPessoas) * 0.95f;
            System.out.println(valorReal);
        }
        else {
            valorReal =  (getValor() * this.qtdPessoas);
            System.out.println(valorReal);
        }
    }
}
