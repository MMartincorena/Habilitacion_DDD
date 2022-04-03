package domain.usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.generic.UsuarioId;
import domain.usuario.event.*;
import domain.generic.Direccion;
import domain.generic.Documento;
import domain.usuario.value.Estado;
import domain.generic.Nombre;

import java.util.Objects;


public class Usuario extends AggregateEvent<UsuarioId> {
    protected Estado estado;
    protected Nombre nombre;
    protected Direccion direccion;
    protected Documento documento;


    // CREAR Usuario
    public Usuario(UsuarioId usuarioId) {
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

}
