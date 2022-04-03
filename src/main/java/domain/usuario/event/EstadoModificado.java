package domain.usuario.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.usuario.value.Estado;

public class EstadoModificado extends DomainEvent {
    private final Estado estado;


    public EstadoModificado(Estado estado) {
        super("domain.usuario.estadomodificado");
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
