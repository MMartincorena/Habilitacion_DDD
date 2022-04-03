package domain.entrenador_Personalizado.entity;

import co.com.sofka.domain.generic.Entity;
import domain.entrenador_Personalizado.value.*;

public class Salud  extends Entity<SaludId> {

private Estado estado;
private Historial historial;
private CondicionesMedicas condicionesMedicas;

    public Salud(SaludId saludId, Estado estado, Historial historial, CondicionesMedicas condicionesMedicas) {
        super(saludId);
        this.estado = estado;
        this.historial = historial;
        this.condicionesMedicas = condicionesMedicas;
    }

    public Estado estado() {
        return estado;
    }


}
