package org.example.tamanhoTipoMassa;

public class TipoMassaFactory {

    public static TipoMassa obterMassa(String massa) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.tamanhoTipoMassa.TipoMassa" + massa);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo inexistente");
        }
        if (!(objeto instanceof TipoMassa)) {
            throw new IllegalArgumentException("Tipo inválido");
        }
        return (TipoMassa) objeto;
    }
    
    
}