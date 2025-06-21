package org.example.tamanhoTipoMassa;

public class Medio extends TamanhoMassa {

    public Medio(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase + (this.tipo.modificadorPreco());
    }

}