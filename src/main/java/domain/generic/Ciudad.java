package domain.generic;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Ciudad implements ValueObject<String> {
    private final String ciudad;


    public Ciudad(String ciudad) {
        this.ciudad = Objects.requireNonNull(ciudad);
        if (ciudad == null) {
            throw new IllegalArgumentException("El nombre de la ciudad no puede estar vacía");
        }
    }

    @Override
    public String value() {
        return ciudad;
    }
}
