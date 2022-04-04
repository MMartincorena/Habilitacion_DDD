package domain.entrenador_Planta.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Salario implements ValueObject<Salario.Props> {
    private int valor;

    public Salario(int valor) {
        this.valor = Objects.requireNonNull(valor);
        if(valor <= 0){
            throw new IllegalArgumentException("Debe de existir una fecha de inicio");
        }
    }

    @Override
    public Salario.Props value() {
        return null;
    }

    public interface Props {
    }

}
