package org.example.tipoPedido;
public class TipoPedidoCurtaDistancia implements ITipoPedido {

    public String getTipoPedido(){
        return "Entrega a curta distância";
    }

    public float getFrete(){
        return 5.0;
    }
     
}