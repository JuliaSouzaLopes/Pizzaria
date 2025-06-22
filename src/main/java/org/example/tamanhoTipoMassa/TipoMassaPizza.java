package org.example.tamanhoTipoMassa;

public class TipoMassaPizza implements TipoMassa {

    public String getTipoMassa(){
        return "pizza";
    }

    public double modificadorPreco() {
        return 2.50f;
    }
}