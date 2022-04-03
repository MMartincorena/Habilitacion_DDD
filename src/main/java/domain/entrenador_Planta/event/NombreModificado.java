package domain.entrenador_Planta.event;

import co.com.sofka.domain.generic.DomainEvent;

import domain.generic.Nombre;

public class NombreModificado extends DomainEvent {
    private final Nombre nombre;

    public NombreModificado(Nombre nombre) {
        super("domain.entrenadorplanta.nombremodificado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
