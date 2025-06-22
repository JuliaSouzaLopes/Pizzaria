package org.example.tipoPedido;

public class TipoPedidoFactory {

    public static ITipoPedido obterPedido(String pedido) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.tipoPedido.TipoPedido" + pedido);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo inexistente");
        }
        if (!(objeto instanceof ITipoPedido)) {
            throw new IllegalArgumentException("Tipo inválido");
        }
        return (ITipoPedido) objeto;
    }
    
    
}