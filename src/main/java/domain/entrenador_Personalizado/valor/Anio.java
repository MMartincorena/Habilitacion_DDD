package domain.entrenador_Personalizado.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Anio implements ValueObject<Anio> {

    private final Anio anio;

    public Anio(Anio anio) {
        this.anio = Objects.requireNonNull(anio);
    }

    @Override
    public Anio value() {
        return null;
    }
}
