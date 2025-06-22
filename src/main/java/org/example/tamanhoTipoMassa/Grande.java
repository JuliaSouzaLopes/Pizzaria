package org.example.tamanhoTipoMassa;

public class Grande extends TamanhoMassa {

    public Grande(double precoBase) {
        super(precoBase);
    }

    public double calcularPreco() {
        return this.precoBase + (this.tipo.modificadorPreco());
    }

}