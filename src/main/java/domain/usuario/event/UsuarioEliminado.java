package domain.usuario.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.generic.UsuarioId;

public class UsuarioEliminado extends DomainEvent {
    private final UsuarioId usuarioId;


    public UsuarioEliminado(UsuarioId usuarioId) {
        super("domain.usuario.usuarioeliminado");
        this.usuarioId = usuarioId;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }
}
