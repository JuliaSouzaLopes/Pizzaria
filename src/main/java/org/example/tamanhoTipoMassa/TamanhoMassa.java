

package org.example.tamanhoTipoMassa;

public abstract class TamanhoMassa {

    protected TipoMassa tipo;

    protected float precoBase;

    public TamanhoMassa(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setTipo(TipoMassa tipo) {
        this.tipo = tipo;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public abstract float calcularPreco();
}