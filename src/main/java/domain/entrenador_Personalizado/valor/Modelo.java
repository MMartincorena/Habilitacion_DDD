package domain.entrenador_Personalizado.valor;


import co.com.sofka.domain.generic.ValueObject;

public class Modelo implements ValueObject<Modelo> {

    private final Modelo modelo;

    public Modelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public Modelo value() {
        return null;
    }

    public Modelo getModelo() {
        return modelo;
    }
}
