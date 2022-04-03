package domain.usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.generic.UsuarioId;
import domain.usuario.event.UsuarioCreado;
import domain.usuario.value.Direccion;
import domain.usuario.value.Documento;
import domain.usuario.value.Estado;
import domain.usuario.value.Nombre;


public class Usuario extends AggregateEvent<UsuarioId> {
    protected Estado estado;
    protected Nombre nombre;
    protected Direccion direccion;
    protected Documento documento;

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


    public Usuario(UsuarioId usuarioId, Estado estado, Nombre nombre, Direccion direccion, Documento documento) {
        super(usuarioId);
        appendChange(new UsuarioCreado(estado, nombre, direccion, documento)).apply();
    }
}
