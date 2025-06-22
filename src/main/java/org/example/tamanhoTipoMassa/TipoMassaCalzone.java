package org.example.tamanhoTipoMassa;
public class TipoMassaCalzone implements TipoMassa {

    public String getTipoMassa(){
        return "calzone";
    }

    public double modificadorPreco() {
        return 4.50f;
    }
}