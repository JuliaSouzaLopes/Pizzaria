
package org.example.massaToppings;
public class Morango extends MassaDecorator {

    public Morango(Massa massa) {
        super(massa);
    }

    public double getPrecoAdicional() {
        return 5.0f;
    }

    public String getTopping() {
        return "Morango";
    }
}