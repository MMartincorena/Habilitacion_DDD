package domain.generic;

import co.com.sofka.domain.generic.Identity;

public class Entrenador_PersonalizadoId extends Identity {

    private Entrenador_PersonalizadoId(String id){
        super(id);
    }

    public Entrenador_PersonalizadoId() {
    }

    public static Entrenador_PersonalizadoId of(String id) {
        return new Entrenador_PersonalizadoId(id);
    }
}
