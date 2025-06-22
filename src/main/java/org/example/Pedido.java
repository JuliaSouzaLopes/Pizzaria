package org.example;

import org.example.estado.EstadoPedido;
import org.example.estado.EstadoPedidoRecebido;
import org.example.massaToppings.Massa;
import org.example.tipoPedido.ITipoPedido;

import java.util.Observable;
import java.util.Observer;

public class Pedido extends Observable {

    private EstadoPedido estado;
    private ITipoPedido tipoPedido;

    public Massa massa;
    public double precoTotal;
     
    

    public Pedido() {
         this.estado = EstadoPedidoRecebido.getInstance();
     }

    public Massa getMassa() { return this.massa; }

    public void setMassa (Massa massa) { this.massa = massa; }
    public ITipoPedido getTipo(){
        return this.tipoPedido;
     }

    public void setTipoPedido (ITipoPedido tipoPedido){
        this.tipoPedido = tipoPedido;
     }

    public double getPrecoTotal () {return tipoPedido.getFrete()+massa.getPreco();}

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
     }

    public boolean receber(){
        return estado.receber(this);
     }

    public boolean preparar(){
        return estado.preparar(this);
     }

    public boolean encaminhar(){
        return estado.encaminhar(this);
     }

    public boolean entregar(){
        return estado.entregar(this);
     }

    public boolean cancelar(){
        return estado.cancelar(this);
     }

    public String getNomeEstado(){
        return estado.getEstado();
     }

    public EstadoPedido getEstado(){
        return estado;
     }

    public void atualizacao() {
         setChanged();
         notifyObservers();
    }

}