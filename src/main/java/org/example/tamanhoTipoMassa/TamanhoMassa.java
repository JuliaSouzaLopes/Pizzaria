

package org.example.tamanhoTipoMassa;

public abstract class TamanhoMassa {

    protected TipoMassa tipo;

    protected double precoBase;

    public TamanhoMassa(double precoBase) {
        this.precoBase = precoBase;
    }

    public TipoMassa getTipoMassa(){ return this.tipo;}

    public void setTipo(TipoMassa tipo) {
        this.tipo = tipo;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double calcularPreco(){return this.precoBase + this.getTipoMassa().modificadorPreco();}
}