package domain.entrenador_Personalizado.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre_Marca implements ValueObject<Nombre_Marca> {

    private final Nombre_Marca nombre_marca;

    public Nombre_Marca(Nombre_Marca nombre_marca) {
        this.nombre_marca = Objects.requireNonNull(nombre_marca);
    }

    @Override
    public Nombre_Marca value() {
        return null;
    }

    public Nombre_Marca getNombre_marca() {
        return nombre_marca;
    }
}
