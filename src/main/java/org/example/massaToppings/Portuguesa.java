
package org.example.massaToppings;
public class Portuguesa extends MassaDecorator {

    public Portuguesa(Massa massa) {
        super(massa);
    }

    public float getPrecoAdicional() {
        return 15.0f;
    }

    public String getTopping() {
        return "Portuguesa";
    }
}