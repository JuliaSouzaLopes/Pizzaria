
package org.example.massaToppings;

import org.example.tamanhoTipoMassa.TamanhoMassa;

public class MassaBase implements Massa {

    public TamanhoMassa tamanho;

    public float preco;

    public MassaBase() {}

    public MassaBase (float preco) {
        this.preco = preco;
    }

    public MassaBase (TamanhoMassa tamanho) {
        this.tamanho = tamanho;
    }
    public double getPreco (){
        return preco + tamanho.calcularPreco();
    }

    public TamanhoMassa getTamanho(){
        return tamanho;
    }

    public void setTamanho (TamanhoMassa tamanho) {this.tamanho = tamanho;}
    public String getSabor () {
        return "Massa";
    }

}