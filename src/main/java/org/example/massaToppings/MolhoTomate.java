

public class MolhoTomate extends MassaDecorator {

    public MolhoTomate(Massa massa) {
        super(massa);
    }

    public float getPrecoAdicional() {
        return 2.0f;
    }

    public String getTopping() {
        return "Molho Tomate";
    }
}