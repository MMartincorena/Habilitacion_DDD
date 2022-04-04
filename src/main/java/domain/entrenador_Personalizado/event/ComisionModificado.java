package domain.entrenador_Personalizado.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.entrenador_Personalizado.value.Comision;
import domain.generic.Entrenador_PersonalizadoId;

public class ComisionModificado extends DomainEvent {
    private final Entrenador_PersonalizadoId entrenador_personalizadoId;
    private final Comision comision;

    public ComisionModificado(Entrenador_PersonalizadoId entrenador_personalizadoId, Comision comision) {
        super("domain.entrenador_personalizado.e_persaonalizadocreado");
        this.entrenador_personalizadoId = entrenador_personalizadoId;
        this.comision = comision;
    }

    public Entrenador_PersonalizadoId getEntrenador_personalizadoId() {
        return entrenador_personalizadoId;
    }

    public Comision getComision() {
        return comision;
    }
}
