
package org.example.massaToppings;

import org.example.tamanhoTipoMassa.TamanhoMassa;

public class QuatroQueijos extends MassaDecorator {

    public QuatroQueijos(Massa massa) {
        super(massa);
    }

    public double getPrecoAdicional() {
        return 12.0f;
    }

    public String getTopping() {
        return "Quatro Queijos";
    }


}