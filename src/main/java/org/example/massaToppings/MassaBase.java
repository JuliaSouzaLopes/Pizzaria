
package org.example.massaToppings;

import org.example.tamanhoTipoMassa.TamanhoMassa;

public class MassaBase implements Massa {

    public TamanhoMassa tamanho;

    public double getPreco() {
        return 0;
    }

    public MassaBase() {

    }

    public MassaBase (TamanhoMassa tamanho) {
        this.tamanho = tamanho;
    }

    public TamanhoMassa getTamanho(){
        return tamanho;
    }

    public String getSabor () {
        return "Massa";
    }

}