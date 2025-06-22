package tamanhoEtipoEmassa;

import org.example.Pedido;
import org.example.tamanhoTipoMassa.Brotinho;
import org.example.tamanhoTipoMassa.TamanhoMassa;
import org.example.tamanhoTipoMassa.TipoMassa;
import org.example.tipoPedido.ITipoPedido;
import org.junit.jupiter.api.Test;

import static org.example.tamanhoTipoMassa.TipoMassaFactory.obterMassa;
import static org.example.tipoPedido.TipoPedidoFactory.obterPedido;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TipoMassaTest {

    @Test
    void deveRetornarMassaPizza () {
        TipoMassa tipoMassa = obterMassa("Pizza");
        Brotinho brotinho = new Brotinho(5.50);
        brotinho.setTipo(tipoMassa);
        assertEquals("pizza", brotinho.getTipoMassa().getTipoMassa());
    }

    @Test
    void deveRetornarMassaCalzone () {
        TipoMassa tipoMassa = obterMassa("Calzone");
        Brotinho brotinho = new Brotinho(5.50);
        brotinho.setTipo(tipoMassa);
        assertEquals("calzone", brotinho.getTipoMassa().getTipoMassa());
    }

    @Test
    void deveRetornarMassaPizzaCone () {
        TipoMassa tipoMassa = obterMassa("PizzaCone");
        Brotinho brotinho = new Brotinho(6.50);
        brotinho.setTipo(tipoMassa);
        assertEquals("pizza cone", brotinho.getTipoMassa().getTipoMassa());
    }

}
