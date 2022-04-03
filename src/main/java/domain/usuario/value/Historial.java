package domain.usuario.value;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class Historial implements ValueObject<Historial.Props> {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Historial(LocalDate fechaInicio, LocalDate fechaFin) {
        this.fechaInicio = Objects.requireNonNull(fechaInicio);
        if(fechaInicio == null){
            throw new IllegalArgumentException("Debe de existir una fecha de inicio");
        }
        this.fechaFin = fechaFin;
    }

    @Override
    public Historial.Props value() {
        return null;
    }

    public interface Props {
    }



}
