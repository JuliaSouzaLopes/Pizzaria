package org.example.massaToppings;

import org.example.tamanhoTipoMassa.TamanhoMassa;

public abstract class MassaDecorator implements Massa {

    private Massa massa;

    public String sabor;

    public MassaDecorator(Massa massa) {
        this.massa = massa;
    }

    public Massa getMassa() {
        return massa;
    }

    public void setMassa(Massa massa) {
        this.massa = massa;
    }

    public abstract double getPrecoAdicional();

    public double getPreco() {
        return this.massa.getPreco() + this.getPrecoAdicional();
    }

    public abstract String getTopping();

    public String getSabor() {
        return this.massa.getSabor() + "/" + this.getTopping();
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

}