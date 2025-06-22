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

    @BeforeEach
    void setUp(){
        pedido = new Pedido ();
        pedido.setEstado(EstadoPedidoRecebido.getInstance());
    }

    @Test
    void ValidarPedidoRecebidoQuandoPedidoRecebido(){
        pedido.receber();
        assertEquals ("recebido.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarPreparandoQuandoPedidoRecebido(){
        pedido.preparar();
        assertEquals ("em preparação.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarACaminhoQuandoPedidoRecebido(){
        pedido.encaminhar();
        assertEquals ("recebido.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarEntregueQuandoPedidoRecebido(){
        pedido.entregar();
        assertEquals ("recebido.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarCanceladoQuandoPedidoRecebido(){
        pedido.cancelar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarPedidoRecebidoQuandoPreparando(){
        pedido.setEstado(EstadoPedidoPreparacao.getInstance());
        pedido.receber();
        assertEquals ("em preparação.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarPreparandoQuandoPreparando(){
        pedido.setEstado(EstadoPedidoPreparacao.getInstance());
        pedido.preparar();
        assertEquals ("em preparação.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarACaminhoQuandoPreparando(){
        pedido.setEstado(EstadoPedidoPreparacao.getInstance());
        pedido.encaminhar();
        assertEquals ("a caminho.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarEntregueQuandoPreparando(){
        pedido.setEstado(EstadoPedidoPreparacao.getInstance());
        pedido.entregar();
        assertEquals ("em preparação.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarCanceladoQuandoPreparando(){
        pedido.setEstado(EstadoPedidoPreparacao.getInstance());
        pedido.cancelar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarPedidoRecebidoQuandoACaminho(){
        pedido.setEstado(EstadoPedidoCaminho.getInstance());
        pedido.receber();
        assertEquals ("a caminho.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarPreparandoQuandoACaminho(){
        pedido.setEstado(EstadoPedidoCaminho.getInstance());
        pedido.preparar();
        assertEquals ("a caminho.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarACaminhoQuandoACaminho(){
        pedido.setEstado(EstadoPedidoCaminho.getInstance());
        pedido.encaminhar();
        assertEquals ("a caminho.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarEntregueQuandoACaminho(){
        pedido.setEstado(EstadoPedidoCaminho.getInstance());
        pedido.entregar();
        assertEquals ("entregue.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarCanceladoQuandoACaminho(){
        pedido.setEstado(EstadoPedidoCaminho.getInstance());
        pedido.cancelar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarPedidoRecebidoQuandoEntregue(){
        pedido.setEstado(EstadoPedidoEntregue.getInstance());
        pedido.receber();
        assertEquals ("entregue.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarPreparandoQuandoEntregue(){
        pedido.setEstado(EstadoPedidoEntregue.getInstance());
        pedido.preparar();
        assertEquals ("entregue.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarACaminhoQuandoEntregue(){
        pedido.setEstado(EstadoPedidoEntregue.getInstance());
        pedido.encaminhar();
        assertEquals ("entregue.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarEntregueQuandoEntregue(){
        pedido.setEstado(EstadoPedidoEntregue.getInstance());
        pedido.entregar();
        assertEquals ("entregue.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarCanceladoQuandoEntregue(){
        pedido.setEstado(EstadoPedidoEntregue.getInstance());
        pedido.cancelar();
        assertEquals ("entregue.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarPedidoRecebidoQuandoCancelado(){
        pedido.setEstado(EstadoPedidoCancelado.getInstance());
        pedido.receber();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarPreparandoQuandoCancelado(){
        pedido.setEstado(EstadoPedidoCancelado.getInstance());
        pedido.preparar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarACaminhoQuandoCancelado(){
        pedido.setEstado(EstadoPedidoCancelado.getInstance());
        pedido.encaminhar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarEntregueQuandoCancelado(){
        pedido.setEstado(EstadoPedidoCancelado.getInstance());
        pedido.entregar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
    }

    @Test
    void ValidarCanceladoQuandoCancelado(){
        pedido.setEstado(EstadoPedidoCancelado.getInstance());
        pedido.cancelar();
        assertEquals ("cancelado.", pedido.getEstado().getEstado());
    }

}
