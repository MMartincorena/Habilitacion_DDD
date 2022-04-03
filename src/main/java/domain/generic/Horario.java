package domain.generic;

import co.com.sofka.domain.generic.ValueObject;

public class Horario implements ValueObject<String> {
    private final String horaInicio;
    private final String horaFinal;

    public Horario(String horaInicio, String horaFinal) {
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }


    @Override
    public String value() {
        return null;
    }
}
