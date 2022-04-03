package domain.entrenador_Planta.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoPlan implements ValueObject<String> {
    private final String tipoPlan;


    public TipoPlan(String tipoPlan) {
        this.tipoPlan = Objects.requireNonNull(tipoPlan);
        if(tipoPlan == null){
            throw new IllegalArgumentException("El tipo de plan no puede estar vacío");
        }
    }

    @Override
    public String value() {
        return null;
    }

}
