package domain.entrenador_Planta.event;


import co.com.sofka.domain.generic.DomainEvent;
import domain.entrenador_Planta.value.Salario;
import domain.generic.Direccion;
import domain.generic.Documento;
import domain.generic.Horario;
import domain.generic.Nombre;

import java.util.Set;

public class E_PlantaCreado extends DomainEvent {
    private final Nombre nombre;
    private final Documento documento;
    private final Direccion direccion;
    private final Salario salario;
    private final Set<Horario> horarios;


    public E_PlantaCreado(Nombre nombre, Documento documento, Direccion direccion, Salario salario, Set<Horario> horarios) {
        super("domain.entrenado_planta.e_lantacreado");
        this.nombre = nombre;
        this.documento = documento;
        this.direccion = direccion;
        this.salario = salario;
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

    public Salario getSalario() {
        return salario;
    }

    public Set<Horario> getHorarios() {
        return horarios;
    }
}
