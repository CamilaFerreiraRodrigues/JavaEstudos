package models.services;

import models.entities.Frete;
import models.entities.OpcaoFrete;
import models.entities.Pedido;

public class PedidoService {

    private FreteService freteService;

    public PedidoService(FreteService freteService) {
        this.freteService = freteService;

    }

    public void processarPedido(Pedido pedido){

        double valorFrete = freteService.calcularFrete(pedido.getValorBasico());
        double valorTotal = valorFrete + pedido.getValorBasico();

        Frete frete = new Frete( valorFrete,valorTotal);
        pedido.setFrete(frete);



    }
}
