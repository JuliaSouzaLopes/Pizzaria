package org.example.tipoPedido;

public class TipoPedidoRetirar implements ITipoPedido {

    public String getTipoPedido(){
        return "Retirar no restaurante";
    }

    public double getFrete(){
        return 0.0f;
    }

}