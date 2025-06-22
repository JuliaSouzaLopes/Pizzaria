
package org.example.massaToppings;

import org.example.tamanhoTipoMassa.TamanhoMassa;

public class Mucarela extends MassaDecorator {

    public Mucarela(Massa massa) {
        super(massa);
    }

    public double getPrecoAdicional() {
        return 2.0f;
    }

    public String getTopping() {
        return "Muçarela";
    }


}