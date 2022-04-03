package domain.usuario.valor;

import co.com.sofka.domain.generic.ValueObject;

public class Cargo implements ValueObject<Cargo> {

    private final String cargo;

    public Cargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public Cargo value() {
        return null;
    }
}
