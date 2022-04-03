package domain.generic.dataViewerUsuario;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Peso implements ValueObject<Integer> {
    private final Integer peso;

    public Peso(Integer peso) {
        this.peso = Objects.requireNonNull(peso);
        if(peso == null){
            throw new IllegalArgumentException("El peso no puede ser vacío");
        }
    }

    @Override
    public Integer value() {
        return peso;
    }
}