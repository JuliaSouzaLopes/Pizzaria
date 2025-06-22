package pedidoEcliente;

import org.example.MassaPedida;
import org.example.Pedido;
import org.example.massaToppings.*;
import org.example.tamanhoTipoMassa.Grande;
import org.example.tamanhoTipoMassa.TipoMassa;
import org.example.tipoPedido.ITipoPedido;
import org.junit.jupiter.api.Test;

import static org.example.tamanhoTipoMassa.TipoMassaFactory.obterMassa;
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

    @Test
    void deveRetornarPedidoLonga () {
        ITipoPedido tipoPedido = obterPedido("LongaDistancia");
        Pedido pedido = new Pedido ();
        pedido.setTipoPedido(tipoPedido);
        assertEquals("Entrega a longa distância", pedido.getTipo().getTipoPedido());
    }

    @Test
    void deveRetornarPedidoRetirar () {
        ITipoPedido tipoPedido = obterPedido("Retirar");
        Pedido pedido = new Pedido ();
        pedido.setTipoPedido(tipoPedido);
        assertEquals("Retirar no restaurante", pedido.getTipo().getTipoPedido());
    }

    @Test
    void deveRetornarPrecoTotal () {
        ITipoPedido tipoPedido = obterPedido("LongaDistancia");
        Pedido pedido = new Pedido ();
        pedido.setTipoPedido(tipoPedido);
        TipoMassa tipoMassa = obterMassa("Calzone");
        Grande grande = new Grande(8.00);
        grande.setTipo(tipoMassa);
        Massa massa = new Calabresa(new Mucarela(new MolhoTomate(new MassaBase(6))));
        MassaPedida massaPedida = new MassaPedida();
        massaPedida.setMassa(massa);
        massaPedida.setTamanho(grande);
        pedido.setMassaPedida(massaPedida);
        assertEquals(42.50, pedido.getPrecoTotal());
    }

}