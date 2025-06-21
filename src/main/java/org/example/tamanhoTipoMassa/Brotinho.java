public class Brotinho extends Tamanho {

    public Brotinho(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase + (this.tipo.modificadorPreco());
    }

}