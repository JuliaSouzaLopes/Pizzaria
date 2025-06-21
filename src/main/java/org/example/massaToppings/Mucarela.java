
package org.example.massaToppings;
public class Mucarela extends MassaDecorator {

    public Mucarela(Massa massa) {
        super(massa);
    }

    public float getPrecoAdicional() {
        return 2.0f;
    }

    public String getTopping() {
        return "Muçarela";
    }
}