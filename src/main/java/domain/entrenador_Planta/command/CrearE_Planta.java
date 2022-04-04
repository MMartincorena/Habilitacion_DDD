package domain.entrenador_Planta.command;

import co.com.sofka.domain.generic.Command;
import domain.entrenador_Planta.value.Salario;
import domain.generic.*;

import java.util.Set;

public class CrearE_Planta extends Command {
    private final Entrenador_PlantaId entrenador_plantaId;
    private final Nombre nombre;
    private final Documento documento;
    private final Direccion direccion;
    private final Salario salario;
    private final Set<Horario> horarios;

    public CrearE_Planta(Entrenador_PlantaId entrenador_plantaId, Nombre nombre, Documento documento, Direccion direccion, Salario salario, Set<Horario> horarios) {
        this.entrenador_plantaId = entrenador_plantaId;
        this.nombre = nombre;
        this.documento = documento;
        this.direccion = direccion;
        this.salario = salario;
        this.horarios = horarios;
    }

    public Entrenador_PlantaId getEntrenador_plantaId() {
        return entrenador_plantaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Documento getDocumento() {
        return documento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Salario getSalario() {
        return salario;
    }

    public Set<Horario> getHorarios() {
        return horarios;
    }
}
