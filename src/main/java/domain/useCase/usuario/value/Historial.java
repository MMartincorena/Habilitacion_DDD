package domain.useCase.usuario.value;

import co.com.sofka.domain.generic.ValueObject;
import domain.generic.dataViewerUsuario.FechaInicio;

public class Historial implements ValueObject<Historial.Props> {
    private final FechaInicio fechaInicio;

    public Historial(FechaInicio fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public Historial.Props value() {
        return null;
    }

    public interface Props {
    }
}
