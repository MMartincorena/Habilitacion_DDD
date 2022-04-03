package domain.entrenador_Personalizado.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class RangoValorUsado implements ValueObject<RangoValorUsado> {

    private final RangoValorUsado rangoValorUsado;

    public RangoValorUsado(RangoValorUsado rangoValorUsado) {
        this.rangoValorUsado = Objects.requireNonNull(rangoValorUsado);
    }


    @Override
    public RangoValorUsado value() {
        return null;
    }

    public RangoValorUsado getRangoValorUsado() {
        return rangoValorUsado;
    }
}
