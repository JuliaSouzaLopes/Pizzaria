

public abstract class MassaDecorator implements Massa {

    private Massa massa;

    public String sabor;

    public MassaDecorator(Massa massa) {
        this.massa = massa;
    }

    public massa getMassa() {
        return massa;
    }

    public void setMassa(Massa massa) {
        this.massa = massa;
    }

    public abstract float getPrecoAdicional();

    public float getPreco() {
        return this.massa.getPreco() + this.getPrecoAdicional();
    }

    public abstract String getTopping();

    public String getSabor() {
        return this.massa.getSabor() + "/" + this.getTopping();
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

}