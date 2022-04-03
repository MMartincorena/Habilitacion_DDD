package domain.entrenador_Personalizado.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Matricula implements ValueObject<Matricula> {

    private final Matricula matricula;

    public Matricula(Matricula matricula) {
        this.matricula = Objects.requireNonNull(matricula);
    }

    @Override
    public Matricula value() {
        return null;
    }

    public Matricula getMatricula() {
        return matricula;
    }
}
