public class Medio extends Tamanho {

    public Medio(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase + (this.tipo.modificadorPreco());
    }

}