package tamanhoEtipoEmassa;

import org.example.tamanhoTipoMassa.*;
import org.junit.jupiter.api.Test;

import static org.example.tamanhoTipoMassa.TipoMassaFactory.obterMassa;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TamanhoMassaTest {

    @Test
    void deveRetornarPrecoBrotinhoCalzone () {
        TipoMassa tipoMassa = obterMassa("Calzone");
        Brotinho brotinho = new Brotinho(5.50);
        brotinho.setTipo(tipoMassa);
        assertEquals("10.0", brotinho.calcularPreco());
    }

    @Test
    void deveRetornarPrecoPequenoPizza () {
        TipoMassa tipoMassa = obterMassa("Pizza");
        Pequeno pequeno = new Pequeno(6.00);
        pequeno.setTipo(tipoMassa);
        assertEquals("8.50", pequeno.calcularPreco());
    }

    @Test
    void deveRetornarPrecoMedioCone () {
        TipoMassa tipoMassa = obterMassa("PizzaCone");
        Medio medio = new Medio(7.00);
        medio.setTipo(tipoMassa);
        assertEquals("10.50", medio.calcularPreco());
    }

    @Test
    void deveRetornarPrecoGrandeCalzone () {
        TipoMassa tipoMassa = obterMassa("Calzone");
        Grande grande = new Grande(8.00);
        grande.setTipo(tipoMassa);
        assertEquals("12.50", grande.calcularPreco());
    }

}
