package HerancaPolimorfismo.usuariosSistema;

public class Atendente extends Funcionario{
    private  double valorCaixa;


    public Atendente(String nome, String email, String senha, double valorCaixa) {
        super(nome, email, senha, false);
        this.valorCaixa = valorCaixa;
    }

    public void receberPagamento(double pagamento){
        setValorCaixa(getValorCaixa() + pagamento);
    }

    public void fecharCaixa(){
        System.out.println("Fechar caixa");
    }


    @Override
    public String alterarDados() {
        return "";
    }


    @Override
    public String gerarRelatorio() {
        throw new UnsupportedOperationException("Atendente não gera relatório.");
    }

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }
}
