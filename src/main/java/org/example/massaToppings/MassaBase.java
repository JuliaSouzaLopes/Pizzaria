
package org.example.massaToppings;

import org.example.tamanhoTipoMassa.TamanhoMassa;

public class MassaBase implements Massa {

    public double preco;

    public MassaBase(double preco) { this.preco = preco;}

    public void setPreco(float preco) {
        this.preco = preco;
    }
    public double getPreco (){
        return preco;
    }

    public String getSabor () {
        return "Massa";
    }


}