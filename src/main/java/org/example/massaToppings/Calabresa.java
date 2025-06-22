package org.example.massaToppings;

import org.example.tamanhoTipoMassa.TamanhoMassa;

public class Calabresa extends MassaDecorator {

    public Calabresa(Massa massa) {
        super(massa);
    }

    public double getPrecoAdicional() {
        return 10.0f;
    }

    public String getTopping() {
        return "Calabresa";
    }


}