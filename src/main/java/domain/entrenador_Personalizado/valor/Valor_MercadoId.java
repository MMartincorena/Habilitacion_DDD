package domain.entrenador_Personalizado.valor;

import co.com.sofka.domain.generic.Identity;

public class Valor_MercadoId extends Identity {

    public Valor_MercadoId(){
    }

    private Valor_MercadoId(String id) {
        super(id);
    }

    public static Valor_MercadoId of(String id) {
        return new Valor_MercadoId(id);
    }

}
