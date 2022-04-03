package domain.entrenador_Planta.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Documento implements ValueObject<Documento> {

    private final Documento documento;

    public Documento(Documento documento) {
        this.documento = Objects.requireNonNull(documento);
    }

    @Override
    public Documento value() {
        return null;
    }

    public Documento getDocumento() {
        return documento;
    }
}
