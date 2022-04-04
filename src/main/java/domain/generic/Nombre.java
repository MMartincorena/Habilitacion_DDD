package domain.generic;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre  implements ValueObject<Nombre.Props> {
    private final String nombre;
    private final String apellido;

    public Nombre(String nombre, String apellido) {
        this.nombre = Objects.requireNonNull(nombre);
        if(nombre == null){
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.apellido = Objects.requireNonNull(apellido);
        if(apellido == null){
            throw new IllegalArgumentException("El apellido no puede estar vacío");
        }
    }

    @Override
    public Nombre.Props value() {
        return null;
    }

    public interface Props {
    }
}
