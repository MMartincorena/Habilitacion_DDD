package domain.useCase.usuario.command;

import co.com.sofka.domain.generic.Command;
import domain.useCase.generic.UsuarioId;
import domain.useCase.usuario.value.Documento;

public class ModificarDocumento extends Command {
    private final UsuarioId usuarioId;
    private final Documento documento;


    public ModificarDocumento(UsuarioId usuarioId, Documento documento) {
        this.usuarioId = usuarioId;
        this.documento = documento;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public Documento getDocumento() {
        return documento;
    }
}
