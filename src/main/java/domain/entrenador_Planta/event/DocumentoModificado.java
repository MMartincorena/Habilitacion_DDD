package domain.entrenador_Planta.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.generic.Documento;

public class DocumentoModificado extends DomainEvent {
    private final Documento documento;

    public DocumentoModificado(Documento documento) {
        super("domain.entrenadorplanta.documentomodificado");
        this.documento = documento;
    }

    public Documento getDocumento() {
        return documento;
    }


}
