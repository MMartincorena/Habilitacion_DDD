package domain.usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.generic.UsuarioId;
import domain.usuario.event.*;
import domain.generic.Direccion;
import domain.generic.Documento;
import domain.usuario.value.Estado;
import domain.generic.Nombre;

import java.util.List;
import java.util.Objects;


public class Usuario extends AggregateEvent<UsuarioId> {
    protected Estado estado;
    protected Nombre nombre;
    protected Direccion direccion;
    protected Documento documento;




    public static Usuario from(UsuarioId usuarioId, List<DomainEvent> events){
        var usuario = new Usuario(usuarioId);
        events.forEach(usuario::applyEvent);
        return usuario;
    }

    private Usuario(UsuarioId usuarioId){
        super(usuarioId);
        subscribe(new UsuarioChange(this));
    }

    // CREAR Usuario
    public Usuario(UsuarioId usuarioId, Estado estado, Nombre nombre, Direccion direccion, Documento documento) {
        super(usuarioId);
        appendChange(new UsuarioCreado(estado, nombre, direccion, documento)).apply();
    }


    // MODIFICAR documento
      public void modificarDocumento(UsuarioId usuarioId, Documento documento){
          Objects.requireNonNull(usuarioId);
          Objects.requireNonNull(documento);
        appendChange(new DocumentoModificado(documento)).apply();
    }

    // MODIFICAR estado
    public void modificarEstado(UsuarioId usuarioId, Estado estado){
        Objects.requireNonNull(usuarioId);
        Objects.requireNonNull(estado);
        appendChange(new EstadoModificado(estado)).apply();
    }

    // MODIFICAR nombre
    public void modificarNombre(UsuarioId usuarioId, Nombre nombre){
        Objects.requireNonNull(usuarioId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreModificado(nombre)).apply();
    }

    // ELIMINAR usuario
    public void eliminarUsuario(UsuarioId usuarioId){
        Objects.requireNonNull(usuarioId);
        appendChange(new UsuarioEliminado(usuarioId)).apply();
    }

    // Getters
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

    public void modificarNombre(Nombre nombre) {
        appendChange(new NombreModificado(nombre)).apply();
    }
}
