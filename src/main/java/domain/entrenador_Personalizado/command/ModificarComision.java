package domain.entrenador_Personalizado.command;

import co.com.sofka.domain.generic.Command;
import domain.entrenador_Personalizado.value.Comision;
import domain.generic.Entrenador_PersonalizadoId;

public class ModificarComision extends Command {
    private final Entrenador_PersonalizadoId entrenador_personalizadoId;
    private final Comision comision;

    public ModificarComision(Entrenador_PersonalizadoId entrenador_personalizadoId, Comision comision) {
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
