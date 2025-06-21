

public class QuatroQueijos extends MassaDecorator {

    public QuatroQueijos(Massa massa) {
        super(massa);
    }

    public float getPrecoAdicional() {
        return 12.0f;
    }

    public String getTopping() {
        return "Quatro Queijos
        ";
    }
}