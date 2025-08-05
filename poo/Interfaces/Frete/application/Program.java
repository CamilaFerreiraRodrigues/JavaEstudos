package application;

import models.entities.Frete;
import models.entities.OpcaoFrete;
import models.entities.Pedido;
import models.services.CorreioService;
import models.services.FreteService;
import models.services.JadlogService;
import models.services.PedidoService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Código ");
        int codPedido = sc.nextInt();
        System.out.print("Valor básico ");
        double valorPedido = sc.nextDouble();

        sc.nextLine();
        System.out.print("Transportadora (CORREIOS/JADLOG) ");

        try {
            OpcaoFrete frete = OpcaoFrete.valueOf(sc.nextLine().toUpperCase());
            Pedido pedido = new Pedido(codPedido, valorPedido);

            if (frete == OpcaoFrete.CORREIOS) {
                PedidoService pedidoService =  new PedidoService(new CorreioService());
                pedidoService.processarPedido(pedido);

            } else if (frete == OpcaoFrete.JADLOG) {
                PedidoService pedidoService =  new PedidoService(new JadlogService());
                pedidoService.processarPedido(pedido);
            }

            System.out.println("Resumo do pedido");
            System.out.println(pedido.getFrete());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Opção inválida. Use CORREIOS ou JADLOG.");
            return;
        }
            sc.close();
        }

}
