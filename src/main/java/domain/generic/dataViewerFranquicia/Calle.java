package domain.generic.dataViewerFranquicia;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Calle implements ValueObject<String> {
    private final String calle;


    public Calle(String calle) {
        this.calle = Objects.requireNonNull(calle);
        if(calle == null){
            throw new IllegalArgumentException("El nombre de calle no puede estar vacía");
        }


}
@Override
    public String value() {
        return calle;
    }
}
