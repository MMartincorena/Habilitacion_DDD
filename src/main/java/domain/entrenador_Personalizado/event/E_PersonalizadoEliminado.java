package domain.entrenador_Personalizado.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.generic.Entrenador_PersonalizadoId;

public class E_PersonalizadoEliminado extends DomainEvent {
    private final Entrenador_PersonalizadoId entrenador_personalizadoId;

    public E_PersonalizadoEliminado(Entrenador_PersonalizadoId entrenador_personalizadoId) {
        super("domain.entrenador_personalizado.e_personalizadoeliminado");
        this.entrenador_personalizadoId = entrenador_personalizadoId;
    }

    public Entrenador_PersonalizadoId getEntrenador_personalizadoId() {
        return entrenador_personalizadoId;
    }
}
