package domain.entrenador_Personalizado.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ValorNuevo implements ValueObject<ValorNuevo> {

    private final ValorNuevo valorNuevo;

    public ValorNuevo(ValorNuevo valorNuevo) {
        this.valorNuevo = Objects.requireNonNull(valorNuevo);
    }

    @Override
    public ValorNuevo value() {
        return null;
    }

    public ValorNuevo getValorNuevo() {
        return valorNuevo;
    }
}
