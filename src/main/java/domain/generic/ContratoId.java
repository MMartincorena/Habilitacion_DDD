package domain.generic;

import co.com.sofka.domain.generic.Identity;

public class ContratoId extends Identity {

    public ContratoId(String id) {
        super(id);
    }

    public ContratoId() {
    }

    public static ContratoId of(String id){
        return new ContratoId(id);
    }
}
