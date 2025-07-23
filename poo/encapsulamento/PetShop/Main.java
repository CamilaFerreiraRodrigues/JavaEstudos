package encapsulamento.petshop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetMachine maquina = new PetMachine();
        Pet pet = null;


        int opcao;

        do {
            System.out.println("\n--- MENU PETSHOP ---");
            System.out.println("1. Abastecer água");
            System.out.println("2. Abastecer shampoo");
            System.out.println("3. Verificar nível da água");
            System.out.println("4. Verificar nível do shampoo");
            System.out.println("5. Colocar pet na máquina");
            System.out.println("6. Dar banho no pet");
            System.out.println("7. Retirar pet da máquina");
            System.out.println("8. Limpar máquina");
            System.out.println("9. Verificar se há pet no banho");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    maquina.abastecerAgua();
                    break;
                case 2:
                    maquina.abastecershampoo();
                    break;
                case 3:
                    maquina.verificaNivelAgual();
                    break;
                case 4:
                    maquina.verificarNivelShampoo();
                    break;
                case 5:
                    if (maquina.getPet() == null) {
                        System.out.print("Nome do pet: ");
                        String nome = scanner.nextLine();
                        System.out.print("Raça do pet: ");
                        String raca = scanner.nextLine();
                        System.out.print("Porte do pet: ");
                        String porte = scanner.nextLine();
                        pet = new Pet(nome, raca, porte);
                        maquina.colocarPetMaquina(pet);
                    } else {
                        System.out.println("Já existe um pet na máquina.");
                    }
                    break;
                case 6:
                    maquina.darBanho();
                    break;
                case 7:
                    maquina.retirarPetMaquina();
                    break;
                case 8:
                    maquina.limparMaquina();
                    break;
                case 9:
                    if (maquina.getPet() != null) {
                        maquina.temPetNoBanho();
                    } else {
                        System.out.println("Não há pet na máquina.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
