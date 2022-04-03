package domain.entrenador_Personalizado.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Precio> {

    private final Precio precio;

    public Precio(Precio precio) {
        this.precio = Objects.requireNonNull(precio);
    }

    @Override
    public Precio value() {
        return null;
    }

    public Precio getPrecio() {
        return precio;
    }
}
