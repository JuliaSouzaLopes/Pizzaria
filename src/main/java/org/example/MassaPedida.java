package org.example;

import org.example.massaToppings.Massa;
import org.example.tamanhoTipoMassa.TamanhoMassa;

public class MassaPedida {

    public Massa massa;

    public TamanhoMassa tamanho;

    public MassaPedida() {}

    public Massa getMassa() { return this.massa; }

    public void setMassa (Massa massa) { this.massa = massa; }

    public TamanhoMassa getTamanho(){
        return tamanho;
    }

    public void setTamanho(TamanhoMassa tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco(){return massa.getPreco() + tamanho.calcularPreco();}

}
