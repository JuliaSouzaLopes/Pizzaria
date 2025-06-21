package org.example.tamanhoTipoMassa;

public class Brotinho extends TamanhoMassa {

    public Brotinho(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase + (this.tipo.modificadorPreco());
    }

}