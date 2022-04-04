package domain.entrenador_Personalizado.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.generic.Entrenador_PersonalizadoId;
import domain.generic.Nombre;

public class NombreModificado extends DomainEvent {
    private Entrenador_PersonalizadoId entrenador_personalizadoId;
    private final Nombre nombre;

    public NombreModificado(Nombre nombre) {
        super("domain.entrenador_personalizado.nombremodificado");
        this.nombre = nombre;
    }


    public Entrenador_PersonalizadoId getEntrenador_personalizadoId() {
        return entrenador_personalizadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
