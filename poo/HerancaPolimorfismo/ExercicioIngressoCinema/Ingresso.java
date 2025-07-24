package HerancaPolimorfismo.ingressoCinema;

public class Ingresso {
    private float valor;
    private String nomeFilme;
    private  String dubladoOuLegendado;


    public Ingresso(float valor, String nomeFilme, String dubladoOuLegendado) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dubladoOuLegendado = dubladoOuLegendado;
    }

    public void valorRealIgresso(){
        System.out.println(getValor());
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getDubladoOuLegendado() {
        return dubladoOuLegendado;
    }

    public void setDubladoOuLegendado(String dubladoOuLegendado) {
        this.dubladoOuLegendado = dubladoOuLegendado;
    }
}
