package domain.usuario.value;

import co.com.sofka.domain.generic.ValueObject;

public class Nombre  implements ValueObject<Nombre.Props> {
    private final String nombre;
    private final String apellido;

    public Nombre(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public Nombre.Props value() {
        return null;
    }

    public class Props {
    }
}
