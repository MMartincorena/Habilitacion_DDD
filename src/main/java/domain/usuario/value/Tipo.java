package domain.usuario.value;

import co.com.sofka.domain.generic.ValueObject;

public class Tipo implements ValueObject<Tipo.Props> {
    private final Boolean propio;

    public Tipo(Boolean propio) {
        this.propio = propio;
    }

    @Override
    public Props value() {
        return null;
    }

    public interface Props{

    }
}
