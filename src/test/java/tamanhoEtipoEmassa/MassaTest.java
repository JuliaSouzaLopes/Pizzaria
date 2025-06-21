package tamanhoEtipoEmassa;

import org.example.massaToppings.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MassaTest {

    @Test
    void deveRetornarPrecoMassa () {
        Massa pizza = new MassaBase(6.0f);
        assertEquals(6.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarSaborMassa () {
        Massa pizza = new MassaBase(6.0f);
        assertEquals("Massa", pizza.getSabor());
    }

    @Test
    void deveRetornarPrecoMassaMolho () {
        Massa pizza = new MolhoTomate(new MassaBase(6.0f));
        assertEquals(8.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarSaborMassaMolho () {
        Massa pizza = new MolhoTomate(new MassaBase(6.0f));
        assertEquals("Massa/Molho Tomate", pizza.getSabor());
    }

    @Test
    void deveRetornarPrecoMassaMolhoMucarela () {
        Massa pizza = new Mucarela(new MolhoTomate(new MassaBase(6.0f)));
        assertEquals(10.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarSaborMassaMolhoMucarela () {
        Massa pizza = new Mucarela(new MolhoTomate(new MassaBase(6.0f)));
        assertEquals("Massa/Molho Tomate/Muçarela", pizza.getSabor());
    }

    @Test
    void deveRetornarPrecoMassaMolhoMucarelaCalabresa () {
        Massa pizza = new Calabresa(new Mucarela (new MolhoTomate(new MassaBase(6.0f))));
        assertEquals(20.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarSaborMassaMolhoMucarelaCalabresa () {
        Massa pizza = new Calabresa(new Mucarela(new MolhoTomate(new MassaBase(6.0f))));
        assertEquals("Massa/Molho Tomate/Muçarela/Calabresa", pizza.getSabor());
    }

    @Test
    void deveRetornarPrecoMassaMolhoMucarelaPortuguesa () {
        Massa pizza = new Portuguesa (new Mucarela (new MolhoTomate(new MassaBase(6.0f))));
        assertEquals(25.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarSaborMassaMolhoMucarelaPortuguesa () {
        Massa pizza = new Portuguesa(new Mucarela(new MolhoTomate(new MassaBase(6.0f))));
        assertEquals("Massa/Molho Tomate/Muçarela/Portuguesa", pizza.getSabor());
    }

    @Test
    void deveRetornarPrecoMassaMolhoMucarelaQuatroQueijos () {
        Massa pizza = new QuatroQueijos (new Mucarela (new MolhoTomate(new MassaBase(6.0f))));
        assertEquals(22.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarSaborMassaMolhoMucarelaQuatroQueijos () {
        Massa pizza = new QuatroQueijos(new Mucarela(new MolhoTomate(new MassaBase(6.0f))));
        assertEquals("Massa/Molho Tomate/Muçarela/Quatro Queijos", pizza.getSabor());
    }

    @Test
    void deveRetornarPrecoMassaChocolate() {
        Massa pizza = new Chocolate(new MassaBase(6.0f));
        assertEquals(14.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarSaborMassaChocolate () {
        Massa pizza = new Chocolate(new MassaBase(6.0f));
        assertEquals("Massa/Chocolate", pizza.getSabor());
    }

    @Test
    void deveRetornarPrecoMassaChocolateMorango () {
        Massa pizza = new Morango (new Chocolate(new MassaBase(6.0f)));
        assertEquals(19.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarSaborMassaChocolateMorango () {
        Massa pizza = new Morango(new Chocolate(new MassaBase(6.0f)));
        assertEquals("Massa/Chocolate/Morango", pizza.getSabor());
    }

}
