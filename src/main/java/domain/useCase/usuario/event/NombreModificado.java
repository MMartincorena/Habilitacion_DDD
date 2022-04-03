package domain.useCase.usuario.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.useCase.usuario.value.Nombre;

public class NombreModificado extends DomainEvent {
    private final Nombre nombre;


    public NombreModificado(Nombre nombre) {
        super("domain.usuario.nombremodificado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
