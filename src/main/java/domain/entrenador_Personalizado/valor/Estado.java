package domain.entrenador_Personalizado.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Estado implements ValueObject<Estado> {

    private final Estado estado;

    public Estado(Estado estado) {
        this.estado = Objects.requireNonNull(estado);
    }

    @Override
    public Estado value() {
        return null;
    }
}
