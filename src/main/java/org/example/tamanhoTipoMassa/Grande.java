public class Grande extends Tamanho {

    public Grande(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase + (this.tipo.modificadorPreco());
    }

}