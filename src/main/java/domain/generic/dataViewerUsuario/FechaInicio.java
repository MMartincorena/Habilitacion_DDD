package domain.generic.dataViewerUsuario;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class FechaInicio implements ValueObject<LocalDate> {
    private final LocalDate fechaInicio;

    public FechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = Objects.requireNonNull(fechaInicio);
        if(fechaInicio == null){
            throw new IllegalArgumentException("La fecha de inicio no puede ser vacía");
        }
    }

    @Override
    public LocalDate value() {
        return fechaInicio;
    }
}
