package HerancaPolimorfismo.usuariosSistema;

public class Vendedor extends Funcionario{
        private  int qtdVendas;

    public Vendedor(String nome, String email, String senha){
        super(nome, email, senha, false); // usando o contrutor Funcionario
        this.qtdVendas = 0;
    }

    public void realizarVenda(int nVendas){
        setQtdVendas(getQtdVendas() + nVendas);
    }

    public void consultarVendas(){
        System.out.println("Quantidade de vendas: " + getQtdVendas());
    }


    @Override
    public String alterarDados() {
        return "";
    }

    @Override
    public String gerarRelatorio() {
        return  "Relaroio gerado (Vendedor) :)";
    }


    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }
}
