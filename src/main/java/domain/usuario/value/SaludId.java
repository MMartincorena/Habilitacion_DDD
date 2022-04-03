package domain.usuario.value;

import co.com.sofka.domain.generic.Identity;

public class SaludId extends Identity {

    public SaludId(String id) {
        super(id);
    }

    public SaludId() {
    }

    public static SaludId of(String id) {
        return new SaludId(id);
    }

}
