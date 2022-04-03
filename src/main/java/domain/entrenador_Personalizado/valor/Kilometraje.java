package domain.entrenador_Personalizado.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Kilometraje implements ValueObject<Kilometraje> {

    private final Kilometraje kilometraje;

    public Kilometraje(Kilometraje kilometraje) {
        this.kilometraje = Objects.requireNonNull(kilometraje);
    }

    @Override
    public Kilometraje value() {
        return null;
    }
}
