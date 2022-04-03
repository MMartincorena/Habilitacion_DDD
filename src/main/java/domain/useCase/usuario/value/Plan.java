package domain.useCase.usuario.value;

import co.com.sofka.domain.generic.ValueObject;

public class Plan implements ValueObject<Plan.Props> {
    private final String tipo;
    private final String tiempo;

    public Plan(String tipo, String tiempo) {
        this.tipo = tipo;
        this.tiempo = tiempo;
    }

    @Override
    public Plan.Props value() {
        return null;
    }

    public interface Props {
    }
}
