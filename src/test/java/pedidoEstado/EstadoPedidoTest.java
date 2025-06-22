package pedidoEstado;

import org.example.Cliente;
import org.example.Pedido;
import org.example.estado.EstadoPedidoRecebido;
import org.example.massaToppings.*;
import org.example.tipoPedido.ITipoPedido;
import org.example.tipoPedido.TipoPedidoFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class EstadoPedidoTest {

    private Pedido pedido;
    private Cliente cliente;
    private ITipoPedido tipoPedido;

    @BeforeEach
    void setUp(){
        cliente = new Cliente("Julia");
        pedido = new Pedido ();
        tipoPedido = TipoPedidoFactory.obterPedido("CurtaDistancia");
        cliente.fazerPedido(pedido);
        pedido.setTipoPedido(tipoPedido);
        pedido.setEstado(EstadoPedidoRecebido.getInstance());
    }

    @Test
    void ValidarPedidoRecebidoQuandoPedidoRecebido(){
        cliente.fazerPedido(pedido);
        pedido.receber();
        assertEquals ("recebido.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarPreparandoQuandoPedidoRecebido(){
        cliente.fazerPedido(pedido);
        pedido.receber();
        pedido.preparar();
        assertEquals ("em preparação.", pedido.getEstado().getEstado());
        assertEquals("Julia, seu pedido está em preparação.", cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarACaminhoQuandoPedidoRecebido(){
        cliente.fazerPedido(pedido);
        pedido.receber();
        pedido.encaminhar();
        assertEquals ("recebido.", pedido.getEstado().getEstado());
        assertNull (cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarEntregueQuandoPedidoRecebido(){
        cliente.fazerPedido(pedido);
        pedido.receber();
        pedido.entregar();
        assertEquals ("recebido.", pedido.getEstado().getEstado());
        assertNull (cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarCanceladoQuandoPedidoRecebido(){
        cliente.fazerPedido(pedido);
        pedido.receber();
        pedido.cancelar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
        assertEquals("Julia, seu pedido está cancelado.", cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarPedidoRecebidoQuandoPreparando(){
        cliente.fazerPedido(pedido);
        pedido.preparar();
        pedido.receber();
        assertEquals ("em preparação.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarPreparandoQuandoPreparando(){
        cliente.fazerPedido(pedido);
        pedido.preparar();
        assertEquals ("em preparação.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarACaminhoQuandoPreparando(){
        cliente.fazerPedido(pedido);
        pedido.preparar();
        pedido.encaminhar();
        assertEquals ("a caminho.", pedido.getEstado().getEstado());
        assertEquals("Julia, seu pedido está a caminho.", cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarEntregueQuandoPreparando(){
        cliente.fazerPedido(pedido);
        pedido.preparar();
        pedido.entregar();
        assertEquals ("a caminho.", pedido.getEstado().getEstado());
        assertNull (cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarCanceladoQuandoPreparando(){
        cliente.fazerPedido(pedido);
        pedido.preparar();
        pedido.cancelar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
        assertEquals("Julia, seu pedido está cancelado.", cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarPedidoRecebidoQuandoACaminho(){
        cliente.fazerPedido(pedido);
        pedido.encaminhar();
        pedido.receber();
        assertEquals ("a caminho.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarPreparandoQuandoACaminho(){
        cliente.fazerPedido(pedido);
        pedido.encaminhar();
        pedido.preparar();
        assertEquals ("a caminho.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarACaminhoQuandoACaminho(){
        cliente.fazerPedido(pedido);
        pedido.encaminhar();
        assertEquals ("a caminho.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarEntregueQuandoACaminho(){
        cliente.fazerPedido(pedido);
        pedido.encaminhar();
        pedido.entregar();
        assertEquals ("entregue.", pedido.getEstado().getEstado());
        assertEquals("Julia, seu pedido está entregue.", cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarCanceladoQuandoACaminho(){
        cliente.fazerPedido(pedido);
        pedido.encaminhar();
        pedido.cancelar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
        assertEquals("Julia, seu pedido está cancelado.", cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarPedidoRecebidoQuandoEntregue(){
        cliente.fazerPedido(pedido);
        pedido.entregar();
        pedido.receber();
        assertEquals ("entregue.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarPreparandoQuandoEntregue(){
        cliente.fazerPedido(pedido);
        pedido.entregar();
        pedido.preparar();
        assertEquals ("entregue.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarACaminhoQuandoEntregue(){
        cliente.fazerPedido(pedido);
        pedido.entregar();
        pedido.encaminhar();
        assertEquals ("entregue.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarEntregueQuandoEntregue(){
        cliente.fazerPedido(pedido);
        pedido.entregar();
        assertEquals ("entregue.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarCanceladoQuandoEntregue(){
        cliente.fazerPedido(pedido);
        pedido.entregar();
        pedido.cancelar();
        assertEquals ("entregue.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarPedidoRecebidoQuandoCancelado(){
        cliente.fazerPedido(pedido);
        pedido.cancelar();
        pedido.receber();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarPreparandoQuandoCancelado(){
        cliente.fazerPedido(pedido);
        pedido.cancelar();
        pedido.preparar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarACaminhoQuandoCancelado(){
        cliente.fazerPedido(pedido);
        pedido.cancelar();
        pedido.encaminhar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarEntregueQuandoCancelado(){
        cliente.fazerPedido(pedido);
        pedido.cancelar();
        pedido.entregar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarCanceladoQuandoCancelado(){
        cliente.fazerPedido(pedido);
        pedido.entregar();
        pedido.cancelar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

}
