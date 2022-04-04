package domain.entrenador_Personalizado.command;

import co.com.sofka.domain.generic.Command;
import domain.entrenador_Personalizado.value.Comision;
import domain.generic.*;

import java.util.Set;

public class CrearE_Personalizado extends Command {
    private final Entrenador_PersonalizadoId entrenador_personalizadoId;
    private final Nombre nombre;
    private final Documento documento;
    private final Direccion direccion;
    private final Comision comision;
    private final Set<Horario> horarios;

    public CrearE_Personalizado(Entrenador_PersonalizadoId entrenador_personalizadoId, Nombre nombre, Documento documento, Direccion direccion, Comision comision, Set<Horario> horarios) {
        this.entrenador_personalizadoId = entrenador_personalizadoId;
        this.nombre = nombre;
        this.documento = documento;
        this.direccion = direccion;
        this.comision = comision;
        this.horarios = horarios;
    }

    public Entrenador_PersonalizadoId getEntrenador_personalizadoId() {
        return entrenador_personalizadoId;
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

    public Comision getComision() {
        return comision;
    }

    public Set<Horario> getHorarios() {
        return horarios;
    }
}
