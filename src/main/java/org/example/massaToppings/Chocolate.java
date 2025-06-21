

public class Chocolate extends MassaDecorator {

    public Chocolate(Massa massa) {
        super(massa);
    }

    public float getPrecoAdicional() {
        return 8.0f;
    }

    public String getTopping() {
        return "Chocolate";
    }
}