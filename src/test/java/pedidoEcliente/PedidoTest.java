package pedidoEcliente;

import org.example.Pedido;
import org.example.tipoPedido.ITipoPedido;
import org.junit.jupiter.api.Test;

import static org.example.tipoPedido.TipoPedidoFactory.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PedidoTest {

    @Test
    void deveRetornarPedidoCurta () {
        ITipoPedido tipoPedido = obterPedido("CurtaDistancia");
        Pedido pedido = new Pedido ();
        pedido.setTipoPedido(tipoPedido);
        assertEquals("Entrega a curta distância", pedido.getTipo().getTipoPedido());
    }
}