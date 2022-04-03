package domain.usuario.value;

import co.com.sofka.domain.generic.ValueObject;
import domain.generic.dataViewerFranquicia.Calle;
import domain.generic.dataViewerFranquicia.Numero;

import java.util.Objects;

public class Direccion implements ValueObject<Direccion.Props> {
    private final String calle;
    private final Long numero;

    public Direccion(String calle, Long numero) {
        this.calle = Objects.requireNonNull(calle);
        if(calle == null){
            throw new IllegalArgumentException("El nombre de calle no puede estar vacía");
        }
        this.numero = Objects.requireNonNull(numero);
        if(numero == null){
            throw new IllegalArgumentException("El numero de calle no puede estar vacía");
        }
    }

    @Override
    public Direccion.Props value(){
        return null;
    }

    public interface Props {
    }
}
