package org.example.tamanhoTipoMassa;

public class Pequeno extends TamanhoMassa {

    public Pequeno(double precoBase) {super(precoBase);}

    public double calcularPreco() {
        return this.precoBase + (this.tipo.modificadorPreco());
    }

}