package domain.entrenador_Planta.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoMedio implements ValueObject<Localizacion> {

private final String tipoMedio;

    public TipoMedio(String tipoMedio) {
        this.tipoMedio = Objects.requireNonNull(tipoMedio);
    }

    @Override
    public Localizacion value() {
        return null;
    }

}
