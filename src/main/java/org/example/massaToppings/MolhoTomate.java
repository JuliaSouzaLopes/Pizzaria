package org.example.massaToppings;

public class MolhoTomate extends MassaDecorator {

    public MolhoTomate(Massa massa) {
        super(massa);
    }

    public double getPrecoAdicional() {
        return 2.0f;
    }

    public String getTopping() {
        return "Molho Tomate";
    }
}