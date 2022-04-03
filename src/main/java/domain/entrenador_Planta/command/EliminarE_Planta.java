package domain.entrenador_Planta.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.Entrenador_PlantaId;

public class EliminarE_Planta extends Command {
    private final Entrenador_PlantaId entrenador_plantaId;

    public EliminarE_Planta(Entrenador_PlantaId entrenador_plantaId) {
        this.entrenador_plantaId = entrenador_plantaId;
    }

    public Entrenador_PlantaId getEntrenador_plantaId() {
        return entrenador_plantaId;
    }
}
