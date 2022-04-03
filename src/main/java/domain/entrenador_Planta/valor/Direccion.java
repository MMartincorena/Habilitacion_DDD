package domain.entrenador_Planta.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<Direccion> {

    private final Direccion direccion;

    public Direccion(Direccion direccion) {
        this.direccion = Objects.requireNonNull(direccion);
    }

    @Override
    public Direccion value() {
        return null;
    }
}
