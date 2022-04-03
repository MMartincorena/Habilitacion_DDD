package domain.usuario.value;

import co.com.sofka.domain.generic.Identity;

public class FranquiciaId extends Identity {

    public FranquiciaId(String id) {
        super(id);
    }

    public FranquiciaId() {
    }

    public static SaludId of(String id){
        return new SaludId(id);
    }
}
