package domain.usuario.valor;

import co.com.sofka.domain.generic.Identity;

public class MetaId extends Identity {

    public MetaId() {
    }

    private MetaId(String id) {
        super(id);
    }

    public static MetaId of(String id) {
        return new MetaId(id);
    }

}
