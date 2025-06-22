package org.example.tamanhoTipoMassa;
public class TipoMassaPizzaCone implements TipoMassa {

    public String getTipoMassa(){
        return "pizza cone";
    }

    public double modificadorPreco() {
        return 3.50f;
    }
}