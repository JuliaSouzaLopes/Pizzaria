package pedidoEstado;

import org.example.Cliente;
import org.example.Pedido;
import org.example.estado.*;
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
        pedido.preparar();
        assertEquals ("em preparação.", pedido.getEstado().getEstado());
        assertEquals("Julia, seu pedido está em preparação.", cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarACaminhoQuandoPedidoRecebido(){
        cliente.fazerPedido(pedido);
        pedido.encaminhar();
        assertEquals ("recebido.", pedido.getEstado().getEstado());
        assertNull (cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarEntregueQuandoPedidoRecebido(){
        cliente.fazerPedido(pedido);
        pedido.entregar();
        assertEquals ("recebido.", pedido.getEstado().getEstado());
        assertNull (cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarCanceladoQuandoPedidoRecebido(){
        cliente.fazerPedido(pedido);
        pedido.cancelar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
        assertEquals("Julia, seu pedido está cancelado.", cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarPedidoRecebidoQuandoPreparando(){
        pedido.setEstado(EstadoPedidoPreparacao.getInstance());
        cliente.fazerPedido(pedido);
        pedido.receber();
        assertEquals ("em preparação.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarPreparandoQuandoPreparando(){
        pedido.setEstado(EstadoPedidoPreparacao.getInstance());
        cliente.fazerPedido(pedido);
        pedido.preparar();
        assertEquals ("em preparação.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarACaminhoQuandoPreparando(){
        pedido.setEstado(EstadoPedidoPreparacao.getInstance());
        cliente.fazerPedido(pedido);
        pedido.encaminhar();
        assertEquals ("a caminho.", pedido.getEstado().getEstado());
        assertEquals("Julia, seu pedido está a caminho.", cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarEntregueQuandoPreparando(){
        pedido.setEstado(EstadoPedidoPreparacao.getInstance());
        cliente.fazerPedido(pedido);
        pedido.entregar();
        assertEquals ("a caminho.", pedido.getEstado().getEstado());
        assertNull (cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarCanceladoQuandoPreparando(){
        pedido.setEstado(EstadoPedidoPreparacao.getInstance());
        cliente.fazerPedido(pedido);
        pedido.cancelar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
        assertEquals("Julia, seu pedido está cancelado.", cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarPedidoRecebidoQuandoACaminho(){
        pedido.setEstado(EstadoPedidoCaminho.getInstance());
        cliente.fazerPedido(pedido);
        pedido.receber();
        assertEquals ("a caminho.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarPreparandoQuandoACaminho(){
        pedido.setEstado(EstadoPedidoCaminho.getInstance());
        cliente.fazerPedido(pedido);
        pedido.preparar();
        assertEquals ("a caminho.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarACaminhoQuandoACaminho(){
        pedido.setEstado(EstadoPedidoCaminho.getInstance());
        cliente.fazerPedido(pedido);
        pedido.encaminhar();
        assertEquals ("a caminho.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarEntregueQuandoACaminho(){
        pedido.setEstado(EstadoPedidoCaminho.getInstance());
        cliente.fazerPedido(pedido);
        pedido.entregar();
        assertEquals ("entregue.", pedido.getEstado().getEstado());
        assertEquals("Julia, seu pedido está entregue.", cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarCanceladoQuandoACaminho(){
        pedido.setEstado(EstadoPedidoCaminho.getInstance());
        cliente.fazerPedido(pedido);
        pedido.cancelar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
        assertEquals("Julia, seu pedido está cancelado.", cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarPedidoRecebidoQuandoEntregue(){
        pedido.setEstado(EstadoPedidoEntregue.getInstance());
        cliente.fazerPedido(pedido);
        pedido.receber();
        assertEquals ("entregue.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarPreparandoQuandoEntregue(){
        pedido.setEstado(EstadoPedidoEntregue.getInstance());
        cliente.fazerPedido(pedido);
        pedido.preparar();
        assertEquals ("entregue.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarACaminhoQuandoEntregue(){
        pedido.setEstado(EstadoPedidoEntregue.getInstance());
        cliente.fazerPedido(pedido);
        pedido.encaminhar();
        assertEquals ("entregue.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarEntregueQuandoEntregue(){
        pedido.setEstado(EstadoPedidoEntregue.getInstance());
        cliente.fazerPedido(pedido);
        pedido.entregar();
        assertEquals ("entregue.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarCanceladoQuandoEntregue(){
        pedido.setEstado(EstadoPedidoEntregue.getInstance());
        cliente.fazerPedido(pedido);
        pedido.cancelar();
        assertEquals ("entregue.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarPedidoRecebidoQuandoCancelado(){
        pedido.setEstado(EstadoPedidoCancelado.getInstance());
        cliente.fazerPedido(pedido);
        pedido.receber();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarPreparandoQuandoCancelado(){
        pedido.setEstado(EstadoPedidoCancelado.getInstance());
        cliente.fazerPedido(pedido);
        pedido.preparar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarACaminhoQuandoCancelado(){
        pedido.setEstado(EstadoPedidoCancelado.getInstance());
        cliente.fazerPedido(pedido);
        pedido.encaminhar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarEntregueQuandoCancelado(){
        pedido.setEstado(EstadoPedidoCancelado.getInstance());
        cliente.fazerPedido(pedido);
        pedido.entregar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void ValidarCanceladoQuandoCancelado(){
        pedido.setEstado(EstadoPedidoCancelado.getInstance());
        cliente.fazerPedido(pedido);
        pedido.cancelar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

}
