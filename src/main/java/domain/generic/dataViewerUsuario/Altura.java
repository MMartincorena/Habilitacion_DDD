package domain.generic.dataViewerUsuario;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Altura implements ValueObject<Integer> {
    private final Integer altura;

    public Altura(Integer altura) {
        this.altura = Objects.requireNonNull(altura);
        if(altura == null){
            throw new IllegalArgumentException("La altura no puede ser vacía");
        }
    }

    @Override
    public Integer value() {
        return altura;
    }
}

