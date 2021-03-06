package domain.generic;

import co.com.sofka.domain.generic.ValueObject;
import domain.usuario.value.Plan;

public class Documento implements ValueObject<Documento.Props> {
    private final String tipo;
    private final int numero;

    public Documento(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    @Override
    public Documento.Props value() {
        return null;
    }

    public interface Props {
    }
}
