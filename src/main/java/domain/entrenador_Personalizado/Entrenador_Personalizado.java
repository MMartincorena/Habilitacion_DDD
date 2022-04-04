package domain.entrenador_Personalizado;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.entrenador_Personalizado.event.E_PersonalizadoCreado;
import domain.entrenador_Personalizado.value.Comision;
import domain.generic.*;
import domain.usuario.event.UsuarioCreado;

import java.util.Set;

public class Entrenador_Personalizado extends AggregateEvent<Entrenador_PersonalizadoId> {
    protected Nombre nombre;
    protected Documento documento;
    protected Direccion direccion;
    protected Comision comision;
    protected Set<Horario> horarios;

   // CREAR Entrenador_Personalizado


    public Entrenador_Personalizado(Entrenador_PersonalizadoId entrenador_PersonalizadoId, Nombre nombre, Documento documento, Direccion direccion, Comision comision, Set<Horario> horarios) {
        super(entrenador_PersonalizadoId);
        appendChange(new E_PersonalizadoCreado(nombre, documento, direccion, comision, horarios)).apply();
    }

    // GETTERS
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
