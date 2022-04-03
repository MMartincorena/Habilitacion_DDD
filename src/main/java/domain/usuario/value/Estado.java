package domain.usuario.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;


public class Estado implements ValueObject<Estado.Props> {
    private final int peso;
    private final int altura;



    public Estado(int peso, int altura) {
        this.peso = Objects.requireNonNull(peso);
        if(peso <= 0){
            throw new IllegalArgumentException("No puede haber peso menor o igual a 0");
        }
        this.altura = Objects.requireNonNull(altura);
        if(altura <= 0){
            throw new IllegalArgumentException("No puede haber una altura menor o igual a 0");
        }
    }


    @Override
    public Estado.Props value() {
        return null;
    }

    public interface Props {
    }
}
