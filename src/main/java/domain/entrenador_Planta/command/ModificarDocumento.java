package domain.entrenador_Planta.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.Documento;
import domain.generic.Entrenador_PlantaId;

public class ModificarDocumento extends Command {
    private final Entrenador_PlantaId entrenador_plantaId;

    private final Documento documento;

    public ModificarDocumento(Entrenador_PlantaId entrenador_plantaId, Documento documento) {
        this.entrenador_plantaId = entrenador_plantaId;
        this.documento = documento;
    }

    public Entrenador_PlantaId getEntrenador_plantaId() {
        return entrenador_plantaId;
    }

    public Documento getDocumento() {
        return documento;
    }
}
