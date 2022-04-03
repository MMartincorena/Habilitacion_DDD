package domain.useCase.usuario.command;

import co.com.sofka.domain.generic.Command;
import domain.useCase.generic.UsuarioId;
import domain.useCase.usuario.value.Estado;

public class ModificarEstado extends Command {
    private final UsuarioId usuarioId;
    private final Estado estado;


    public ModificarEstado(UsuarioId usuarioId, Estado estado) {
        this.usuarioId = usuarioId;
        this.estado = estado;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public Estado getEstado() {
        return estado;
    }
}
