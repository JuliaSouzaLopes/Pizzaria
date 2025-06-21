package org.example.tamanhoTipoMassa;

public class Grande extends TamanhoMassa {

    public Grande(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase + (this.tipo.modificadorPreco());
    }

}