package domain.entrenador_Planta.entity;

import co.com.sofka.domain.generic.Entity;
import domain.entrenador_Planta.value.PlantaId;
import domain.entrenador_Planta.value.TipoPlan;
import domain.generic.Caracteristicas;
import domain.generic.Horario;

import java.util.Set;

public class Plan_Entity extends Entity<PlantaId> {
    private TipoPlan tipoPlan;
    private Horario horario;
    private Caracteristicas caracteristicas;
    //private Set<Entrenador> entrenadores;


    public Plan_Entity(PlantaId entityId) {
        super(entityId);
    }
}
