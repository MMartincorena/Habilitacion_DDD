package domain.entrenador_Planta.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Historial implements ValueObject<Historial> {

    private final Historial historial;

    public Historial(Historial historial) {

        this.historial = Objects.requireNonNull(historial);
    }

    @Override
    public Historial value() {
        return null;
    }

    public Historial getHistorial() {
        return historial;
    }
}
