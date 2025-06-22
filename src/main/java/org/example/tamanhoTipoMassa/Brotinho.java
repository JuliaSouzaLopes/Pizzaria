package org.example.tamanhoTipoMassa;

public class Brotinho extends TamanhoMassa {

    public Brotinho(double precoBase) {
        super(precoBase);
    }

    public double calcularPreco() {
        return this.precoBase + (this.tipo.modificadorPreco());
    }

}