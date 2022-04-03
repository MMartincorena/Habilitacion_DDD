package domain.usuario.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.UsuarioId;
import domain.generic.Nombre;

public class ModificarNombre extends Command {
    private final UsuarioId usuarioId;
    private final Nombre nombre;

    public ModificarNombre(UsuarioId usuarioId, Nombre nombre) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
