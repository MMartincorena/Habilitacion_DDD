package domain.usuario.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.usuario.value.Direccion;
import domain.usuario.value.Documento;
import domain.usuario.value.Estado;
import domain.usuario.value.Nombre;

public class UsuarioCreado extends DomainEvent {
    private final Estado estado;
    private final Nombre nombre;
    private final Direccion direccion;
    private final Documento documento;

    public UsuarioCreado(Estado estado, Nombre nombre, Direccion direccion, Documento documento) {
        super("domain.usuario.usuariocreado");
        this.estado = estado;
        this.nombre = nombre;
        this.direccion = direccion;
        this.documento = documento;
    }

    public Estado Estado() {
        return estado;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Direccion Direccion() {
        return direccion;
    }

    public Documento Documento() {
        return documento;
    }
}
