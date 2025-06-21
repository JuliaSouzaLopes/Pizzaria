package pedidoEcliente;

import org.example.Cliente;
import org.example.Pedido;
import org.example.tipoPedido.ITipoPedido;
import org.example.tipoPedido.TipoPedidoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ClienteTest {

    @Test
    void deveNotificarCliente() {
        ITipoPedido tipoPedido = TipoPedidoFactory.obterPedido("CurtaDistancia");
        Pedido pedido = new Pedido ();
        pedido.setTipoPedido(tipoPedido);
        Cliente cliente = new Cliente ("Julia");
        cliente.fazerPedido(pedido);
        pedido.atualizacao();
        assertEquals("Julia, seu pedido está recebido.", cliente.ultimaNotificacao);
    }
}
