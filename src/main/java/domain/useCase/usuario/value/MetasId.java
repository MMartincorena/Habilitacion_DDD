package domain.useCase.usuario.value;

import co.com.sofka.domain.generic.Identity;

public class MetasId extends Identity {

    public MetasId(String id) {
        super(id);
    }

    public MetasId() {
    }

    public static MetasId of(String id){
        return new MetasId(id);
    }
}
