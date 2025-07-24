package HerancaPolimorfismo.usuariosSistema;

import java.util.Scanner;

public  abstract class  Funcionario{
    private String nome;
    private  String email;
    private String senha;
    private boolean adm;
    Scanner scanner = new Scanner(System.in);



    public abstract String alterarDados();
    public abstract String gerarRelatorio();

    public void realizarLogin() {
        System.out.println("Voce fez login");

    }

    public void realizarLogoff() {
        System.out.println("Voce fez login");
    }

    public void alterarSenha(){
        System.out.println("Sua antiga senha: " + this.getSenha());
        setSenha(scanner.nextLine());
        System.out.println("Senha alterada com sucesso: "+ getSenha());
    }


    public Funcionario(String nome, String email, String senha, boolean adm) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.adm = adm;
    }



    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
