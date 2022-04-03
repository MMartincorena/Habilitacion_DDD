package domain.useCase.usuario.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.useCase.usuario.value.Documento;

public class DocumentoModificado extends DomainEvent {
    private final Documento documento;


    public DocumentoModificado(Documento documento) {
        super("domain.usuario.documentomodificado");
        this.documento = documento;
    }

    public Documento getDocumento() {
        return documento;
    }
}
