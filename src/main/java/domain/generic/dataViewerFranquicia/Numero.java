package domain.generic.dataViewerFranquicia;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Numero implements ValueObject<Long> {
    private final Long numero;

    public Numero(Long numero) {
        this.numero = Objects.requireNonNull(numero);
        if(numero == null){
            throw new IllegalArgumentException("El numero de la calle no puede ser vacio");
        }
    }

    @Override
    public Long value() {
        return numero;

    }
}
