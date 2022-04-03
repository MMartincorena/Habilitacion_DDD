package domain.usuario.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Caracteristicas implements ValueObject<Caracteristicas.Props> {
    private final String descripcion;

    public Caracteristicas(String descripcion) {
        this.descripcion = Objects.requireNonNull(descripcion);
        if(descripcion == null){
            throw new IllegalArgumentException("La descripción no puede estar vacía");
        }
    }

    @Override
    public Caracteristicas.Props value() {
        return null;
    }

    public interface Props {
    }
}
