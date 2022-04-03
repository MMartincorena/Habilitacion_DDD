package domain.entrenador_Planta;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.entrenador_Planta.event.E_PlantaCreado;
import domain.generic.*;


import java.util.Set;

public class Entrenador_Planta extends AggregateEvent<Entrenador_PlantaId> {
    protected Nombre nombre;
    protected Documento documento;
    protected Direccion direccion;
    protected Salario salario;
    protected Set<Horario> horarios;


    // CREAR Entrenador_Planta
    public Entrenador_Planta(Entrenador_PlantaId entrenador_PlantaId) {
        super(entrenador_PlantaId);
        appendChange(new E_PlantaCreado(nombre, documento, direccion, salario, horarios)).apply();
    }
}
