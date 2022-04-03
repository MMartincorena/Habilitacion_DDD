package domain.entrenador_Planta.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.generic.Entrenador_PlantaId;

public class E_PlantaEliminado extends DomainEvent {
    private final Entrenador_PlantaId entrenador_plantaId;

    public E_PlantaEliminado(Entrenador_PlantaId entrenador_plantaId) {
        super("domain.entrenador_planta.e_plantaeliminado");
        this.entrenador_plantaId = entrenador_plantaId;
    }

    public Entrenador_PlantaId getEntrenador_plantaId() {
        return entrenador_plantaId;
    }
}
