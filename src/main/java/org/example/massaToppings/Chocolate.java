package org.example.massaToppings;

import org.example.tamanhoTipoMassa.TamanhoMassa;

public class Chocolate extends MassaDecorator {

    public Chocolate(Massa massa) {
        super(massa);
    }

    public double getPrecoAdicional() {
        return 8.0f;
    }

    public String getTopping() {
        return "Chocolate";
    }


}