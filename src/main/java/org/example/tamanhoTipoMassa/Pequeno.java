package org.example.tamanhoTipoMassa;

public class Pequeno extends TamanhoMassa {

    public Pequeno(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase + (this.tipo.modificadorPreco());
    }

}