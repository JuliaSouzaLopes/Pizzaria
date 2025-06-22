
package org.example.massaToppings;

import org.example.tamanhoTipoMassa.TamanhoMassa;

public class Portuguesa extends MassaDecorator {

    public Portuguesa(Massa massa) {
        super(massa);
    }

    public double getPrecoAdicional() {
        return 15.0f;
    }

    public String getTopping() {
        return "Portuguesa";
    }


}