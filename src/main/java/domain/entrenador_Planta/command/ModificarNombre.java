package domain.entrenador_Planta.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.Entrenador_PlantaId;
import domain.generic.Nombre;

public class ModificarNombre extends Command {
    private final Entrenador_PlantaId entrenador_plantaId;
    private final Nombre nombre;


    public ModificarNombre(Entrenador_PlantaId entrenador_plantaId, Nombre nombre) {
        this.entrenador_plantaId = entrenador_plantaId;
        this.nombre = nombre;
    }

    public Entrenador_PlantaId getEntrenador_plantaId() {
        return entrenador_plantaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
