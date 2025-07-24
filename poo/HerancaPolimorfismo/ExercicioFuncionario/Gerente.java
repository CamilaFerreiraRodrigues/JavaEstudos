package HerancaPolimorfismo.usuariosSistema;

import java.util.Scanner;

public class Gerente extends Funcionario{


    //Chamando metodo construtor da classe pai
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha,true); //aqui só passa os valores

    }

    @Override
    public String gerarRelatorio(){
        return  "Relarotorio gerado (Gerente) :)";
    }





    @Override
    public String alterarDados() {
        return "";
    }

}
