package HerancaPolimorfismo.ingressoCinema;

import java.util.Scanner;

public class Main {
    public static void main( String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        Ingresso i1 = new Ingresso(25.0f, "Como treinar o seu Dragão", "Dublado");
        Ingresso i2 = new MeiaEntrada( 25.0f, "Cinderela", "Legendado");
        Ingresso i3 = new Familia(25.0f, "Viagem  para o Futuro", "Dublado", 5);

        Ingresso ingresso = null;

        while (true){
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Ingresso");
            System.out.println("2. Ingresso (Meia entrada)");
            System.out.println("3. Combo família");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o enter pendente

            switch (opcao) {
                case 1:
                    ingresso = i1;
                    ingresso.valorRealIgresso();
                    break;
                case 2:
                    ingresso = i2;
                    ingresso.valorRealIgresso();
                    break;
                case 3:
                    ingresso = i3;
                    ingresso.valorRealIgresso();
                    break;
                case 4:
                    System.out.println("Encerrando o sistema...");
                    return;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }


        }






    }


}
