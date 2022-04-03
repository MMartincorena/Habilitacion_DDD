package domain.usuario.value;

import co.com.sofka.domain.generic.ValueObject;

public class Documento implements ValueObject<Plan.Props> {
    private final String tipo;
    private final Long numero;

    public Documento(String tipo, Long numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    @Override
    public Plan.Props value() {
        return null;
    }
    public interface Props {
    }
}
