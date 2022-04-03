package domain.usuario.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.UsuarioId;
import domain.usuario.value.Direccion;
import domain.usuario.value.Documento;
import domain.usuario.value.Estado;
import domain.usuario.value.Nombre;


public class CrearUsuario extends Command {
    private final UsuarioId usuarioId;
    private final Estado estado;
    private final Nombre nombre;
    private final Direccion direccion;
    private final Documento documento;

    public CrearUsuario(UsuarioId usuarioId, Estado estado, Nombre nombre, Direccion direccion, Documento documento) {
        this.usuarioId = usuarioId;
        this.estado = estado;
        this.nombre = nombre;
        this.direccion = direccion;
        this.documento = documento;
    }

    public UsuarioId UsuarioId() {
        return usuarioId;
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
