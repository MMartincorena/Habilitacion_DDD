package domain.usuario.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.UsuarioId;

public class EliminarUsuario extends Command {
    private final UsuarioId usuarioId;


    public EliminarUsuario(UsuarioId usuarioId) {
        this.usuarioId = usuarioId;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }
}
