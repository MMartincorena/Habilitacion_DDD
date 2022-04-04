package domain.entrenador_Personalizado.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.entrenador_Personalizado.value.Comision;
import domain.generic.Direccion;
import domain.generic.Documento;
import domain.generic.Horario;
import domain.generic.Nombre;

import java.util.Set;

public class E_PersonalizadoCreado extends DomainEvent{
    private final Nombre nombre;
    private final Documento documento;
    private final Direccion direccion;
    private final Comision comision;
    private final Set<Horario> horarios;


    public E_PersonalizadoCreado(Nombre nombre, Documento documento, Direccion direccion, Comision comision, Set<Horario> horarios) {
        super("domain.entrenadopersonalizado.e_personalizadocreado");
        this.nombre = nombre;
        this.documento = documento;
        this.direccion = direccion;
        this.comision = comision;
        this.horarios = horarios;
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
