package domain.entrenador_Personalizado.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.Entrenador_PersonalizadoId;

public class EliminarE_Personalizado extends Command {
    private final Entrenador_PersonalizadoId entrenador_personalizadoId;

    public EliminarE_Personalizado(Entrenador_PersonalizadoId entrenador_personalizadoId) {
        this.entrenador_personalizadoId = entrenador_personalizadoId;
    }

    public Entrenador_PersonalizadoId getEntrenador_personalizadoId() {
        return entrenador_personalizadoId;
    }
}
