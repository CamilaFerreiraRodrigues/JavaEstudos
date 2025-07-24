package HerancaPolimorfismo.usuariosSistema;

import java.util.Scanner;

public class Main {
    public static void main( String[] agrs) {

        Scanner scanner = new Scanner(System.in);

        // Criando alguns funcionários fixos para teste
        Gerente gerente = new Gerente("Camila", "camila@email.com", "1234");
        Vendedor vendedor = new Vendedor("Lucas", "lucas@email.com", "abcd");
        Atendente atendente = new Atendente("Paula", "paula@email.com", "xyz", 100.0);

        Funcionario usuarioLogado = null;

        while (true) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Login como Gerente");
            System.out.println("2. Login como Vendedor");
            System.out.println("3. Login como Atendente");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    usuarioLogado = gerente;
                    break;
                case 2:
                    usuarioLogado = vendedor;
                    break;
                case 3:
                    usuarioLogado = atendente;
                    break;
                case 4:
                    System.out.println("Encerrando o sistema...");
                    return;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            menuUsuario(usuarioLogado, scanner);
        }
    }

    public static void menuUsuario(Funcionario usuario, Scanner scanner) {
        while (true) {
            System.out.println("\n--- Menu do Usuário: " + usuario.getNome() + " ---");
            System.out.println("1. Realizar login");
            System.out.println("2. Alterar senha");
            System.out.println("3. Gerar relatório");
            System.out.println("4. Ações específicas");
            System.out.println("5. Sair da conta");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    usuario.realizarLogin();
                    break;
                case 2:
                    usuario.alterarSenha();
                    break;
                case 3:
                    try {
                        String relatorio = usuario.gerarRelatorio();
                        System.out.println(relatorio);
                    } catch (UnsupportedOperationException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 4:
                    if (usuario instanceof Vendedor) {
                        System.out.print("Quantas vendas deseja registrar? ");
                        int qtd = scanner.nextInt();
                        scanner.nextLine();
                        ((Vendedor) usuario).realizarVenda(qtd);
                        ((Vendedor) usuario).consultarVendas();
                    } else if (usuario instanceof Atendente) {
                        System.out.print("Valor do pagamento a receber: ");
                        double valor = scanner.nextDouble();
                        scanner.nextLine();
                        ((Atendente) usuario).receberPagamento(valor);
                        System.out.println("Valor no caixa: R$" + ((Atendente) usuario).getValorCaixa());
                    } else {
                        System.out.println("Sem ações específicas para este tipo de usuário.");
                    }
                    break;
                case 5:
                    usuario.realizarLogoff();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
