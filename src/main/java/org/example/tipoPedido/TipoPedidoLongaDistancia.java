package org.example.tipoPedido;

public class TipoPedidoLongaDistancia implements ITipoPedido {

    public String getTipoPedido(){
        return "Entrega a longa distância";
    }

    public double getFrete(){
        return 10.0f;
    }

}