package org.example.tamanhoTipoMassa;

public class Medio extends TamanhoMassa {

    public Medio(double precoBase) {
        super(precoBase);
    }

    public double calcularPreco() {
        return this.precoBase + (this.tipo.modificadorPreco());
    }

}